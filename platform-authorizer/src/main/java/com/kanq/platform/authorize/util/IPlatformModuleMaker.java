package com.kanq.platform.authorize.util;

public interface IPlatformModuleMaker {

	/**
	 * 设置版本
	 * @param version 项目版本号
	 */
	public void setVersion(String version);

	/**
	 * 添加 新的产品信息
	 * @param name 项目名称
	 * @param url 项目url开头 全部(/*)
	 * @param description 描述
	 */
	public void addProduct(String name, String url, String description);

	/**
	 * 设置到期时间 
	 * @param expiration 到期时间(yyyy-mm-dd)
	 */
	public void setExpiration(String expiration);

	/**
	 * 设置许可
	 * @param edition 版本
	 * @param type 类型
	 * @param release 发行版本
	 * @param version 内部版本
	 * @param description 描述
	 */
	public void setLicense(//
		String edition, //
		String type, //
		String release, //
		String version, //
		String description);

	/**
	 * 添加 MAC
	 * @param code MAC地址
	 */
	public void addMachineCode(String code);

	/**
	 * 返回 许可
	 * @return
	 */
	public String toMakeXml();

}
