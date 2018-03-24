package com.kanq.platform.authorize.web.model.controller;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kanq.platform.authorize.model.Authorize;
import com.kanq.platform.authorize.query.AuthorizeQuery;
import com.kanq.platform.authorize.query.AuthorizeQuery.Criteria;
import com.kanq.platform.authorize.service.AuthorizeService;
import com.kanq.platform.authorize.util.IPlatformModuleMaker;
import com.kanq.platform.authorize.util.PlatformXmlModuleMakerUtils;
import com.kanq.platform.basis.common.base.web.controller.BaseModelController;
import com.kanq.platform.basis.common.messages.ResponseData;
import com.kanq.platform.basis.common.messages.ResponseDataContext;
import com.kanq.platform.basis.common.page.PagedResultHelper;
import com.kanq.platform.basis.common.page.PagedResultInfo;
import com.kanq.platform.supervision.statistics.util.ListSubPage;
import com.kanq.platform.supervision.statistics.util.WordGenerator;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("authorize")
public class AuthorizeModelController implements BaseModelController {

	/**
	 * mapping
	 */

	// mapping-end~


	/**
	 * 
	 */
	@Autowired
	private AuthorizeService authorizeService;

	private static final String QUERY_EXPORT_DATA = "queryExportData";
	private static final String DELETE_BY_IDS = "deleteByIds";
	private static final String INSERT_INTO = "insertInto";
	private static final String UPDATE_BY_ID = "updateById";
	private static final String EXPORT_AUTHORIZE="getData";
	
	private static WordGenerator wordGenerator = new WordGenerator();
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 插入信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(INSERT_INTO)
	public void insertInfo(@RequestParam("str") String jsonstr) throws Exception {
			JSONObject jsonObj=JSONObject.fromObject(jsonstr);
			Authorize authorize =new Authorize();
			//表单数据
			String sysName=jsonObj.getString("sysName");
			String permissionType=jsonObj.getString("permissionType");
			String start="";
			String end="";
			if(permissionType.equals("0")){
				start=jsonObj.getString("startTime");
				end =jsonObj.getString("endTime");
			}
			String proposer=jsonObj.getString("proposer");
			String applicationCompany=jsonObj.getString("applicationCompany");
			String projectName=jsonObj.getString("projectName");
			String projectNo=jsonObj.getString("projectNo");
			String machineCode=jsonObj.getString("machineCode");
			String phone=jsonObj.getString("phone");
			String mailBox=jsonObj.getString("mailBox");
			String projectDetails=jsonObj.getString("projectDetails");
			String note=jsonObj.getString("note");
			//提交时需要添加的数据
			
			String id=UUID.randomUUID().toString();//产品编号
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd @ HH:mm:ss");
			String ApplicantTimeString =sdf1.format(new Date());
			//向数据库添加表单上没有但需要添加的数据
			authorize.setId(id);//项目id 
			authorize.setProposerId(UUID.randomUUID().toString().replace("-", ""));//申请人编号
//			authorize.setApplicantTime(sdf1.parse(ApplicantTimeString));//申请时间
			authorize.setApplicantTime(ApplicantTimeString);//申请时间
			Date ss=sdf1.parse(ApplicantTimeString);
			System.out.println(ss);
			authorize.setNowDate(sdf1.parse(sdf1.format(new Date())));//当前系统时间
			authorize.setLicenseStatus("未授权");
			authorize.setFeedback("无");
			if(permissionType.equals("1")||permissionType.equals("永久")){
				authorize.setStartTime(new Date());
				authorize.setEndTime(sdf.parse("2199-12-31"));
			}else{
				authorize.setStartTime(sdf.parse(start));
				authorize.setEndTime(sdf.parse(end));
			}
			//将表单上的数据向库里添加数据
			authorize.setSysName(sysName);
			authorize.setPermissionType(permissionType);
			authorize.setProposer(proposer);
			if(applicationCompany.equals("")||null==applicationCompany){
				authorize.setApplicantCompany("无");
			}else{
				authorize.setApplicantCompany(applicationCompany);
			}
			authorize.setProjectName(projectName);
			authorize.setProjectNo(projectNo);
			authorize.setMachineCode(machineCode);
			authorize.setPhone(phone);
			authorize.setMailBox(mailBox);
			if(projectDetails.equals("")||null==projectDetails){
				authorize.setProjectDetails("无");
			}else{
				authorize.setProjectDetails(projectDetails);
			}
			if(note.equals("")||null==note){
				authorize.setNote("无");
			}else{
				authorize.setNote(note);
			}
			authorizeService.insert(authorize);
			/*int count = authorizeService.insert(authorize);

			// 返回数据
			ResponseData responseData = ResponseDataContext.getResponseData();
			responseData.writeData(count);
			responseData.setMessage("申请成功，请耐心等待!");
			return responseData;*/
	}
	/**
	 * 根据ids信息删除数据
	 * @param ids
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(DELETE_BY_IDS)
	public String deleteByIds(String id) throws Exception {//{[],[],[]}
		int counts=0;
		for(int i=0;i<id.split(",").length;i++){
			counts++;
			String pId=id.split(",")[i];
			Criteria criteria=AuthorizeQuery.createOneCriteria();
			criteria.andIdEqualTo(pId);
			authorizeService.deleteByCriteria(criteria);
		}
		return "成功删除："+counts+"条信息。";
	}
	
	/**
	 * 信息修改
	 * @param jsonstr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(UPDATE_BY_ID)
	public String updateById(String jsonstr) throws Exception {//更新的串待确定
		Authorize authorize =new Authorize();
		String returnstr="";
		JSONObject jsonObj=JSONObject.fromObject(jsonstr);
		/*"id":"796b0d99-84f1-499f-83b4-af0c328ab802",
		"permissionType":"临时",
		"startTime":"2017-11-07",
		"endTime":"2199-01-01",
		"licenseStatus":"已授权",
		"feedback":"\"null\""}*/
		
		String id=jsonObj.getString("id");
//		String sysName=jsonObj.getString("sysName");
		String permissionType=jsonObj.getString("permissionType");
//		String proposer=jsonObj.getString("proposer");
//		String applicationCompany=jsonObj.getString("applicationCompany");
//		String projectNo=jsonObj.getString("projectNo");
//		String machineCode=jsonObj.getString("machineCode");
//		String phone=jsonObj.getString("phone");
//		String mailBox=jsonObj.getString("mailBox");
//		String projectDetails=jsonObj.getString("projectDetails");
//		String note=jsonObj.getString("note");
		String licenseStatus=jsonObj.getString("licenseStatus");
		String feedback=jsonObj.getString("feedback");
//		String projectName=jsonObj.getString("projectName");
		String startTime="";
		String endTime="";
		if(permissionType.equals("0")||permissionType.equals("临时")){
			startTime=jsonObj.getString("startTime");
			endTime =jsonObj.getString("endTime");
		}
		//添加值
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd @ HH:mm:ssa");
		authorize.setProposerId(UUID.randomUUID().toString().replace("-", ""));
		authorize.setApproverId(UUID.randomUUID().toString().substring(0, 32));
//		authorize.setApplicantTime(sdf1.parse(sdf1.format(new Date())));//申请时间
		authorize.setApplicantTime(sdf1.format(new Date()));//申请时间
		authorize.setNowDate(sdf1.parse(sdf1.format(new Date())));//系统当前时间
		//表单的值
//		authorize.setSysName(sysName);//申请的系统名称
		authorize.setPermissionType(permissionType);//申请类型
//		authorize.setProposer(proposer);//申请人
//		authorize.setApplicantCompany(applicationCompany);//申请单位
//		authorize.setProjectName(projectName);//项目名称
//		authorize.setProjectNo(projectNo);//项目编号
//		authorize.setMachineCode(machineCode);//机器码
//		authorize.setPhone(phone);//联系方式
//		authorize.setMailBox(mailBox);//邮箱
//		authorize.setProjectDetails(projectDetails);//项目详情
//		authorize.setNote(note);//备注
		authorize.setLicenseStatus(licenseStatus);//许可状态
		if(feedback==""||"".equals(feedback)){
			authorize.setFeedback("无");//反馈信息
		}else{
			authorize.setFeedback(feedback);//反馈信息
		}
		
		if(permissionType.equals("0")||permissionType.equals("临时")){
			authorize.setStartTime(sdf.parse(startTime));
			authorize.setEndTime(sdf.parse(endTime));
		}else{
			authorize.setStartTime(new Date());
			authorize.setEndTime(sdf.parse("2199-01-01"));
		}
		authorizeService.updateByCriteriaSelective(authorize, AuthorizeQuery.createOneCriteria().andIdEqualTo(id));
		return returnstr;
	}
	
	/**
	 * 查询所有信息
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value=QUERY_ALL,produces = "text/plain;charset=UTF-8")
	public String queryAll(HttpServletRequest request) throws Exception {
		//对象初始化
//		String diyname=request.getParameter("searchdata");
		String rowsStrs="";
		int pagesize=0;//每页几条数据
		if(request.getParameter("pagesize")!=null && request.getParameter("pagesize")!=""){
			pagesize=Integer.valueOf(request.getParameter("pagesize"));
		}
		int currentPage=0;//第几页
		if(request.getParameter("pagenum")!=null && request.getParameter("pagenum")!=""){
			currentPage=Integer.valueOf(request.getParameter("pagenum"));
		}
		//赋值
		AuthorizeQuery query = new AuthorizeQuery();
		query.createOrderByCriteria().andApplicantTimeDesc();
		List<Authorize> list_old = authorizeService.selectListByQuery(query);
		int totalCount=list_old.size();//总数据
		List<Authorize> list =new ListSubPage().fenyeObj(list_old, pagesize, currentPage);
		for(int i=0;i<list.size();i++){
			String id=list.get(i).getId();//项目名称
			String projectName=list.get(i).getProjectName();//项目名称
			String projectNo=list.get(i).getProjectNo();//项目名称
			String proposer=list.get(i).getProposer();//申请人
			String sysName=list.get(i).getSysName();//产品名称
			String permissionType=list.get(i).getPermissionType();//许可类型
			if(permissionType.equals("1")){
				permissionType="永久";
			}else{
				permissionType="临时";
			}
			String applicationCompany=list.get(i).getApplicantCompany();//申请单位
			String projectDetails=list.get(i).getProjectDetails();//申请单位
			Date start=list.get(i).getStartTime();//申请单位
			Date end=list.get(i).getEndTime();//申请单位
			String machineCode=list.get(i).getMachineCode();//机器码
			String phone=list.get(i).getPhone();//联系方式
			String mailBox=list.get(i).getMailBox();//邮箱
//			Date applicantTime=list.get(i).getApplicantTime();//申请时间
			String applicantTime=list.get(i).getApplicantTime();//申请时间
			String licenseStatus=list.get(i).getLicenseStatus();//许可状态
			String feedback=list.get(i).getFeedback();//反馈信息
			String note=list.get(i).getNote();//备注
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time="";
			String startTime="";
			String endTime="";
			if(applicantTime!=null){
//				time = formatter.format(applicantTime);
				time=applicantTime;
			}
			if(start!=null){
				startTime = formatter.format(start);
			}
			if(end!=null){
				endTime = formatter.format(end);
			}
			String rowsStr="{\"note\": \""+note+"\",\"applicationCompany\": \""+applicationCompany+"\",\"projectNo\": \""+projectNo+"\",\"startTime\": \""+startTime+"\",\"endTime\": \""+endTime+"\",\"projectDetails\": \""+projectDetails+"\","
					+ "\"projectName\": \""+projectName+"\",\"proposer\": \""+proposer+"\",\"id\": \""+id+"\",\"sysName\": \""+sysName+"\","+ "\"permissionType\": \""+permissionType+"\","
					+ "\"machineCode\": \""+machineCode+"\",\"phone\": \""+phone+"\",\"mailBox\": \""+mailBox+"\",\"applicantTime\": \""+time+"\",\"licenseStatus\": \""+licenseStatus+"\""
							+ ",\"feedback\": \""+feedback+"\"}";
	    	if(i==0){
	    		rowsStrs=rowsStr;
	    	}else{
	    		rowsStrs=rowsStrs+","+rowsStr;
	    	}
		}
		String jsonStr="{\"total\":"+totalCount+",\"rows\":["+rowsStrs+"]}";
		return jsonStr;
	}
	/**
	 * 导出授权
	 * @param response
	 * @param startdata
	 * @param enddata
	 * @throws Exception
	 */
	@RequestMapping(value =EXPORT_AUTHORIZE , produces = "text/plain;charset=UTF-8")
	public void getAuthorizer(HttpServletResponse response) throws Exception{
		
		List<Map<Object,Object>> authorizeData = authorizeService.getAuthorize();
		
		Map<Object, Object> authorizeMap = new HashMap<>();
		
		String djlxtjFtl = "授权管理.ftl";
		
		//将导出的数据存到djlxtj的MAP集合中
		authorizeMap.put("authorizeData", authorizeData);
		
		/*HSSFWorkbook wb = export1(authorizeData);*/
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-disposition", "attachment;filename="
				+ new String(("授权管理").getBytes("GBK"), "ISO8859-1") + ".xls");
		OutputStream ouputStream = response.getOutputStream();
		/*wb.write(ouputStream);*/
		wordGenerator.createDoc(authorizeMap, djlxtjFtl, ouputStream);
		ouputStream.flush();
		ouputStream.close();
	}
	/**
	 * 导出数据
	 * @param parentId
	 * @param childId
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(QUERY_EXPORT_DATA)
	public void queryExportData(String id, HttpServletResponse response) throws Exception {
		
		Authorize authorize = authorizeService.selectByPrimaryKey(id);
		
		IPlatformModuleMaker platformModuleMaker = //
				PlatformXmlModuleMakerUtils.newInstance();
		
		platformModuleMaker.setVersion("1.2");//
		platformModuleMaker.setExpiration(sdf.format(authorize.getEndTime()));//
		platformModuleMaker.setLicense("企业版", "EVAL", "platform-1.0.0.RELEASE", "RELEASE.101", "苍穹-基础平台企业版");//
		platformModuleMaker.addMachineCode(authorize.getMachineCode());//
		platformModuleMaker.addProduct("组织机构", "/basis", "管理人员部门");
		platformModuleMaker.addProduct("组织机构", "/classic", "管理人员部门");
		
		
		response.setContentType("application/force-download");// 设置强制下载不打开
		response.addHeader("Content-Disposition", "attachment;fileName=" + "platform.modules");// 设置文件名
		OutputStream output = response.getOutputStream();
		IOUtils.write(platformModuleMaker.toMakeXml(), output, "utf-8");
		IOUtils.closeQuietly(output);
	}
	/**
	 * 查询单条记录操作
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(QUERY_DETAILS)
	public ResponseData queryDetails(String id) throws Exception {
	
		Authorize authorize = authorizeService.selectByPrimaryKey(id);

		// 返回数据
		ResponseData responseData = ResponseDataContext.getResponseData();
		responseData.writeData(authorize);
		responseData.setMessage("查询记录!");
	
		return responseData;
	}

	/**
	 * 保存操作
	 * @param authorize
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(SAVE)
	public ResponseData save(Authorize authorize) throws Exception {
	
		int count = authorizeService.insert(authorize);

		// 返回数据
		ResponseData responseData = ResponseDataContext.getResponseData();
		responseData.writeData(count);
		responseData.setMessage("插入记录成功!");
		return responseData;
	}

	/**
	 * 更新操作
	 * @param key
	 * @param authorize
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(UPDATE)
	public ResponseData update(@RequestParam(name = "key") String key, Authorize authorize) throws Exception {
		
		int count = authorizeService.updateByPrimaryKeySelective(key, authorize);
		
		// 返回数据
		ResponseData responseData = ResponseDataContext.getResponseData();
		responseData.writeData(count);
		responseData.setMessage("更新记录成功!");
		return responseData;
	}

	/**
	 * 批量更新
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(BATCH_UPDATE)
	public ResponseData batchUpdate(AuthorizeQuery query) throws Exception {

		int count = authorizeService.updateByQuerySelective(query.getModel(), query);

		// 返回数据
		ResponseData responseData = ResponseDataContext.getResponseData();
		responseData.writeData(count);
		responseData.setMessage("批量更新记录成功!");
		return responseData;
	}

	/**
	 * 删除操作
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(DELETE)
	public ResponseData delete(@RequestParam(name = "key") String key) throws Exception {
	
		int count = authorizeService.deleteByPrimaryKey(key);

		// 返回数据
		ResponseData responseData = ResponseDataContext.getResponseData();
		responseData.writeData(count);
		responseData.setMessage("删除记录成功!");
		return responseData;
	}

	/**
	 * 根据主键集合批量删除
	 * @param keys
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(BATCH_DELETE)
	public ResponseData batchDelete(@RequestParam(name = "keys") Set<String> keys) throws Exception {

		int count = authorizeService.deleteByPrimaryKeys(keys);

		// 返回数据
		ResponseData responseData = ResponseDataContext.getResponseData();
		responseData.writeData(count);
		responseData.setMessage("批量删除记录成功!");
		return responseData;
	}

	/**
	 * 分页查询
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(QUERY_PAGED_RESULT)
	public ResponseData queryPagedResult(AuthorizeQuery query) throws Exception {
		PagedResultHelper.startPage();
		List<Authorize> list = authorizeService.selectListByQuery(query);
		PagedResultInfo<Authorize> pagedResultInfo = PagedResultInfo.wrapper(list);

		// 返回数据
		ResponseData responseData = ResponseDataContext.getResponseData();
		responseData.writeData(pagedResultInfo);
		responseData.setMessage("分页查询记录");
		return responseData;
	}
}
