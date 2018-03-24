package com.kanq.platform.authorize.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;

/**
 * 
 * @author ##
 *
 */
public class Authorize implements Serializable {

	private static final long serialVersionUID = 1219608733103342003L;

	/**
	 * 申请编号
	 *
	 */
	@GeneratedValue
	private String id;
	
	/**
	 * 系统名称
	 *
	 */
	private String sysName;
	
	/**
	 * 许可类型
	 *
	 */
	private String permissionType;
	
	/**
	 * 申请人
	 *
	 */
	private String proposer;
	
	/**
	 * 申请时间
	 *
	 */
	private String applicantTime;
	
	/**
	 * 申请单位
	 *
	 */
	private String applicantCompany;
	
	/**
	 * 项目名称
	 *
	 */
	private String projectName;
	
	/**
	 * 项目编号
	 *
	 */
	private String projectNo;
	
	/**
	 * 项目详情
	 *
	 */
	private String projectDetails;
	
	/**
	 * 机器码
	 *
	 */
	private String machineCode;
	
	/**
	 * 联系方式
	 *
	 */
	private String phone;
	
	/**
	 * 申请人邮箱
	 *
	 */
	private String mailBox;
	
	/**
	 * 备注
	 *
	 */
	private String note;
	
	/**
	 * 申请人编号
	 *
	 */
	private String proposerId;
	
	/**
	 * 审批人编号
	 *
	 */
	private String approverId;
	
	/**
	 * 当前时间
	 *
	 */
	private Date nowDate;
	
	/**
	 * 开始时间 
	 *
	 */
	private Date startTime;
	
	/**
	 * 结束时间
	 *
	 */
	private Date endTime;
	
	/**
	 * 许可状态
	 *
	 */
	private String licenseStatus;
	
	/**
	 * 反馈
	 *
	 */
	private String feedback;
	
	
	public String getId() {
		return id;
	}
	
	public String getSysName() {
		return sysName;
	}
	
	public String getPermissionType() {
		return permissionType;
	}
	
	public String getProposer() {
		return proposer;
	}
	
	public String getApplicantTime() {
		return applicantTime;
	}
	
	public String getApplicantCompany() {
		return applicantCompany;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public String getProjectNo() {
		return projectNo;
	}
	
	public String getProjectDetails() {
		return projectDetails;
	}
	
	public String getMachineCode() {
		return machineCode;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getMailBox() {
		return mailBox;
	}
	
	public String getNote() {
		return note;
	}
	
	public String getProposerId() {
		return proposerId;
	}
	
	public String getApproverId() {
		return approverId;
	}
	
	public Date getNowDate() {
		return nowDate;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public String getLicenseStatus() {
		return licenseStatus;
	}
	
	public String getFeedback() {
		return feedback;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	
	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}
	
	public void setProposer(String proposer) {
		this.proposer = proposer;
	}
	
	public void setApplicantTime(String applicantTime) {
		this.applicantTime = applicantTime;
	}
	
	public void setApplicantCompany(String applicantCompany) {
		this.applicantCompany = applicantCompany;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	
	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
	
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setMailBox(String mailBox) {
		this.mailBox = mailBox;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public void setProposerId(String proposerId) {
		this.proposerId = proposerId;
	}
	
	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}
	
	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}
	
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}
