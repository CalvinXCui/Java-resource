package com.kanq.platform.authorize.util;


import org.junit.Test;

public class PlatformXmlModuleMakerUtilsTest {

	@Test
	public void test() {
		IPlatformModuleMaker platformModuleMaker = //
				PlatformXmlModuleMakerUtils.newInstance();

		platformModuleMaker.setVersion("1.2");//
		platformModuleMaker.setExpiration("2017-10-01");//
		platformModuleMaker.setLicense("企业版", "EVAL", "platform-1.0.0.RELEASE", "RELEASE.101", "苍穹-基础平台企业版");//
		platformModuleMaker.addMachineCode("00-00-00-00-00-00");//
		platformModuleMaker.addProduct("组织机构", "/basis", "管理人员部门");
		platformModuleMaker.addProduct("组织机构", "/classic", "管理人员部门");

		System.out.println(platformModuleMaker.toMakeXml());
	}

}
