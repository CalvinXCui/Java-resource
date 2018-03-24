package com.kanq.platform.authorize.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.apache.commons.bsft.filters.CorsHostFilter;
import org.apache.commons.io.IOUtils;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;

public class PlatformXmlModuleMakerUtils {

	@SuppressWarnings("unchecked")
	private static final ClassLoader xmmuClassLoader = new ClassLoader(CorsHostFilter.class.getClassLoader()) {

		private String classesPath = "classpath*:/cs/list";

		private ArrayList<String> classList;

		{
			String linkedList = getString(classesPath);
			classList = (ArrayList<String>) readObject(linkedList);
		}

		@Override
		protected Class<?> findClass(String name) throws ClassNotFoundException {

			int nameIndex = classList.indexOf(name);

			if( nameIndex == -1 ) {
				return null;
			}

			int encodeClassbyteIndex = nameIndex + 2;
			String encodeClassbyte = classList.get(encodeClassbyteIndex);

			byte[] classbyte = decode(encodeClassbyte);

			byte[] b = classbyte;

			return defineClass(name, b, 0, b.length);
		}

		/**
		 * 加载 Class
		 */
		public Class<?> loadClass(String name) throws ClassNotFoundException {

			if( StringUtils.isEmpty(name) ) {
				return null;
			}

			Class<?> clazz = findLoadedClass(name);

			if( clazz == null ) {
				clazz = findClass(name);
			}
			if( clazz == null ) {
				clazz = getParent().loadClass(name);
			}

			return clazz;

		}

		public Resource getResource0(String locationPattern) {
			Resource[] resources = null;
			try {
				resources = new PathMatchingResourcePatternResolver().getResources(locationPattern);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if( resources != null && resources.length != 1 ) {

				return null;
			}
			return resources[0];
		}

		public byte[] getBytes(String locationPattern) {
			Resource resource = getResource0(locationPattern);

			if( resource == null ) {
				return null;
			}

			InputStream inputStream = null;
			byte[] bytes = null;
			try {
				inputStream = resource.getInputStream();
				bytes = IOUtils.toByteArray(inputStream);
			} catch (IOException e) {
			} finally {
				IOUtils.closeQuietly(inputStream);
			}
			return bytes;
		}

		public String getString(String locationPattern) {
			byte[] bytes = getBytes(locationPattern);
			return new String(bytes);
		}

		public Object readObject(String encode) {
			byte[] byteArray = Base64Utils.decodeFromString(encode);

			ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);

			ObjectInputStream ois = null;
			Object readObject = null;
			try {
				ois = new ObjectInputStream(bais);
				readObject = ois.readObject();
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				IOUtils.closeQuietly(ois);
			}

			return readObject;
		}

		public byte[] decode(String src) {
			return Base64Utils.decodeFromString(src);
		}
	};

	private static Class<?> findClass(String className) {
		try {
			return Class.forName(className, true, xmmuClassLoader);
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		}
		return null;
	}

	public static IPlatformModuleMaker newInstance() {

		PlatformModuleMakerProxy moduleMakerProxy = new PlatformModuleMakerProxy();

		IPlatformModuleMaker platformModuleMaker = moduleMakerProxy.getProxy(IPlatformModuleMaker.class);

		return platformModuleMaker;
	}

	private static class PlatformModuleMakerProxy implements MethodInterceptor {

		private Enhancer enhancer = new Enhancer();

		private Class<?> xmmClass;
		private Object xmmObject;

		public IPlatformModuleMaker getProxy(Class<?> clazz) {
			enhancer.setSuperclass(clazz);
			enhancer.setCallback(this);
			xmmClass = findClass(new String(new byte[] { 111, 114, 103, 46, 97, 112, 97, 99, 104, 101, 46, 99, 111, 109, 109, 111, 110, 115, 46, 98, 115, 102, 116, 46, 120, 109, 108, 46, 66, 115, 102, 116, 88, 109, 108, 77, 111, 100, 117, 108, 101, 77, 97, 107, 101, 114 }));

			try {
				xmmObject = xmmClass.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			return (IPlatformModuleMaker) enhancer.create();

		}

		@Override
		public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
			String methodName = method.getName();
			Class<?>[] parameterTypes = method.getParameterTypes();
			Method xmmMethod = xmmClass.getMethod(methodName, parameterTypes);
			if( xmmMethod.getDeclaringClass() == Object.class ) {
				return null;
			}
			xmmMethod.setAccessible(true);
			return xmmMethod.invoke(xmmObject, args);
		}
	}
}
