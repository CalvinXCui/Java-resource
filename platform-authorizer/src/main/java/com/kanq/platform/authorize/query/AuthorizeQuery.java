package com.kanq.platform.authorize.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.kanq.platform.basis.common.base.query.BaseQuery;
import com.kanq.platform.authorize.model.Authorize;

/**
 * 
 * @author quick 
 *
 */
public class AuthorizeQuery extends BaseQuery<Authorize> {

	private Authorize model;
	
	/**
	 * 获得一个当前传递的model
	 * @return
	 */
	public Authorize getModel() {
		return model == null ? model = new Authorize() : model;
	}

	public void setModel(Authorize model) {
		this.model = model;
	}
	
	
	/**
	 * 封装查询条件
	 */
	protected List<BasedCriteria> oredCriteria = null;

	public AuthorizeQuery() {
		oredCriteria = new ArrayList<>();
	}
	

	public List<BasedCriteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * 将创建的Criteria通过or的方式进行添加到oredCriteria里
	 * @param criteria
	 */
	public void or(BasedCriteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * 使用or进行连接
	 * @return
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * 只创建单条，用于使用*ByCriteria操作的Mapper接口方法
	 * @return
	 */
	public static Criteria createOneCriteria() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * <pre>
	 * 创建单条的查询Criteria
	 * 如果oredCriteria中已经存在一个以上的Criteria，将不会添加到oredCriteria里
	 * </pre>
	 * @return
	 */
	public Criteria createCriteria() {

		Criteria criteria = createCriteriaInternal();
		if( oredCriteria.size() == 0 ) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		return createOneCriteria();
	}

	/**
	 * 创建排序条件
	 * @return
	 */
	public OrderByCriteria createOrderByCriteria() {
		orderByCriteria = orderByCriteria == null ? new OrderByCriteria() : orderByCriteria;
		return (OrderByCriteria) orderByCriteria;
	}

	/**
	 * 清空
	 */
	public void clear() {
		oredCriteria.clear();
		orderByCriteria = null;
		distinct = false;
	}

	/**
	 * 生成的排序条件
	 * @author tgioer
	 *
	 */
	protected static class GeneratedOrderByCriteria extends BasedOrderByCriteria {
	
		/**
		 * 排序条件: (id desc)
		 * @return
		 */
		public OrderByCriteria andIdDesc() {
			addCriterion(new StringBuilder(LEFT_QUOTE_CHAR).append("ID").append(RIGHT_QUOTE_CHAR).toString(), OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (sysName desc)
		 * @return
		 */
		public OrderByCriteria andSysNameDesc() {
			addCriterion("SYS_NAME", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (permissionType desc)
		 * @return
		 */
		public OrderByCriteria andPermissionTypeDesc() {
			addCriterion("PERMISSION_TYPE", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (proposer desc)
		 * @return
		 */
		public OrderByCriteria andProposerDesc() {
			addCriterion("PROPOSER", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (applicantTime desc)
		 * @return
		 */
		public OrderByCriteria andApplicantTimeDesc() {
			addCriterion("APPLICANT_TIME", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (applicantCompany desc)
		 * @return
		 */
		public OrderByCriteria andApplicantCompanyDesc() {
			addCriterion("APPLICANT_COMPANY", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (projectName desc)
		 * @return
		 */
		public OrderByCriteria andProjectNameDesc() {
			addCriterion("PROJECT_NAME", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (projectNo desc)
		 * @return
		 */
		public OrderByCriteria andProjectNoDesc() {
			addCriterion("PROJECT_NO", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (projectDetails desc)
		 * @return
		 */
		public OrderByCriteria andProjectDetailsDesc() {
			addCriterion("PROJECT_DETAILS", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (machineCode desc)
		 * @return
		 */
		public OrderByCriteria andMachineCodeDesc() {
			addCriterion("MACHINE_CODE", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (phone desc)
		 * @return
		 */
		public OrderByCriteria andPhoneDesc() {
			addCriterion("PHONE", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (mailBox desc)
		 * @return
		 */
		public OrderByCriteria andMailBoxDesc() {
			addCriterion("MAIL_BOX", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (note desc)
		 * @return
		 */
		public OrderByCriteria andNoteDesc() {
			addCriterion("NOTE", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (proposerId desc)
		 * @return
		 */
		public OrderByCriteria andProposerIdDesc() {
			addCriterion("PROPOSER_ID", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (approverId desc)
		 * @return
		 */
		public OrderByCriteria andApproverIdDesc() {
			addCriterion("APPROVER_ID", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (nowDate desc)
		 * @return
		 */
		public OrderByCriteria andNowDateDesc() {
			addCriterion("NOW_DATE", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (startTime desc)
		 * @return
		 */
		public OrderByCriteria andStartTimeDesc() {
			addCriterion("START_TIME", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (endTime desc)
		 * @return
		 */
		public OrderByCriteria andEndTimeDesc() {
			addCriterion("END_TIME", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (licenseStatus desc)
		 * @return
		 */
		public OrderByCriteria andLicenseStatusDesc() {
			addCriterion("LICENSE_STATUS", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (feedback desc)
		 * @return
		 */
		public OrderByCriteria andFeedbackDesc() {
			addCriterion("FEEDBACK", OrderByCriterion.DESC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (id asc)
		 * @return
		 */
		public OrderByCriteria andIdAsc() {
			addCriterion(new StringBuilder(LEFT_QUOTE_CHAR).append("ID").append(RIGHT_QUOTE_CHAR).toString(), OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (sysName asc)
		 * @return
		 */
		public OrderByCriteria andSysNameAsc() {
			addCriterion("SYS_NAME", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (permissionType asc)
		 * @return
		 */
		public OrderByCriteria andPermissionTypeAsc() {
			addCriterion("PERMISSION_TYPE", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (proposer asc)
		 * @return
		 */
		public OrderByCriteria andProposerAsc() {
			addCriterion("PROPOSER", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (applicantTime asc)
		 * @return
		 */
		public OrderByCriteria andApplicantTimeAsc() {
			addCriterion("APPLICANT_TIME", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (applicantCompany asc)
		 * @return
		 */
		public OrderByCriteria andApplicantCompanyAsc() {
			addCriterion("APPLICANT_COMPANY", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (projectName asc)
		 * @return
		 */
		public OrderByCriteria andProjectNameAsc() {
			addCriterion("PROJECT_NAME", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (projectNo asc)
		 * @return
		 */
		public OrderByCriteria andProjectNoAsc() {
			addCriterion("PROJECT_NO", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (projectDetails asc)
		 * @return
		 */
		public OrderByCriteria andProjectDetailsAsc() {
			addCriterion("PROJECT_DETAILS", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (machineCode asc)
		 * @return
		 */
		public OrderByCriteria andMachineCodeAsc() {
			addCriterion("MACHINE_CODE", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (phone asc)
		 * @return
		 */
		public OrderByCriteria andPhoneAsc() {
			addCriterion("PHONE", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (mailBox asc)
		 * @return
		 */
		public OrderByCriteria andMailBoxAsc() {
			addCriterion("MAIL_BOX", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (note asc)
		 * @return
		 */
		public OrderByCriteria andNoteAsc() {
			addCriterion("NOTE", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (proposerId asc)
		 * @return
		 */
		public OrderByCriteria andProposerIdAsc() {
			addCriterion("PROPOSER_ID", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (approverId asc)
		 * @return
		 */
		public OrderByCriteria andApproverIdAsc() {
			addCriterion("APPROVER_ID", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (nowDate asc)
		 * @return
		 */
		public OrderByCriteria andNowDateAsc() {
			addCriterion("NOW_DATE", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (startTime asc)
		 * @return
		 */
		public OrderByCriteria andStartTimeAsc() {
			addCriterion("START_TIME", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (endTime asc)
		 * @return
		 */
		public OrderByCriteria andEndTimeAsc() {
			addCriterion("END_TIME", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (licenseStatus asc)
		 * @return
		 */
		public OrderByCriteria andLicenseStatusAsc() {
			addCriterion("LICENSE_STATUS", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

		/**
		 * 排序条件: (feedback asc)
		 * @return
		 */
		public OrderByCriteria andFeedbackAsc() {
			addCriterion("FEEDBACK", OrderByCriterion.ASC);
			return (OrderByCriteria) this;
		}

	}

	public static class OrderByCriteria extends GeneratedOrderByCriteria {

	}

	/**
	 * 生成的Criteria
	 * @author tgioer
	 *
	 */
	protected abstract static class GeneratedCriteria extends BasedCriteria {

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 id is null 的查询条件
		 * @return
		 */
		public Criteria orIdIsNull() {
		
			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" is null")//
					.toString());

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id not null 的查询条件
		 * @return
		 */
		public Criteria orIdIsNotNull() {
		
			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" is not null")//
					.toString());
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 id like "%value%" 模糊查询, 例子：orIdLike("%value%")...
		 * @return
		 */
		public Criteria orIdLike(String id) {
			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" like")//
					.toString(), id, "id");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id = "value" 传递查询条件, 例子：orIdEqualTo("value")...
		 * @return
		 */
		public Criteria orIdEqualTo(String id) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" = ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id <> "value" 传递查询条件, 例子：orIdNotEqualTo("value")...
		 * @return
		 */
		public Criteria orIdNotEqualTo(String id) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" <> ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id > "value" 传递查询条件, 例子：orIdGreaterThan("value")...
		 * @return
		 */
		public Criteria orIdGreaterThan(String id) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" > ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id >= "value" 传递查询条件, 例子：orIdGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orIdGreaterThanOrEqualTo(String id) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" >= ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id < "value" 传递查询条件 ，例子：orIdLessThan("value")...
		 * @return
		 */
		public Criteria orIdLessThan(String id) {
		
			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" < ")//
					.toString(), id, "id");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id <= "value" 传递查询条件 ，例子：orIdLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orIdLessThanOrEqualTo(String id) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" <= ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orIdIn(List<String> ids) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" in ")//
					.toString(), ids, "id");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 id not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orIdNotIn(List<String> ids) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" not in ")//
					.toString(), ids, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 id between "value1" and "value2" 传递查询条件 ，例子：orIdBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orIdBetween(String id1, String id2) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" between ")//
					.toString(), id1, id2, "id");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 id not between "value1" and "value2" 传递查询条件 ，例子：orIdNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orIdNotBetween(String id1, String id2) {

			addCriterion(new StringBuilder("or ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" between ")//
					.toString(), id1, id2, "id");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 sysName is null 的查询条件
		 * @return
		 */
		public Criteria orSysNameIsNull() {
		
			addCriterion("or SYS_NAME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName not null 的查询条件
		 * @return
		 */
		public Criteria orSysNameIsNotNull() {
		
			addCriterion("or SYS_NAME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 sysName like "%value%" 模糊查询, 例子：orSysNameLike("%value%")...
		 * @return
		 */
		public Criteria orSysNameLike(String sysName) {
			addCriterion("or SYS_NAME like ", sysName, "sysName");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName = "value" 传递查询条件, 例子：orSysNameEqualTo("value")...
		 * @return
		 */
		public Criteria orSysNameEqualTo(String sysName) {

			addCriterion("or SYS_NAME = ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName <> "value" 传递查询条件, 例子：orSysNameNotEqualTo("value")...
		 * @return
		 */
		public Criteria orSysNameNotEqualTo(String sysName) {

			addCriterion("or SYS_NAME <> ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName > "value" 传递查询条件, 例子：orSysNameGreaterThan("value")...
		 * @return
		 */
		public Criteria orSysNameGreaterThan(String sysName) {

			addCriterion("or SYS_NAME > ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName >= "value" 传递查询条件, 例子：orSysNameGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orSysNameGreaterThanOrEqualTo(String sysName) {

			addCriterion("or SYS_NAME >= ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName < "value" 传递查询条件 ，例子：orSysNameLessThan("value")...
		 * @return
		 */
		public Criteria orSysNameLessThan(String sysName) {
		
			addCriterion("or SYS_NAME < ", sysName, "sysName");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName <= "value" 传递查询条件 ，例子：orSysNameLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orSysNameLessThanOrEqualTo(String sysName) {

			addCriterion("or SYS_NAME <= ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orSysNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orSysNameIn(List<String> sysNames) {

			addCriterion("or SYS_NAME in ", sysNames, "sysName");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 sysName not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orSysNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orSysNameNotIn(List<String> sysNames) {

			addCriterion("or SYS_NAME not in ", sysNames, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 sysName between "value1" and "value2" 传递查询条件 ，例子：orSysNameBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orSysNameBetween(String sysName1, String sysName2) {

			addCriterion("or SYS_NAME between ", sysName1, sysName2, "sysName");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 sysName not between "value1" and "value2" 传递查询条件 ，例子：orSysNameNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orSysNameNotBetween(String sysName1, String sysName2) {

			addCriterion("or SYS_NAME not between ", sysName1, sysName2, "sysName");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 permissionType is null 的查询条件
		 * @return
		 */
		public Criteria orPermissionTypeIsNull() {
		
			addCriterion("or PERMISSION_TYPE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType not null 的查询条件
		 * @return
		 */
		public Criteria orPermissionTypeIsNotNull() {
		
			addCriterion("or PERMISSION_TYPE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 permissionType like "%value%" 模糊查询, 例子：orPermissionTypeLike("%value%")...
		 * @return
		 */
		public Criteria orPermissionTypeLike(String permissionType) {
			addCriterion("or PERMISSION_TYPE like ", permissionType, "permissionType");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType = "value" 传递查询条件, 例子：orPermissionTypeEqualTo("value")...
		 * @return
		 */
		public Criteria orPermissionTypeEqualTo(String permissionType) {

			addCriterion("or PERMISSION_TYPE = ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType <> "value" 传递查询条件, 例子：orPermissionTypeNotEqualTo("value")...
		 * @return
		 */
		public Criteria orPermissionTypeNotEqualTo(String permissionType) {

			addCriterion("or PERMISSION_TYPE <> ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType > "value" 传递查询条件, 例子：orPermissionTypeGreaterThan("value")...
		 * @return
		 */
		public Criteria orPermissionTypeGreaterThan(String permissionType) {

			addCriterion("or PERMISSION_TYPE > ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType >= "value" 传递查询条件, 例子：orPermissionTypeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orPermissionTypeGreaterThanOrEqualTo(String permissionType) {

			addCriterion("or PERMISSION_TYPE >= ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType < "value" 传递查询条件 ，例子：orPermissionTypeLessThan("value")...
		 * @return
		 */
		public Criteria orPermissionTypeLessThan(String permissionType) {
		
			addCriterion("or PERMISSION_TYPE < ", permissionType, "permissionType");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType <= "value" 传递查询条件 ，例子：orPermissionTypeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orPermissionTypeLessThanOrEqualTo(String permissionType) {

			addCriterion("or PERMISSION_TYPE <= ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orPermissionTypeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orPermissionTypeIn(List<String> permissionTypes) {

			addCriterion("or PERMISSION_TYPE in ", permissionTypes, "permissionType");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 permissionType not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orPermissionTypeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orPermissionTypeNotIn(List<String> permissionTypes) {

			addCriterion("or PERMISSION_TYPE not in ", permissionTypes, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 permissionType between "value1" and "value2" 传递查询条件 ，例子：orPermissionTypeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orPermissionTypeBetween(String permissionType1, String permissionType2) {

			addCriterion("or PERMISSION_TYPE between ", permissionType1, permissionType2, "permissionType");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 permissionType not between "value1" and "value2" 传递查询条件 ，例子：orPermissionTypeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orPermissionTypeNotBetween(String permissionType1, String permissionType2) {

			addCriterion("or PERMISSION_TYPE not between ", permissionType1, permissionType2, "permissionType");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 proposer is null 的查询条件
		 * @return
		 */
		public Criteria orProposerIsNull() {
		
			addCriterion("or PROPOSER is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer not null 的查询条件
		 * @return
		 */
		public Criteria orProposerIsNotNull() {
		
			addCriterion("or PROPOSER is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 proposer like "%value%" 模糊查询, 例子：orProposerLike("%value%")...
		 * @return
		 */
		public Criteria orProposerLike(String proposer) {
			addCriterion("or PROPOSER like ", proposer, "proposer");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer = "value" 传递查询条件, 例子：orProposerEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerEqualTo(String proposer) {

			addCriterion("or PROPOSER = ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer <> "value" 传递查询条件, 例子：orProposerNotEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerNotEqualTo(String proposer) {

			addCriterion("or PROPOSER <> ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer > "value" 传递查询条件, 例子：orProposerGreaterThan("value")...
		 * @return
		 */
		public Criteria orProposerGreaterThan(String proposer) {

			addCriterion("or PROPOSER > ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer >= "value" 传递查询条件, 例子：orProposerGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerGreaterThanOrEqualTo(String proposer) {

			addCriterion("or PROPOSER >= ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer < "value" 传递查询条件 ，例子：orProposerLessThan("value")...
		 * @return
		 */
		public Criteria orProposerLessThan(String proposer) {
		
			addCriterion("or PROPOSER < ", proposer, "proposer");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer <= "value" 传递查询条件 ，例子：orProposerLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerLessThanOrEqualTo(String proposer) {

			addCriterion("or PROPOSER <= ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProposerIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProposerIn(List<String> proposers) {

			addCriterion("or PROPOSER in ", proposers, "proposer");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 proposer not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProposerIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProposerNotIn(List<String> proposers) {

			addCriterion("or PROPOSER not in ", proposers, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposer between "value1" and "value2" 传递查询条件 ，例子：orProposerBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProposerBetween(String proposer1, String proposer2) {

			addCriterion("or PROPOSER between ", proposer1, proposer2, "proposer");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 proposer not between "value1" and "value2" 传递查询条件 ，例子：orProposerNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProposerNotBetween(String proposer1, String proposer2) {

			addCriterion("or PROPOSER not between ", proposer1, proposer2, "proposer");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 applicantTime is null 的查询条件
		 * @return
		 */
		public Criteria orApplicantTimeIsNull() {
		
			addCriterion("or APPLICANT_TIME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime not null 的查询条件
		 * @return
		 */
		public Criteria orApplicantTimeIsNotNull() {
		
			addCriterion("or APPLICANT_TIME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 applicantTime like "%value%" 模糊查询, 例子：orApplicantTimeLike("%value%")...
		 * @return
		 */
		public Criteria orApplicantTimeLike(String applicantTime) {
			addCriterion("or APPLICANT_TIME like ", applicantTime, "applicantTime");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime = "value" 传递查询条件, 例子：orApplicantTimeEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantTimeEqualTo(Date applicantTime) {

			addCriterion("or APPLICANT_TIME = ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime <> "value" 传递查询条件, 例子：orApplicantTimeNotEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantTimeNotEqualTo(Date applicantTime) {

			addCriterion("or APPLICANT_TIME <> ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime > "value" 传递查询条件, 例子：orApplicantTimeGreaterThan("value")...
		 * @return
		 */
		public Criteria orApplicantTimeGreaterThan(Date applicantTime) {

			addCriterion("or APPLICANT_TIME > ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime >= "value" 传递查询条件, 例子：orApplicantTimeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantTimeGreaterThanOrEqualTo(Date applicantTime) {

			addCriterion("or APPLICANT_TIME >= ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime < "value" 传递查询条件 ，例子：orApplicantTimeLessThan("value")...
		 * @return
		 */
		public Criteria orApplicantTimeLessThan(Date applicantTime) {
		
			addCriterion("or APPLICANT_TIME < ", applicantTime, "applicantTime");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime <= "value" 传递查询条件 ，例子：orApplicantTimeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantTimeLessThanOrEqualTo(Date applicantTime) {

			addCriterion("or APPLICANT_TIME <= ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orApplicantTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orApplicantTimeIn(List<Date> applicantTimes) {

			addCriterion("or APPLICANT_TIME in ", applicantTimes, "applicantTime");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 applicantTime not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orApplicantTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orApplicantTimeNotIn(List<Date> applicantTimes) {

			addCriterion("or APPLICANT_TIME not in ", applicantTimes, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantTime between "value1" and "value2" 传递查询条件 ，例子：orApplicantTimeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orApplicantTimeBetween(Date applicantTime1, Date applicantTime2) {

			addCriterion("or APPLICANT_TIME between ", applicantTime1, applicantTime2, "applicantTime");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 applicantTime not between "value1" and "value2" 传递查询条件 ，例子：orApplicantTimeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orApplicantTimeNotBetween(Date applicantTime1, Date applicantTime2) {

			addCriterion("or APPLICANT_TIME not between ", applicantTime1, applicantTime2, "applicantTime");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 applicantCompany is null 的查询条件
		 * @return
		 */
		public Criteria orApplicantCompanyIsNull() {
		
			addCriterion("or APPLICANT_COMPANY is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany not null 的查询条件
		 * @return
		 */
		public Criteria orApplicantCompanyIsNotNull() {
		
			addCriterion("or APPLICANT_COMPANY is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 applicantCompany like "%value%" 模糊查询, 例子：orApplicantCompanyLike("%value%")...
		 * @return
		 */
		public Criteria orApplicantCompanyLike(String applicantCompany) {
			addCriterion("or APPLICANT_COMPANY like ", applicantCompany, "applicantCompany");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany = "value" 传递查询条件, 例子：orApplicantCompanyEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantCompanyEqualTo(String applicantCompany) {

			addCriterion("or APPLICANT_COMPANY = ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany <> "value" 传递查询条件, 例子：orApplicantCompanyNotEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantCompanyNotEqualTo(String applicantCompany) {

			addCriterion("or APPLICANT_COMPANY <> ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany > "value" 传递查询条件, 例子：orApplicantCompanyGreaterThan("value")...
		 * @return
		 */
		public Criteria orApplicantCompanyGreaterThan(String applicantCompany) {

			addCriterion("or APPLICANT_COMPANY > ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany >= "value" 传递查询条件, 例子：orApplicantCompanyGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantCompanyGreaterThanOrEqualTo(String applicantCompany) {

			addCriterion("or APPLICANT_COMPANY >= ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany < "value" 传递查询条件 ，例子：orApplicantCompanyLessThan("value")...
		 * @return
		 */
		public Criteria orApplicantCompanyLessThan(String applicantCompany) {
		
			addCriterion("or APPLICANT_COMPANY < ", applicantCompany, "applicantCompany");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany <= "value" 传递查询条件 ，例子：orApplicantCompanyLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orApplicantCompanyLessThanOrEqualTo(String applicantCompany) {

			addCriterion("or APPLICANT_COMPANY <= ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orApplicantCompanyIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orApplicantCompanyIn(List<String> applicantCompanys) {

			addCriterion("or APPLICANT_COMPANY in ", applicantCompanys, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 applicantCompany not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orApplicantCompanyIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orApplicantCompanyNotIn(List<String> applicantCompanys) {

			addCriterion("or APPLICANT_COMPANY not in ", applicantCompanys, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 applicantCompany between "value1" and "value2" 传递查询条件 ，例子：orApplicantCompanyBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orApplicantCompanyBetween(String applicantCompany1, String applicantCompany2) {

			addCriterion("or APPLICANT_COMPANY between ", applicantCompany1, applicantCompany2, "applicantCompany");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 applicantCompany not between "value1" and "value2" 传递查询条件 ，例子：orApplicantCompanyNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orApplicantCompanyNotBetween(String applicantCompany1, String applicantCompany2) {

			addCriterion("or APPLICANT_COMPANY not between ", applicantCompany1, applicantCompany2, "applicantCompany");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 projectName is null 的查询条件
		 * @return
		 */
		public Criteria orProjectNameIsNull() {
		
			addCriterion("or PROJECT_NAME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName not null 的查询条件
		 * @return
		 */
		public Criteria orProjectNameIsNotNull() {
		
			addCriterion("or PROJECT_NAME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 projectName like "%value%" 模糊查询, 例子：orProjectNameLike("%value%")...
		 * @return
		 */
		public Criteria orProjectNameLike(String projectName) {
			addCriterion("or PROJECT_NAME like ", projectName, "projectName");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName = "value" 传递查询条件, 例子：orProjectNameEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNameEqualTo(String projectName) {

			addCriterion("or PROJECT_NAME = ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName <> "value" 传递查询条件, 例子：orProjectNameNotEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNameNotEqualTo(String projectName) {

			addCriterion("or PROJECT_NAME <> ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName > "value" 传递查询条件, 例子：orProjectNameGreaterThan("value")...
		 * @return
		 */
		public Criteria orProjectNameGreaterThan(String projectName) {

			addCriterion("or PROJECT_NAME > ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName >= "value" 传递查询条件, 例子：orProjectNameGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNameGreaterThanOrEqualTo(String projectName) {

			addCriterion("or PROJECT_NAME >= ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName < "value" 传递查询条件 ，例子：orProjectNameLessThan("value")...
		 * @return
		 */
		public Criteria orProjectNameLessThan(String projectName) {
		
			addCriterion("or PROJECT_NAME < ", projectName, "projectName");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName <= "value" 传递查询条件 ，例子：orProjectNameLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNameLessThanOrEqualTo(String projectName) {

			addCriterion("or PROJECT_NAME <= ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProjectNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProjectNameIn(List<String> projectNames) {

			addCriterion("or PROJECT_NAME in ", projectNames, "projectName");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 projectName not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProjectNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProjectNameNotIn(List<String> projectNames) {

			addCriterion("or PROJECT_NAME not in ", projectNames, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectName between "value1" and "value2" 传递查询条件 ，例子：orProjectNameBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProjectNameBetween(String projectName1, String projectName2) {

			addCriterion("or PROJECT_NAME between ", projectName1, projectName2, "projectName");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 projectName not between "value1" and "value2" 传递查询条件 ，例子：orProjectNameNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProjectNameNotBetween(String projectName1, String projectName2) {

			addCriterion("or PROJECT_NAME not between ", projectName1, projectName2, "projectName");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 projectNo is null 的查询条件
		 * @return
		 */
		public Criteria orProjectNoIsNull() {
		
			addCriterion("or PROJECT_NO is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo not null 的查询条件
		 * @return
		 */
		public Criteria orProjectNoIsNotNull() {
		
			addCriterion("or PROJECT_NO is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 projectNo like "%value%" 模糊查询, 例子：orProjectNoLike("%value%")...
		 * @return
		 */
		public Criteria orProjectNoLike(String projectNo) {
			addCriterion("or PROJECT_NO like ", projectNo, "projectNo");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo = "value" 传递查询条件, 例子：orProjectNoEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNoEqualTo(String projectNo) {

			addCriterion("or PROJECT_NO = ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo <> "value" 传递查询条件, 例子：orProjectNoNotEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNoNotEqualTo(String projectNo) {

			addCriterion("or PROJECT_NO <> ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo > "value" 传递查询条件, 例子：orProjectNoGreaterThan("value")...
		 * @return
		 */
		public Criteria orProjectNoGreaterThan(String projectNo) {

			addCriterion("or PROJECT_NO > ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo >= "value" 传递查询条件, 例子：orProjectNoGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNoGreaterThanOrEqualTo(String projectNo) {

			addCriterion("or PROJECT_NO >= ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo < "value" 传递查询条件 ，例子：orProjectNoLessThan("value")...
		 * @return
		 */
		public Criteria orProjectNoLessThan(String projectNo) {
		
			addCriterion("or PROJECT_NO < ", projectNo, "projectNo");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo <= "value" 传递查询条件 ，例子：orProjectNoLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectNoLessThanOrEqualTo(String projectNo) {

			addCriterion("or PROJECT_NO <= ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProjectNoIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProjectNoIn(List<String> projectNos) {

			addCriterion("or PROJECT_NO in ", projectNos, "projectNo");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 projectNo not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProjectNoIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProjectNoNotIn(List<String> projectNos) {

			addCriterion("or PROJECT_NO not in ", projectNos, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectNo between "value1" and "value2" 传递查询条件 ，例子：orProjectNoBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProjectNoBetween(String projectNo1, String projectNo2) {

			addCriterion("or PROJECT_NO between ", projectNo1, projectNo2, "projectNo");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 projectNo not between "value1" and "value2" 传递查询条件 ，例子：orProjectNoNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProjectNoNotBetween(String projectNo1, String projectNo2) {

			addCriterion("or PROJECT_NO not between ", projectNo1, projectNo2, "projectNo");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 projectDetails is null 的查询条件
		 * @return
		 */
		public Criteria orProjectDetailsIsNull() {
		
			addCriterion("or PROJECT_DETAILS is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails not null 的查询条件
		 * @return
		 */
		public Criteria orProjectDetailsIsNotNull() {
		
			addCriterion("or PROJECT_DETAILS is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 projectDetails like "%value%" 模糊查询, 例子：orProjectDetailsLike("%value%")...
		 * @return
		 */
		public Criteria orProjectDetailsLike(String projectDetails) {
			addCriterion("or PROJECT_DETAILS like ", projectDetails, "projectDetails");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails = "value" 传递查询条件, 例子：orProjectDetailsEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectDetailsEqualTo(String projectDetails) {

			addCriterion("or PROJECT_DETAILS = ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails <> "value" 传递查询条件, 例子：orProjectDetailsNotEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectDetailsNotEqualTo(String projectDetails) {

			addCriterion("or PROJECT_DETAILS <> ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails > "value" 传递查询条件, 例子：orProjectDetailsGreaterThan("value")...
		 * @return
		 */
		public Criteria orProjectDetailsGreaterThan(String projectDetails) {

			addCriterion("or PROJECT_DETAILS > ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails >= "value" 传递查询条件, 例子：orProjectDetailsGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectDetailsGreaterThanOrEqualTo(String projectDetails) {

			addCriterion("or PROJECT_DETAILS >= ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails < "value" 传递查询条件 ，例子：orProjectDetailsLessThan("value")...
		 * @return
		 */
		public Criteria orProjectDetailsLessThan(String projectDetails) {
		
			addCriterion("or PROJECT_DETAILS < ", projectDetails, "projectDetails");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails <= "value" 传递查询条件 ，例子：orProjectDetailsLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProjectDetailsLessThanOrEqualTo(String projectDetails) {

			addCriterion("or PROJECT_DETAILS <= ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProjectDetailsIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProjectDetailsIn(List<String> projectDetailss) {

			addCriterion("or PROJECT_DETAILS in ", projectDetailss, "projectDetails");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 projectDetails not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProjectDetailsIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProjectDetailsNotIn(List<String> projectDetailss) {

			addCriterion("or PROJECT_DETAILS not in ", projectDetailss, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 projectDetails between "value1" and "value2" 传递查询条件 ，例子：orProjectDetailsBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProjectDetailsBetween(String projectDetails1, String projectDetails2) {

			addCriterion("or PROJECT_DETAILS between ", projectDetails1, projectDetails2, "projectDetails");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 projectDetails not between "value1" and "value2" 传递查询条件 ，例子：orProjectDetailsNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProjectDetailsNotBetween(String projectDetails1, String projectDetails2) {

			addCriterion("or PROJECT_DETAILS not between ", projectDetails1, projectDetails2, "projectDetails");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 machineCode is null 的查询条件
		 * @return
		 */
		public Criteria orMachineCodeIsNull() {
		
			addCriterion("or MACHINE_CODE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode not null 的查询条件
		 * @return
		 */
		public Criteria orMachineCodeIsNotNull() {
		
			addCriterion("or MACHINE_CODE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 machineCode like "%value%" 模糊查询, 例子：orMachineCodeLike("%value%")...
		 * @return
		 */
		public Criteria orMachineCodeLike(String machineCode) {
			addCriterion("or MACHINE_CODE like ", machineCode, "machineCode");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode = "value" 传递查询条件, 例子：orMachineCodeEqualTo("value")...
		 * @return
		 */
		public Criteria orMachineCodeEqualTo(String machineCode) {

			addCriterion("or MACHINE_CODE = ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode <> "value" 传递查询条件, 例子：orMachineCodeNotEqualTo("value")...
		 * @return
		 */
		public Criteria orMachineCodeNotEqualTo(String machineCode) {

			addCriterion("or MACHINE_CODE <> ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode > "value" 传递查询条件, 例子：orMachineCodeGreaterThan("value")...
		 * @return
		 */
		public Criteria orMachineCodeGreaterThan(String machineCode) {

			addCriterion("or MACHINE_CODE > ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode >= "value" 传递查询条件, 例子：orMachineCodeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orMachineCodeGreaterThanOrEqualTo(String machineCode) {

			addCriterion("or MACHINE_CODE >= ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode < "value" 传递查询条件 ，例子：orMachineCodeLessThan("value")...
		 * @return
		 */
		public Criteria orMachineCodeLessThan(String machineCode) {
		
			addCriterion("or MACHINE_CODE < ", machineCode, "machineCode");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode <= "value" 传递查询条件 ，例子：orMachineCodeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orMachineCodeLessThanOrEqualTo(String machineCode) {

			addCriterion("or MACHINE_CODE <= ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orMachineCodeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orMachineCodeIn(List<String> machineCodes) {

			addCriterion("or MACHINE_CODE in ", machineCodes, "machineCode");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 machineCode not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orMachineCodeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orMachineCodeNotIn(List<String> machineCodes) {

			addCriterion("or MACHINE_CODE not in ", machineCodes, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 machineCode between "value1" and "value2" 传递查询条件 ，例子：orMachineCodeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orMachineCodeBetween(String machineCode1, String machineCode2) {

			addCriterion("or MACHINE_CODE between ", machineCode1, machineCode2, "machineCode");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 machineCode not between "value1" and "value2" 传递查询条件 ，例子：orMachineCodeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orMachineCodeNotBetween(String machineCode1, String machineCode2) {

			addCriterion("or MACHINE_CODE not between ", machineCode1, machineCode2, "machineCode");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 phone is null 的查询条件
		 * @return
		 */
		public Criteria orPhoneIsNull() {
		
			addCriterion("or PHONE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone not null 的查询条件
		 * @return
		 */
		public Criteria orPhoneIsNotNull() {
		
			addCriterion("or PHONE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 phone like "%value%" 模糊查询, 例子：orPhoneLike("%value%")...
		 * @return
		 */
		public Criteria orPhoneLike(String phone) {
			addCriterion("or PHONE like ", phone, "phone");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone = "value" 传递查询条件, 例子：orPhoneEqualTo("value")...
		 * @return
		 */
		public Criteria orPhoneEqualTo(String phone) {

			addCriterion("or PHONE = ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone <> "value" 传递查询条件, 例子：orPhoneNotEqualTo("value")...
		 * @return
		 */
		public Criteria orPhoneNotEqualTo(String phone) {

			addCriterion("or PHONE <> ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone > "value" 传递查询条件, 例子：orPhoneGreaterThan("value")...
		 * @return
		 */
		public Criteria orPhoneGreaterThan(String phone) {

			addCriterion("or PHONE > ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone >= "value" 传递查询条件, 例子：orPhoneGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orPhoneGreaterThanOrEqualTo(String phone) {

			addCriterion("or PHONE >= ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone < "value" 传递查询条件 ，例子：orPhoneLessThan("value")...
		 * @return
		 */
		public Criteria orPhoneLessThan(String phone) {
		
			addCriterion("or PHONE < ", phone, "phone");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone <= "value" 传递查询条件 ，例子：orPhoneLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orPhoneLessThanOrEqualTo(String phone) {

			addCriterion("or PHONE <= ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orPhoneIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orPhoneIn(List<String> phones) {

			addCriterion("or PHONE in ", phones, "phone");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 phone not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orPhoneIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orPhoneNotIn(List<String> phones) {

			addCriterion("or PHONE not in ", phones, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 phone between "value1" and "value2" 传递查询条件 ，例子：orPhoneBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orPhoneBetween(String phone1, String phone2) {

			addCriterion("or PHONE between ", phone1, phone2, "phone");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 phone not between "value1" and "value2" 传递查询条件 ，例子：orPhoneNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orPhoneNotBetween(String phone1, String phone2) {

			addCriterion("or PHONE not between ", phone1, phone2, "phone");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 mailBox is null 的查询条件
		 * @return
		 */
		public Criteria orMailBoxIsNull() {
		
			addCriterion("or MAIL_BOX is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox not null 的查询条件
		 * @return
		 */
		public Criteria orMailBoxIsNotNull() {
		
			addCriterion("or MAIL_BOX is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 mailBox like "%value%" 模糊查询, 例子：orMailBoxLike("%value%")...
		 * @return
		 */
		public Criteria orMailBoxLike(String mailBox) {
			addCriterion("or MAIL_BOX like ", mailBox, "mailBox");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox = "value" 传递查询条件, 例子：orMailBoxEqualTo("value")...
		 * @return
		 */
		public Criteria orMailBoxEqualTo(String mailBox) {

			addCriterion("or MAIL_BOX = ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox <> "value" 传递查询条件, 例子：orMailBoxNotEqualTo("value")...
		 * @return
		 */
		public Criteria orMailBoxNotEqualTo(String mailBox) {

			addCriterion("or MAIL_BOX <> ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox > "value" 传递查询条件, 例子：orMailBoxGreaterThan("value")...
		 * @return
		 */
		public Criteria orMailBoxGreaterThan(String mailBox) {

			addCriterion("or MAIL_BOX > ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox >= "value" 传递查询条件, 例子：orMailBoxGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orMailBoxGreaterThanOrEqualTo(String mailBox) {

			addCriterion("or MAIL_BOX >= ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox < "value" 传递查询条件 ，例子：orMailBoxLessThan("value")...
		 * @return
		 */
		public Criteria orMailBoxLessThan(String mailBox) {
		
			addCriterion("or MAIL_BOX < ", mailBox, "mailBox");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox <= "value" 传递查询条件 ，例子：orMailBoxLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orMailBoxLessThanOrEqualTo(String mailBox) {

			addCriterion("or MAIL_BOX <= ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orMailBoxIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orMailBoxIn(List<String> mailBoxs) {

			addCriterion("or MAIL_BOX in ", mailBoxs, "mailBox");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 mailBox not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orMailBoxIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orMailBoxNotIn(List<String> mailBoxs) {

			addCriterion("or MAIL_BOX not in ", mailBoxs, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 mailBox between "value1" and "value2" 传递查询条件 ，例子：orMailBoxBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orMailBoxBetween(String mailBox1, String mailBox2) {

			addCriterion("or MAIL_BOX between ", mailBox1, mailBox2, "mailBox");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 mailBox not between "value1" and "value2" 传递查询条件 ，例子：orMailBoxNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orMailBoxNotBetween(String mailBox1, String mailBox2) {

			addCriterion("or MAIL_BOX not between ", mailBox1, mailBox2, "mailBox");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 note is null 的查询条件
		 * @return
		 */
		public Criteria orNoteIsNull() {
		
			addCriterion("or NOTE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note not null 的查询条件
		 * @return
		 */
		public Criteria orNoteIsNotNull() {
		
			addCriterion("or NOTE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 note like "%value%" 模糊查询, 例子：orNoteLike("%value%")...
		 * @return
		 */
		public Criteria orNoteLike(String note) {
			addCriterion("or NOTE like ", note, "note");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note = "value" 传递查询条件, 例子：orNoteEqualTo("value")...
		 * @return
		 */
		public Criteria orNoteEqualTo(String note) {

			addCriterion("or NOTE = ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note <> "value" 传递查询条件, 例子：orNoteNotEqualTo("value")...
		 * @return
		 */
		public Criteria orNoteNotEqualTo(String note) {

			addCriterion("or NOTE <> ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note > "value" 传递查询条件, 例子：orNoteGreaterThan("value")...
		 * @return
		 */
		public Criteria orNoteGreaterThan(String note) {

			addCriterion("or NOTE > ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note >= "value" 传递查询条件, 例子：orNoteGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orNoteGreaterThanOrEqualTo(String note) {

			addCriterion("or NOTE >= ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note < "value" 传递查询条件 ，例子：orNoteLessThan("value")...
		 * @return
		 */
		public Criteria orNoteLessThan(String note) {
		
			addCriterion("or NOTE < ", note, "note");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note <= "value" 传递查询条件 ，例子：orNoteLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orNoteLessThanOrEqualTo(String note) {

			addCriterion("or NOTE <= ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orNoteIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orNoteIn(List<String> notes) {

			addCriterion("or NOTE in ", notes, "note");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 note not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orNoteIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orNoteNotIn(List<String> notes) {

			addCriterion("or NOTE not in ", notes, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 note between "value1" and "value2" 传递查询条件 ，例子：orNoteBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orNoteBetween(String note1, String note2) {

			addCriterion("or NOTE between ", note1, note2, "note");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 note not between "value1" and "value2" 传递查询条件 ，例子：orNoteNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orNoteNotBetween(String note1, String note2) {

			addCriterion("or NOTE not between ", note1, note2, "note");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 proposerId is null 的查询条件
		 * @return
		 */
		public Criteria orProposerIdIsNull() {
		
			addCriterion("or PROPOSER_ID is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId not null 的查询条件
		 * @return
		 */
		public Criteria orProposerIdIsNotNull() {
		
			addCriterion("or PROPOSER_ID is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 proposerId like "%value%" 模糊查询, 例子：orProposerIdLike("%value%")...
		 * @return
		 */
		public Criteria orProposerIdLike(String proposerId) {
			addCriterion("or PROPOSER_ID like ", proposerId, "proposerId");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId = "value" 传递查询条件, 例子：orProposerIdEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerIdEqualTo(String proposerId) {

			addCriterion("or PROPOSER_ID = ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId <> "value" 传递查询条件, 例子：orProposerIdNotEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerIdNotEqualTo(String proposerId) {

			addCriterion("or PROPOSER_ID <> ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId > "value" 传递查询条件, 例子：orProposerIdGreaterThan("value")...
		 * @return
		 */
		public Criteria orProposerIdGreaterThan(String proposerId) {

			addCriterion("or PROPOSER_ID > ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId >= "value" 传递查询条件, 例子：orProposerIdGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerIdGreaterThanOrEqualTo(String proposerId) {

			addCriterion("or PROPOSER_ID >= ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId < "value" 传递查询条件 ，例子：orProposerIdLessThan("value")...
		 * @return
		 */
		public Criteria orProposerIdLessThan(String proposerId) {
		
			addCriterion("or PROPOSER_ID < ", proposerId, "proposerId");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId <= "value" 传递查询条件 ，例子：orProposerIdLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orProposerIdLessThanOrEqualTo(String proposerId) {

			addCriterion("or PROPOSER_ID <= ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProposerIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProposerIdIn(List<String> proposerIds) {

			addCriterion("or PROPOSER_ID in ", proposerIds, "proposerId");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 proposerId not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orProposerIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orProposerIdNotIn(List<String> proposerIds) {

			addCriterion("or PROPOSER_ID not in ", proposerIds, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 proposerId between "value1" and "value2" 传递查询条件 ，例子：orProposerIdBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProposerIdBetween(String proposerId1, String proposerId2) {

			addCriterion("or PROPOSER_ID between ", proposerId1, proposerId2, "proposerId");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 proposerId not between "value1" and "value2" 传递查询条件 ，例子：orProposerIdNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orProposerIdNotBetween(String proposerId1, String proposerId2) {

			addCriterion("or PROPOSER_ID not between ", proposerId1, proposerId2, "proposerId");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 approverId is null 的查询条件
		 * @return
		 */
		public Criteria orApproverIdIsNull() {
		
			addCriterion("or APPROVER_ID is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId not null 的查询条件
		 * @return
		 */
		public Criteria orApproverIdIsNotNull() {
		
			addCriterion("or APPROVER_ID is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 approverId like "%value%" 模糊查询, 例子：orApproverIdLike("%value%")...
		 * @return
		 */
		public Criteria orApproverIdLike(String approverId) {
			addCriterion("or APPROVER_ID like ", approverId, "approverId");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId = "value" 传递查询条件, 例子：orApproverIdEqualTo("value")...
		 * @return
		 */
		public Criteria orApproverIdEqualTo(String approverId) {

			addCriterion("or APPROVER_ID = ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId <> "value" 传递查询条件, 例子：orApproverIdNotEqualTo("value")...
		 * @return
		 */
		public Criteria orApproverIdNotEqualTo(String approverId) {

			addCriterion("or APPROVER_ID <> ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId > "value" 传递查询条件, 例子：orApproverIdGreaterThan("value")...
		 * @return
		 */
		public Criteria orApproverIdGreaterThan(String approverId) {

			addCriterion("or APPROVER_ID > ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId >= "value" 传递查询条件, 例子：orApproverIdGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orApproverIdGreaterThanOrEqualTo(String approverId) {

			addCriterion("or APPROVER_ID >= ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId < "value" 传递查询条件 ，例子：orApproverIdLessThan("value")...
		 * @return
		 */
		public Criteria orApproverIdLessThan(String approverId) {
		
			addCriterion("or APPROVER_ID < ", approverId, "approverId");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId <= "value" 传递查询条件 ，例子：orApproverIdLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orApproverIdLessThanOrEqualTo(String approverId) {

			addCriterion("or APPROVER_ID <= ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orApproverIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orApproverIdIn(List<String> approverIds) {

			addCriterion("or APPROVER_ID in ", approverIds, "approverId");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 approverId not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orApproverIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orApproverIdNotIn(List<String> approverIds) {

			addCriterion("or APPROVER_ID not in ", approverIds, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 approverId between "value1" and "value2" 传递查询条件 ，例子：orApproverIdBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orApproverIdBetween(String approverId1, String approverId2) {

			addCriterion("or APPROVER_ID between ", approverId1, approverId2, "approverId");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 approverId not between "value1" and "value2" 传递查询条件 ，例子：orApproverIdNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orApproverIdNotBetween(String approverId1, String approverId2) {

			addCriterion("or APPROVER_ID not between ", approverId1, approverId2, "approverId");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 nowDate is null 的查询条件
		 * @return
		 */
		public Criteria orNowDateIsNull() {
		
			addCriterion("or NOW_DATE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate not null 的查询条件
		 * @return
		 */
		public Criteria orNowDateIsNotNull() {
		
			addCriterion("or NOW_DATE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 nowDate like "%value%" 模糊查询, 例子：orNowDateLike("%value%")...
		 * @return
		 */
		public Criteria orNowDateLike(String nowDate) {
			addCriterion("or NOW_DATE like ", nowDate, "nowDate");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate = "value" 传递查询条件, 例子：orNowDateEqualTo("value")...
		 * @return
		 */
		public Criteria orNowDateEqualTo(Date nowDate) {

			addCriterion("or NOW_DATE = ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate <> "value" 传递查询条件, 例子：orNowDateNotEqualTo("value")...
		 * @return
		 */
		public Criteria orNowDateNotEqualTo(Date nowDate) {

			addCriterion("or NOW_DATE <> ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate > "value" 传递查询条件, 例子：orNowDateGreaterThan("value")...
		 * @return
		 */
		public Criteria orNowDateGreaterThan(Date nowDate) {

			addCriterion("or NOW_DATE > ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate >= "value" 传递查询条件, 例子：orNowDateGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orNowDateGreaterThanOrEqualTo(Date nowDate) {

			addCriterion("or NOW_DATE >= ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate < "value" 传递查询条件 ，例子：orNowDateLessThan("value")...
		 * @return
		 */
		public Criteria orNowDateLessThan(Date nowDate) {
		
			addCriterion("or NOW_DATE < ", nowDate, "nowDate");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate <= "value" 传递查询条件 ，例子：orNowDateLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orNowDateLessThanOrEqualTo(Date nowDate) {

			addCriterion("or NOW_DATE <= ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orNowDateIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orNowDateIn(List<Date> nowDates) {

			addCriterion("or NOW_DATE in ", nowDates, "nowDate");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 nowDate not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orNowDateIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orNowDateNotIn(List<Date> nowDates) {

			addCriterion("or NOW_DATE not in ", nowDates, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 nowDate between "value1" and "value2" 传递查询条件 ，例子：orNowDateBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orNowDateBetween(Date nowDate1, Date nowDate2) {

			addCriterion("or NOW_DATE between ", nowDate1, nowDate2, "nowDate");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 nowDate not between "value1" and "value2" 传递查询条件 ，例子：orNowDateNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orNowDateNotBetween(Date nowDate1, Date nowDate2) {

			addCriterion("or NOW_DATE not between ", nowDate1, nowDate2, "nowDate");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 startTime is null 的查询条件
		 * @return
		 */
		public Criteria orStartTimeIsNull() {
		
			addCriterion("or START_TIME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime not null 的查询条件
		 * @return
		 */
		public Criteria orStartTimeIsNotNull() {
		
			addCriterion("or START_TIME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 startTime like "%value%" 模糊查询, 例子：orStartTimeLike("%value%")...
		 * @return
		 */
		public Criteria orStartTimeLike(String startTime) {
			addCriterion("or START_TIME like ", startTime, "startTime");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime = "value" 传递查询条件, 例子：orStartTimeEqualTo("value")...
		 * @return
		 */
		public Criteria orStartTimeEqualTo(Date startTime) {

			addCriterion("or START_TIME = ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime <> "value" 传递查询条件, 例子：orStartTimeNotEqualTo("value")...
		 * @return
		 */
		public Criteria orStartTimeNotEqualTo(Date startTime) {

			addCriterion("or START_TIME <> ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime > "value" 传递查询条件, 例子：orStartTimeGreaterThan("value")...
		 * @return
		 */
		public Criteria orStartTimeGreaterThan(Date startTime) {

			addCriterion("or START_TIME > ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime >= "value" 传递查询条件, 例子：orStartTimeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orStartTimeGreaterThanOrEqualTo(Date startTime) {

			addCriterion("or START_TIME >= ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime < "value" 传递查询条件 ，例子：orStartTimeLessThan("value")...
		 * @return
		 */
		public Criteria orStartTimeLessThan(Date startTime) {
		
			addCriterion("or START_TIME < ", startTime, "startTime");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime <= "value" 传递查询条件 ，例子：orStartTimeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orStartTimeLessThanOrEqualTo(Date startTime) {

			addCriterion("or START_TIME <= ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orStartTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orStartTimeIn(List<Date> startTimes) {

			addCriterion("or START_TIME in ", startTimes, "startTime");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 startTime not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orStartTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orStartTimeNotIn(List<Date> startTimes) {

			addCriterion("or START_TIME not in ", startTimes, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 startTime between "value1" and "value2" 传递查询条件 ，例子：orStartTimeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orStartTimeBetween(Date startTime1, Date startTime2) {

			addCriterion("or START_TIME between ", startTime1, startTime2, "startTime");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 startTime not between "value1" and "value2" 传递查询条件 ，例子：orStartTimeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orStartTimeNotBetween(Date startTime1, Date startTime2) {

			addCriterion("or START_TIME not between ", startTime1, startTime2, "startTime");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 endTime is null 的查询条件
		 * @return
		 */
		public Criteria orEndTimeIsNull() {
		
			addCriterion("or END_TIME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime not null 的查询条件
		 * @return
		 */
		public Criteria orEndTimeIsNotNull() {
		
			addCriterion("or END_TIME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 endTime like "%value%" 模糊查询, 例子：orEndTimeLike("%value%")...
		 * @return
		 */
		public Criteria orEndTimeLike(String endTime) {
			addCriterion("or END_TIME like ", endTime, "endTime");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime = "value" 传递查询条件, 例子：orEndTimeEqualTo("value")...
		 * @return
		 */
		public Criteria orEndTimeEqualTo(Date endTime) {

			addCriterion("or END_TIME = ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime <> "value" 传递查询条件, 例子：orEndTimeNotEqualTo("value")...
		 * @return
		 */
		public Criteria orEndTimeNotEqualTo(Date endTime) {

			addCriterion("or END_TIME <> ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime > "value" 传递查询条件, 例子：orEndTimeGreaterThan("value")...
		 * @return
		 */
		public Criteria orEndTimeGreaterThan(Date endTime) {

			addCriterion("or END_TIME > ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime >= "value" 传递查询条件, 例子：orEndTimeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orEndTimeGreaterThanOrEqualTo(Date endTime) {

			addCriterion("or END_TIME >= ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime < "value" 传递查询条件 ，例子：orEndTimeLessThan("value")...
		 * @return
		 */
		public Criteria orEndTimeLessThan(Date endTime) {
		
			addCriterion("or END_TIME < ", endTime, "endTime");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime <= "value" 传递查询条件 ，例子：orEndTimeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orEndTimeLessThanOrEqualTo(Date endTime) {

			addCriterion("or END_TIME <= ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orEndTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orEndTimeIn(List<Date> endTimes) {

			addCriterion("or END_TIME in ", endTimes, "endTime");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 endTime not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orEndTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orEndTimeNotIn(List<Date> endTimes) {

			addCriterion("or END_TIME not in ", endTimes, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 endTime between "value1" and "value2" 传递查询条件 ，例子：orEndTimeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orEndTimeBetween(Date endTime1, Date endTime2) {

			addCriterion("or END_TIME between ", endTime1, endTime2, "endTime");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 endTime not between "value1" and "value2" 传递查询条件 ，例子：orEndTimeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orEndTimeNotBetween(Date endTime1, Date endTime2) {

			addCriterion("or END_TIME not between ", endTime1, endTime2, "endTime");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 licenseStatus is null 的查询条件
		 * @return
		 */
		public Criteria orLicenseStatusIsNull() {
		
			addCriterion("or LICENSE_STATUS is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus not null 的查询条件
		 * @return
		 */
		public Criteria orLicenseStatusIsNotNull() {
		
			addCriterion("or LICENSE_STATUS is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 licenseStatus like "%value%" 模糊查询, 例子：orLicenseStatusLike("%value%")...
		 * @return
		 */
		public Criteria orLicenseStatusLike(String licenseStatus) {
			addCriterion("or LICENSE_STATUS like ", licenseStatus, "licenseStatus");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus = "value" 传递查询条件, 例子：orLicenseStatusEqualTo("value")...
		 * @return
		 */
		public Criteria orLicenseStatusEqualTo(String licenseStatus) {

			addCriterion("or LICENSE_STATUS = ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus <> "value" 传递查询条件, 例子：orLicenseStatusNotEqualTo("value")...
		 * @return
		 */
		public Criteria orLicenseStatusNotEqualTo(String licenseStatus) {

			addCriterion("or LICENSE_STATUS <> ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus > "value" 传递查询条件, 例子：orLicenseStatusGreaterThan("value")...
		 * @return
		 */
		public Criteria orLicenseStatusGreaterThan(String licenseStatus) {

			addCriterion("or LICENSE_STATUS > ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus >= "value" 传递查询条件, 例子：orLicenseStatusGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orLicenseStatusGreaterThanOrEqualTo(String licenseStatus) {

			addCriterion("or LICENSE_STATUS >= ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus < "value" 传递查询条件 ，例子：orLicenseStatusLessThan("value")...
		 * @return
		 */
		public Criteria orLicenseStatusLessThan(String licenseStatus) {
		
			addCriterion("or LICENSE_STATUS < ", licenseStatus, "licenseStatus");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus <= "value" 传递查询条件 ，例子：orLicenseStatusLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orLicenseStatusLessThanOrEqualTo(String licenseStatus) {

			addCriterion("or LICENSE_STATUS <= ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orLicenseStatusIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orLicenseStatusIn(List<String> licenseStatuss) {

			addCriterion("or LICENSE_STATUS in ", licenseStatuss, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 licenseStatus not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orLicenseStatusIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orLicenseStatusNotIn(List<String> licenseStatuss) {

			addCriterion("or LICENSE_STATUS not in ", licenseStatuss, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 licenseStatus between "value1" and "value2" 传递查询条件 ，例子：orLicenseStatusBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orLicenseStatusBetween(String licenseStatus1, String licenseStatus2) {

			addCriterion("or LICENSE_STATUS between ", licenseStatus1, licenseStatus2, "licenseStatus");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 licenseStatus not between "value1" and "value2" 传递查询条件 ，例子：orLicenseStatusNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orLicenseStatusNotBetween(String licenseStatus1, String licenseStatus2) {

			addCriterion("or LICENSE_STATUS not between ", licenseStatus1, licenseStatus2, "licenseStatus");

			return (Criteria) this;
		}

		//
		// or
		//

		/**
		 * 查询条件(or): 根据 feedback is null 的查询条件
		 * @return
		 */
		public Criteria orFeedbackIsNull() {
		
			addCriterion("or FEEDBACK is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback not null 的查询条件
		 * @return
		 */
		public Criteria orFeedbackIsNotNull() {
		
			addCriterion("or FEEDBACK is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 feedback like "%value%" 模糊查询, 例子：orFeedbackLike("%value%")...
		 * @return
		 */
		public Criteria orFeedbackLike(String feedback) {
			addCriterion("or FEEDBACK like ", feedback, "feedback");
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback = "value" 传递查询条件, 例子：orFeedbackEqualTo("value")...
		 * @return
		 */
		public Criteria orFeedbackEqualTo(String feedback) {

			addCriterion("or FEEDBACK = ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback <> "value" 传递查询条件, 例子：orFeedbackNotEqualTo("value")...
		 * @return
		 */
		public Criteria orFeedbackNotEqualTo(String feedback) {

			addCriterion("or FEEDBACK <> ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback > "value" 传递查询条件, 例子：orFeedbackGreaterThan("value")...
		 * @return
		 */
		public Criteria orFeedbackGreaterThan(String feedback) {

			addCriterion("or FEEDBACK > ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback >= "value" 传递查询条件, 例子：orFeedbackGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orFeedbackGreaterThanOrEqualTo(String feedback) {

			addCriterion("or FEEDBACK >= ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback < "value" 传递查询条件 ，例子：orFeedbackLessThan("value")...
		 * @return
		 */
		public Criteria orFeedbackLessThan(String feedback) {
		
			addCriterion("or FEEDBACK < ", feedback, "feedback");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback <= "value" 传递查询条件 ，例子：orFeedbackLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria orFeedbackLessThanOrEqualTo(String feedback) {

			addCriterion("or FEEDBACK <= ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orFeedbackIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orFeedbackIn(List<String> feedbacks) {

			addCriterion("or FEEDBACK in ", feedbacks, "feedback");

			return (Criteria) this;
		}

		/**
		 *	查询条件(or): 根据 feedback not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	orFeedbackIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria orFeedbackNotIn(List<String> feedbacks) {

			addCriterion("or FEEDBACK not in ", feedbacks, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(or): 根据 feedback between "value1" and "value2" 传递查询条件 ，例子：orFeedbackBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orFeedbackBetween(String feedback1, String feedback2) {

			addCriterion("or FEEDBACK between ", feedback1, feedback2, "feedback");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(or): 根据 feedback not between "value1" and "value2" 传递查询条件 ，例子：orFeedbackNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria orFeedbackNotBetween(String feedback1, String feedback2) {

			addCriterion("or FEEDBACK not between ", feedback1, feedback2, "feedback");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 id is null 的查询条件
		 * @return
		 */
		public Criteria andIdIsNull() {
		
			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" is null")//
					.toString());

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id not null 的查询条件
		 * @return
		 */
		public Criteria andIdIsNotNull() {
		
			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" is not null")//
					.toString());
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 id like "%value%" 模糊查询, 例子：andIdLike("%value%")...
		 * @return
		 */
		public Criteria andIdLike(String id) {
			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" like")//
					.toString(), id, "id");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id = "value" 传递查询条件, 例子：andIdEqualTo("value")...
		 * @return
		 */
		public Criteria andIdEqualTo(String id) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" = ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id <> "value" 传递查询条件, 例子：andIdNotEqualTo("value")...
		 * @return
		 */
		public Criteria andIdNotEqualTo(String id) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" <> ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id > "value" 传递查询条件, 例子：andIdGreaterThan("value")...
		 * @return
		 */
		public Criteria andIdGreaterThan(String id) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" > ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id >= "value" 传递查询条件, 例子：andIdGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andIdGreaterThanOrEqualTo(String id) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" >= ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id < "value" 传递查询条件 ，例子：andIdLessThan("value")...
		 * @return
		 */
		public Criteria andIdLessThan(String id) {
		
			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" < ")//
					.toString(), id, "id");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id <= "value" 传递查询条件 ，例子：andIdLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andIdLessThanOrEqualTo(String id) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" <= ")//
					.toString(), id, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andIdIn(List<String> ids) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" in ")//
					.toString(), ids, "id");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 id not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andIdNotIn(List<String> ids) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" not in ")//
					.toString(), ids, "id");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 id between "value1" and "value2" 传递查询条件 ，例子：andIdBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andIdBetween(String id1, String id2) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" between ")//
					.toString(), id1, id2, "id");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 id not between "value1" and "value2" 传递查询条件 ，例子：andIdNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andIdNotBetween(String id1, String id2) {

			addCriterion(new StringBuilder("and ")//
					.append(LEFT_QUOTE_CHAR)//
					.append("ID")//
					.append(RIGHT_QUOTE_CHAR)//
					.append(" between ")//
					.toString(), id1, id2, "id");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 sysName is null 的查询条件
		 * @return
		 */
		public Criteria andSysNameIsNull() {
		
			addCriterion("and SYS_NAME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName not null 的查询条件
		 * @return
		 */
		public Criteria andSysNameIsNotNull() {
		
			addCriterion("and SYS_NAME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 sysName like "%value%" 模糊查询, 例子：andSysNameLike("%value%")...
		 * @return
		 */
		public Criteria andSysNameLike(String sysName) {
			addCriterion("and SYS_NAME like ", sysName, "sysName");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName = "value" 传递查询条件, 例子：andSysNameEqualTo("value")...
		 * @return
		 */
		public Criteria andSysNameEqualTo(String sysName) {

			addCriterion("and SYS_NAME = ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName <> "value" 传递查询条件, 例子：andSysNameNotEqualTo("value")...
		 * @return
		 */
		public Criteria andSysNameNotEqualTo(String sysName) {

			addCriterion("and SYS_NAME <> ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName > "value" 传递查询条件, 例子：andSysNameGreaterThan("value")...
		 * @return
		 */
		public Criteria andSysNameGreaterThan(String sysName) {

			addCriterion("and SYS_NAME > ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName >= "value" 传递查询条件, 例子：andSysNameGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andSysNameGreaterThanOrEqualTo(String sysName) {

			addCriterion("and SYS_NAME >= ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName < "value" 传递查询条件 ，例子：andSysNameLessThan("value")...
		 * @return
		 */
		public Criteria andSysNameLessThan(String sysName) {
		
			addCriterion("and SYS_NAME < ", sysName, "sysName");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName <= "value" 传递查询条件 ，例子：andSysNameLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andSysNameLessThanOrEqualTo(String sysName) {

			addCriterion("and SYS_NAME <= ", sysName, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andSysNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andSysNameIn(List<String> sysNames) {

			addCriterion("and SYS_NAME in ", sysNames, "sysName");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 sysName not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andSysNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andSysNameNotIn(List<String> sysNames) {

			addCriterion("and SYS_NAME not in ", sysNames, "sysName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 sysName between "value1" and "value2" 传递查询条件 ，例子：andSysNameBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andSysNameBetween(String sysName1, String sysName2) {

			addCriterion("and SYS_NAME between ", sysName1, sysName2, "sysName");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 sysName not between "value1" and "value2" 传递查询条件 ，例子：andSysNameNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andSysNameNotBetween(String sysName1, String sysName2) {

			addCriterion("and SYS_NAME not between ", sysName1, sysName2, "sysName");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 permissionType is null 的查询条件
		 * @return
		 */
		public Criteria andPermissionTypeIsNull() {
		
			addCriterion("and PERMISSION_TYPE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType not null 的查询条件
		 * @return
		 */
		public Criteria andPermissionTypeIsNotNull() {
		
			addCriterion("and PERMISSION_TYPE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 permissionType like "%value%" 模糊查询, 例子：andPermissionTypeLike("%value%")...
		 * @return
		 */
		public Criteria andPermissionTypeLike(String permissionType) {
			addCriterion("and PERMISSION_TYPE like ", permissionType, "permissionType");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType = "value" 传递查询条件, 例子：andPermissionTypeEqualTo("value")...
		 * @return
		 */
		public Criteria andPermissionTypeEqualTo(String permissionType) {

			addCriterion("and PERMISSION_TYPE = ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType <> "value" 传递查询条件, 例子：andPermissionTypeNotEqualTo("value")...
		 * @return
		 */
		public Criteria andPermissionTypeNotEqualTo(String permissionType) {

			addCriterion("and PERMISSION_TYPE <> ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType > "value" 传递查询条件, 例子：andPermissionTypeGreaterThan("value")...
		 * @return
		 */
		public Criteria andPermissionTypeGreaterThan(String permissionType) {

			addCriterion("and PERMISSION_TYPE > ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType >= "value" 传递查询条件, 例子：andPermissionTypeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andPermissionTypeGreaterThanOrEqualTo(String permissionType) {

			addCriterion("and PERMISSION_TYPE >= ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType < "value" 传递查询条件 ，例子：andPermissionTypeLessThan("value")...
		 * @return
		 */
		public Criteria andPermissionTypeLessThan(String permissionType) {
		
			addCriterion("and PERMISSION_TYPE < ", permissionType, "permissionType");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType <= "value" 传递查询条件 ，例子：andPermissionTypeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andPermissionTypeLessThanOrEqualTo(String permissionType) {

			addCriterion("and PERMISSION_TYPE <= ", permissionType, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andPermissionTypeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andPermissionTypeIn(List<String> permissionTypes) {

			addCriterion("and PERMISSION_TYPE in ", permissionTypes, "permissionType");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 permissionType not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andPermissionTypeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andPermissionTypeNotIn(List<String> permissionTypes) {

			addCriterion("and PERMISSION_TYPE not in ", permissionTypes, "permissionType");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 permissionType between "value1" and "value2" 传递查询条件 ，例子：andPermissionTypeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andPermissionTypeBetween(String permissionType1, String permissionType2) {

			addCriterion("and PERMISSION_TYPE between ", permissionType1, permissionType2, "permissionType");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 permissionType not between "value1" and "value2" 传递查询条件 ，例子：andPermissionTypeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andPermissionTypeNotBetween(String permissionType1, String permissionType2) {

			addCriterion("and PERMISSION_TYPE not between ", permissionType1, permissionType2, "permissionType");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 proposer is null 的查询条件
		 * @return
		 */
		public Criteria andProposerIsNull() {
		
			addCriterion("and PROPOSER is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer not null 的查询条件
		 * @return
		 */
		public Criteria andProposerIsNotNull() {
		
			addCriterion("and PROPOSER is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 proposer like "%value%" 模糊查询, 例子：andProposerLike("%value%")...
		 * @return
		 */
		public Criteria andProposerLike(String proposer) {
			addCriterion("and PROPOSER like ", proposer, "proposer");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer = "value" 传递查询条件, 例子：andProposerEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerEqualTo(String proposer) {

			addCriterion("and PROPOSER = ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer <> "value" 传递查询条件, 例子：andProposerNotEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerNotEqualTo(String proposer) {

			addCriterion("and PROPOSER <> ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer > "value" 传递查询条件, 例子：andProposerGreaterThan("value")...
		 * @return
		 */
		public Criteria andProposerGreaterThan(String proposer) {

			addCriterion("and PROPOSER > ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer >= "value" 传递查询条件, 例子：andProposerGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerGreaterThanOrEqualTo(String proposer) {

			addCriterion("and PROPOSER >= ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer < "value" 传递查询条件 ，例子：andProposerLessThan("value")...
		 * @return
		 */
		public Criteria andProposerLessThan(String proposer) {
		
			addCriterion("and PROPOSER < ", proposer, "proposer");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer <= "value" 传递查询条件 ，例子：andProposerLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerLessThanOrEqualTo(String proposer) {

			addCriterion("and PROPOSER <= ", proposer, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProposerIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProposerIn(List<String> proposers) {

			addCriterion("and PROPOSER in ", proposers, "proposer");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 proposer not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProposerIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProposerNotIn(List<String> proposers) {

			addCriterion("and PROPOSER not in ", proposers, "proposer");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposer between "value1" and "value2" 传递查询条件 ，例子：andProposerBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProposerBetween(String proposer1, String proposer2) {

			addCriterion("and PROPOSER between ", proposer1, proposer2, "proposer");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 proposer not between "value1" and "value2" 传递查询条件 ，例子：andProposerNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProposerNotBetween(String proposer1, String proposer2) {

			addCriterion("and PROPOSER not between ", proposer1, proposer2, "proposer");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 applicantTime is null 的查询条件
		 * @return
		 */
		public Criteria andApplicantTimeIsNull() {
		
			addCriterion("and APPLICANT_TIME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime not null 的查询条件
		 * @return
		 */
		public Criteria andApplicantTimeIsNotNull() {
		
			addCriterion("and APPLICANT_TIME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 applicantTime like "%value%" 模糊查询, 例子：andApplicantTimeLike("%value%")...
		 * @return
		 */
		public Criteria andApplicantTimeLike(String applicantTime) {
			addCriterion("and APPLICANT_TIME like ", applicantTime, "applicantTime");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime = "value" 传递查询条件, 例子：andApplicantTimeEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantTimeEqualTo(Date applicantTime) {

			addCriterion("and APPLICANT_TIME = ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime <> "value" 传递查询条件, 例子：andApplicantTimeNotEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantTimeNotEqualTo(Date applicantTime) {

			addCriterion("and APPLICANT_TIME <> ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime > "value" 传递查询条件, 例子：andApplicantTimeGreaterThan("value")...
		 * @return
		 */
		public Criteria andApplicantTimeGreaterThan(Date applicantTime) {

			addCriterion("and APPLICANT_TIME > ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime >= "value" 传递查询条件, 例子：andApplicantTimeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantTimeGreaterThanOrEqualTo(Date applicantTime) {

			addCriterion("and APPLICANT_TIME >= ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime < "value" 传递查询条件 ，例子：andApplicantTimeLessThan("value")...
		 * @return
		 */
		public Criteria andApplicantTimeLessThan(Date applicantTime) {
		
			addCriterion("and APPLICANT_TIME < ", applicantTime, "applicantTime");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime <= "value" 传递查询条件 ，例子：andApplicantTimeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantTimeLessThanOrEqualTo(Date applicantTime) {

			addCriterion("and APPLICANT_TIME <= ", applicantTime, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andApplicantTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andApplicantTimeIn(List<Date> applicantTimes) {

			addCriterion("and APPLICANT_TIME in ", applicantTimes, "applicantTime");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 applicantTime not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andApplicantTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andApplicantTimeNotIn(List<Date> applicantTimes) {

			addCriterion("and APPLICANT_TIME not in ", applicantTimes, "applicantTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantTime between "value1" and "value2" 传递查询条件 ，例子：andApplicantTimeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andApplicantTimeBetween(Date applicantTime1, Date applicantTime2) {

			addCriterion("and APPLICANT_TIME between ", applicantTime1, applicantTime2, "applicantTime");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 applicantTime not between "value1" and "value2" 传递查询条件 ，例子：andApplicantTimeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andApplicantTimeNotBetween(Date applicantTime1, Date applicantTime2) {

			addCriterion("and APPLICANT_TIME not between ", applicantTime1, applicantTime2, "applicantTime");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 applicantCompany is null 的查询条件
		 * @return
		 */
		public Criteria andApplicantCompanyIsNull() {
		
			addCriterion("and APPLICANT_COMPANY is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany not null 的查询条件
		 * @return
		 */
		public Criteria andApplicantCompanyIsNotNull() {
		
			addCriterion("and APPLICANT_COMPANY is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 applicantCompany like "%value%" 模糊查询, 例子：andApplicantCompanyLike("%value%")...
		 * @return
		 */
		public Criteria andApplicantCompanyLike(String applicantCompany) {
			addCriterion("and APPLICANT_COMPANY like ", applicantCompany, "applicantCompany");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany = "value" 传递查询条件, 例子：andApplicantCompanyEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantCompanyEqualTo(String applicantCompany) {

			addCriterion("and APPLICANT_COMPANY = ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany <> "value" 传递查询条件, 例子：andApplicantCompanyNotEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantCompanyNotEqualTo(String applicantCompany) {

			addCriterion("and APPLICANT_COMPANY <> ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany > "value" 传递查询条件, 例子：andApplicantCompanyGreaterThan("value")...
		 * @return
		 */
		public Criteria andApplicantCompanyGreaterThan(String applicantCompany) {

			addCriterion("and APPLICANT_COMPANY > ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany >= "value" 传递查询条件, 例子：andApplicantCompanyGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantCompanyGreaterThanOrEqualTo(String applicantCompany) {

			addCriterion("and APPLICANT_COMPANY >= ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany < "value" 传递查询条件 ，例子：andApplicantCompanyLessThan("value")...
		 * @return
		 */
		public Criteria andApplicantCompanyLessThan(String applicantCompany) {
		
			addCriterion("and APPLICANT_COMPANY < ", applicantCompany, "applicantCompany");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany <= "value" 传递查询条件 ，例子：andApplicantCompanyLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andApplicantCompanyLessThanOrEqualTo(String applicantCompany) {

			addCriterion("and APPLICANT_COMPANY <= ", applicantCompany, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andApplicantCompanyIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andApplicantCompanyIn(List<String> applicantCompanys) {

			addCriterion("and APPLICANT_COMPANY in ", applicantCompanys, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 applicantCompany not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andApplicantCompanyIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andApplicantCompanyNotIn(List<String> applicantCompanys) {

			addCriterion("and APPLICANT_COMPANY not in ", applicantCompanys, "applicantCompany");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 applicantCompany between "value1" and "value2" 传递查询条件 ，例子：andApplicantCompanyBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andApplicantCompanyBetween(String applicantCompany1, String applicantCompany2) {

			addCriterion("and APPLICANT_COMPANY between ", applicantCompany1, applicantCompany2, "applicantCompany");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 applicantCompany not between "value1" and "value2" 传递查询条件 ，例子：andApplicantCompanyNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andApplicantCompanyNotBetween(String applicantCompany1, String applicantCompany2) {

			addCriterion("and APPLICANT_COMPANY not between ", applicantCompany1, applicantCompany2, "applicantCompany");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 projectName is null 的查询条件
		 * @return
		 */
		public Criteria andProjectNameIsNull() {
		
			addCriterion("and PROJECT_NAME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName not null 的查询条件
		 * @return
		 */
		public Criteria andProjectNameIsNotNull() {
		
			addCriterion("and PROJECT_NAME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 projectName like "%value%" 模糊查询, 例子：andProjectNameLike("%value%")...
		 * @return
		 */
		public Criteria andProjectNameLike(String projectName) {
			addCriterion("and PROJECT_NAME like ", projectName, "projectName");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName = "value" 传递查询条件, 例子：andProjectNameEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNameEqualTo(String projectName) {

			addCriterion("and PROJECT_NAME = ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName <> "value" 传递查询条件, 例子：andProjectNameNotEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNameNotEqualTo(String projectName) {

			addCriterion("and PROJECT_NAME <> ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName > "value" 传递查询条件, 例子：andProjectNameGreaterThan("value")...
		 * @return
		 */
		public Criteria andProjectNameGreaterThan(String projectName) {

			addCriterion("and PROJECT_NAME > ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName >= "value" 传递查询条件, 例子：andProjectNameGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNameGreaterThanOrEqualTo(String projectName) {

			addCriterion("and PROJECT_NAME >= ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName < "value" 传递查询条件 ，例子：andProjectNameLessThan("value")...
		 * @return
		 */
		public Criteria andProjectNameLessThan(String projectName) {
		
			addCriterion("and PROJECT_NAME < ", projectName, "projectName");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName <= "value" 传递查询条件 ，例子：andProjectNameLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNameLessThanOrEqualTo(String projectName) {

			addCriterion("and PROJECT_NAME <= ", projectName, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProjectNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProjectNameIn(List<String> projectNames) {

			addCriterion("and PROJECT_NAME in ", projectNames, "projectName");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 projectName not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProjectNameIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProjectNameNotIn(List<String> projectNames) {

			addCriterion("and PROJECT_NAME not in ", projectNames, "projectName");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectName between "value1" and "value2" 传递查询条件 ，例子：andProjectNameBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProjectNameBetween(String projectName1, String projectName2) {

			addCriterion("and PROJECT_NAME between ", projectName1, projectName2, "projectName");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 projectName not between "value1" and "value2" 传递查询条件 ，例子：andProjectNameNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProjectNameNotBetween(String projectName1, String projectName2) {

			addCriterion("and PROJECT_NAME not between ", projectName1, projectName2, "projectName");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 projectNo is null 的查询条件
		 * @return
		 */
		public Criteria andProjectNoIsNull() {
		
			addCriterion("and PROJECT_NO is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo not null 的查询条件
		 * @return
		 */
		public Criteria andProjectNoIsNotNull() {
		
			addCriterion("and PROJECT_NO is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 projectNo like "%value%" 模糊查询, 例子：andProjectNoLike("%value%")...
		 * @return
		 */
		public Criteria andProjectNoLike(String projectNo) {
			addCriterion("and PROJECT_NO like ", projectNo, "projectNo");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo = "value" 传递查询条件, 例子：andProjectNoEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNoEqualTo(String projectNo) {

			addCriterion("and PROJECT_NO = ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo <> "value" 传递查询条件, 例子：andProjectNoNotEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNoNotEqualTo(String projectNo) {

			addCriterion("and PROJECT_NO <> ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo > "value" 传递查询条件, 例子：andProjectNoGreaterThan("value")...
		 * @return
		 */
		public Criteria andProjectNoGreaterThan(String projectNo) {

			addCriterion("and PROJECT_NO > ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo >= "value" 传递查询条件, 例子：andProjectNoGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNoGreaterThanOrEqualTo(String projectNo) {

			addCriterion("and PROJECT_NO >= ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo < "value" 传递查询条件 ，例子：andProjectNoLessThan("value")...
		 * @return
		 */
		public Criteria andProjectNoLessThan(String projectNo) {
		
			addCriterion("and PROJECT_NO < ", projectNo, "projectNo");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo <= "value" 传递查询条件 ，例子：andProjectNoLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectNoLessThanOrEqualTo(String projectNo) {

			addCriterion("and PROJECT_NO <= ", projectNo, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProjectNoIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProjectNoIn(List<String> projectNos) {

			addCriterion("and PROJECT_NO in ", projectNos, "projectNo");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 projectNo not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProjectNoIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProjectNoNotIn(List<String> projectNos) {

			addCriterion("and PROJECT_NO not in ", projectNos, "projectNo");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectNo between "value1" and "value2" 传递查询条件 ，例子：andProjectNoBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProjectNoBetween(String projectNo1, String projectNo2) {

			addCriterion("and PROJECT_NO between ", projectNo1, projectNo2, "projectNo");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 projectNo not between "value1" and "value2" 传递查询条件 ，例子：andProjectNoNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProjectNoNotBetween(String projectNo1, String projectNo2) {

			addCriterion("and PROJECT_NO not between ", projectNo1, projectNo2, "projectNo");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 projectDetails is null 的查询条件
		 * @return
		 */
		public Criteria andProjectDetailsIsNull() {
		
			addCriterion("and PROJECT_DETAILS is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails not null 的查询条件
		 * @return
		 */
		public Criteria andProjectDetailsIsNotNull() {
		
			addCriterion("and PROJECT_DETAILS is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 projectDetails like "%value%" 模糊查询, 例子：andProjectDetailsLike("%value%")...
		 * @return
		 */
		public Criteria andProjectDetailsLike(String projectDetails) {
			addCriterion("and PROJECT_DETAILS like ", projectDetails, "projectDetails");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails = "value" 传递查询条件, 例子：andProjectDetailsEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectDetailsEqualTo(String projectDetails) {

			addCriterion("and PROJECT_DETAILS = ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails <> "value" 传递查询条件, 例子：andProjectDetailsNotEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectDetailsNotEqualTo(String projectDetails) {

			addCriterion("and PROJECT_DETAILS <> ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails > "value" 传递查询条件, 例子：andProjectDetailsGreaterThan("value")...
		 * @return
		 */
		public Criteria andProjectDetailsGreaterThan(String projectDetails) {

			addCriterion("and PROJECT_DETAILS > ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails >= "value" 传递查询条件, 例子：andProjectDetailsGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectDetailsGreaterThanOrEqualTo(String projectDetails) {

			addCriterion("and PROJECT_DETAILS >= ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails < "value" 传递查询条件 ，例子：andProjectDetailsLessThan("value")...
		 * @return
		 */
		public Criteria andProjectDetailsLessThan(String projectDetails) {
		
			addCriterion("and PROJECT_DETAILS < ", projectDetails, "projectDetails");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails <= "value" 传递查询条件 ，例子：andProjectDetailsLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProjectDetailsLessThanOrEqualTo(String projectDetails) {

			addCriterion("and PROJECT_DETAILS <= ", projectDetails, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProjectDetailsIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProjectDetailsIn(List<String> projectDetailss) {

			addCriterion("and PROJECT_DETAILS in ", projectDetailss, "projectDetails");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 projectDetails not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProjectDetailsIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProjectDetailsNotIn(List<String> projectDetailss) {

			addCriterion("and PROJECT_DETAILS not in ", projectDetailss, "projectDetails");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 projectDetails between "value1" and "value2" 传递查询条件 ，例子：andProjectDetailsBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProjectDetailsBetween(String projectDetails1, String projectDetails2) {

			addCriterion("and PROJECT_DETAILS between ", projectDetails1, projectDetails2, "projectDetails");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 projectDetails not between "value1" and "value2" 传递查询条件 ，例子：andProjectDetailsNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProjectDetailsNotBetween(String projectDetails1, String projectDetails2) {

			addCriterion("and PROJECT_DETAILS not between ", projectDetails1, projectDetails2, "projectDetails");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 machineCode is null 的查询条件
		 * @return
		 */
		public Criteria andMachineCodeIsNull() {
		
			addCriterion("and MACHINE_CODE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode not null 的查询条件
		 * @return
		 */
		public Criteria andMachineCodeIsNotNull() {
		
			addCriterion("and MACHINE_CODE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 machineCode like "%value%" 模糊查询, 例子：andMachineCodeLike("%value%")...
		 * @return
		 */
		public Criteria andMachineCodeLike(String machineCode) {
			addCriterion("and MACHINE_CODE like ", machineCode, "machineCode");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode = "value" 传递查询条件, 例子：andMachineCodeEqualTo("value")...
		 * @return
		 */
		public Criteria andMachineCodeEqualTo(String machineCode) {

			addCriterion("and MACHINE_CODE = ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode <> "value" 传递查询条件, 例子：andMachineCodeNotEqualTo("value")...
		 * @return
		 */
		public Criteria andMachineCodeNotEqualTo(String machineCode) {

			addCriterion("and MACHINE_CODE <> ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode > "value" 传递查询条件, 例子：andMachineCodeGreaterThan("value")...
		 * @return
		 */
		public Criteria andMachineCodeGreaterThan(String machineCode) {

			addCriterion("and MACHINE_CODE > ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode >= "value" 传递查询条件, 例子：andMachineCodeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andMachineCodeGreaterThanOrEqualTo(String machineCode) {

			addCriterion("and MACHINE_CODE >= ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode < "value" 传递查询条件 ，例子：andMachineCodeLessThan("value")...
		 * @return
		 */
		public Criteria andMachineCodeLessThan(String machineCode) {
		
			addCriterion("and MACHINE_CODE < ", machineCode, "machineCode");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode <= "value" 传递查询条件 ，例子：andMachineCodeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andMachineCodeLessThanOrEqualTo(String machineCode) {

			addCriterion("and MACHINE_CODE <= ", machineCode, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andMachineCodeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andMachineCodeIn(List<String> machineCodes) {

			addCriterion("and MACHINE_CODE in ", machineCodes, "machineCode");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 machineCode not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andMachineCodeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andMachineCodeNotIn(List<String> machineCodes) {

			addCriterion("and MACHINE_CODE not in ", machineCodes, "machineCode");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 machineCode between "value1" and "value2" 传递查询条件 ，例子：andMachineCodeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andMachineCodeBetween(String machineCode1, String machineCode2) {

			addCriterion("and MACHINE_CODE between ", machineCode1, machineCode2, "machineCode");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 machineCode not between "value1" and "value2" 传递查询条件 ，例子：andMachineCodeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andMachineCodeNotBetween(String machineCode1, String machineCode2) {

			addCriterion("and MACHINE_CODE not between ", machineCode1, machineCode2, "machineCode");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 phone is null 的查询条件
		 * @return
		 */
		public Criteria andPhoneIsNull() {
		
			addCriterion("and PHONE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone not null 的查询条件
		 * @return
		 */
		public Criteria andPhoneIsNotNull() {
		
			addCriterion("and PHONE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 phone like "%value%" 模糊查询, 例子：andPhoneLike("%value%")...
		 * @return
		 */
		public Criteria andPhoneLike(String phone) {
			addCriterion("and PHONE like ", phone, "phone");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone = "value" 传递查询条件, 例子：andPhoneEqualTo("value")...
		 * @return
		 */
		public Criteria andPhoneEqualTo(String phone) {

			addCriterion("and PHONE = ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone <> "value" 传递查询条件, 例子：andPhoneNotEqualTo("value")...
		 * @return
		 */
		public Criteria andPhoneNotEqualTo(String phone) {

			addCriterion("and PHONE <> ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone > "value" 传递查询条件, 例子：andPhoneGreaterThan("value")...
		 * @return
		 */
		public Criteria andPhoneGreaterThan(String phone) {

			addCriterion("and PHONE > ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone >= "value" 传递查询条件, 例子：andPhoneGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andPhoneGreaterThanOrEqualTo(String phone) {

			addCriterion("and PHONE >= ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone < "value" 传递查询条件 ，例子：andPhoneLessThan("value")...
		 * @return
		 */
		public Criteria andPhoneLessThan(String phone) {
		
			addCriterion("and PHONE < ", phone, "phone");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone <= "value" 传递查询条件 ，例子：andPhoneLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andPhoneLessThanOrEqualTo(String phone) {

			addCriterion("and PHONE <= ", phone, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andPhoneIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andPhoneIn(List<String> phones) {

			addCriterion("and PHONE in ", phones, "phone");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 phone not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andPhoneIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andPhoneNotIn(List<String> phones) {

			addCriterion("and PHONE not in ", phones, "phone");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 phone between "value1" and "value2" 传递查询条件 ，例子：andPhoneBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andPhoneBetween(String phone1, String phone2) {

			addCriterion("and PHONE between ", phone1, phone2, "phone");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 phone not between "value1" and "value2" 传递查询条件 ，例子：andPhoneNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andPhoneNotBetween(String phone1, String phone2) {

			addCriterion("and PHONE not between ", phone1, phone2, "phone");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 mailBox is null 的查询条件
		 * @return
		 */
		public Criteria andMailBoxIsNull() {
		
			addCriterion("and MAIL_BOX is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox not null 的查询条件
		 * @return
		 */
		public Criteria andMailBoxIsNotNull() {
		
			addCriterion("and MAIL_BOX is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 mailBox like "%value%" 模糊查询, 例子：andMailBoxLike("%value%")...
		 * @return
		 */
		public Criteria andMailBoxLike(String mailBox) {
			addCriterion("and MAIL_BOX like ", mailBox, "mailBox");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox = "value" 传递查询条件, 例子：andMailBoxEqualTo("value")...
		 * @return
		 */
		public Criteria andMailBoxEqualTo(String mailBox) {

			addCriterion("and MAIL_BOX = ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox <> "value" 传递查询条件, 例子：andMailBoxNotEqualTo("value")...
		 * @return
		 */
		public Criteria andMailBoxNotEqualTo(String mailBox) {

			addCriterion("and MAIL_BOX <> ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox > "value" 传递查询条件, 例子：andMailBoxGreaterThan("value")...
		 * @return
		 */
		public Criteria andMailBoxGreaterThan(String mailBox) {

			addCriterion("and MAIL_BOX > ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox >= "value" 传递查询条件, 例子：andMailBoxGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andMailBoxGreaterThanOrEqualTo(String mailBox) {

			addCriterion("and MAIL_BOX >= ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox < "value" 传递查询条件 ，例子：andMailBoxLessThan("value")...
		 * @return
		 */
		public Criteria andMailBoxLessThan(String mailBox) {
		
			addCriterion("and MAIL_BOX < ", mailBox, "mailBox");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox <= "value" 传递查询条件 ，例子：andMailBoxLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andMailBoxLessThanOrEqualTo(String mailBox) {

			addCriterion("and MAIL_BOX <= ", mailBox, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andMailBoxIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andMailBoxIn(List<String> mailBoxs) {

			addCriterion("and MAIL_BOX in ", mailBoxs, "mailBox");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 mailBox not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andMailBoxIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andMailBoxNotIn(List<String> mailBoxs) {

			addCriterion("and MAIL_BOX not in ", mailBoxs, "mailBox");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 mailBox between "value1" and "value2" 传递查询条件 ，例子：andMailBoxBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andMailBoxBetween(String mailBox1, String mailBox2) {

			addCriterion("and MAIL_BOX between ", mailBox1, mailBox2, "mailBox");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 mailBox not between "value1" and "value2" 传递查询条件 ，例子：andMailBoxNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andMailBoxNotBetween(String mailBox1, String mailBox2) {

			addCriterion("and MAIL_BOX not between ", mailBox1, mailBox2, "mailBox");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 note is null 的查询条件
		 * @return
		 */
		public Criteria andNoteIsNull() {
		
			addCriterion("and NOTE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note not null 的查询条件
		 * @return
		 */
		public Criteria andNoteIsNotNull() {
		
			addCriterion("and NOTE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 note like "%value%" 模糊查询, 例子：andNoteLike("%value%")...
		 * @return
		 */
		public Criteria andNoteLike(String note) {
			addCriterion("and NOTE like ", note, "note");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note = "value" 传递查询条件, 例子：andNoteEqualTo("value")...
		 * @return
		 */
		public Criteria andNoteEqualTo(String note) {

			addCriterion("and NOTE = ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note <> "value" 传递查询条件, 例子：andNoteNotEqualTo("value")...
		 * @return
		 */
		public Criteria andNoteNotEqualTo(String note) {

			addCriterion("and NOTE <> ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note > "value" 传递查询条件, 例子：andNoteGreaterThan("value")...
		 * @return
		 */
		public Criteria andNoteGreaterThan(String note) {

			addCriterion("and NOTE > ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note >= "value" 传递查询条件, 例子：andNoteGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andNoteGreaterThanOrEqualTo(String note) {

			addCriterion("and NOTE >= ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note < "value" 传递查询条件 ，例子：andNoteLessThan("value")...
		 * @return
		 */
		public Criteria andNoteLessThan(String note) {
		
			addCriterion("and NOTE < ", note, "note");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note <= "value" 传递查询条件 ，例子：andNoteLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andNoteLessThanOrEqualTo(String note) {

			addCriterion("and NOTE <= ", note, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andNoteIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andNoteIn(List<String> notes) {

			addCriterion("and NOTE in ", notes, "note");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 note not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andNoteIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andNoteNotIn(List<String> notes) {

			addCriterion("and NOTE not in ", notes, "note");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 note between "value1" and "value2" 传递查询条件 ，例子：andNoteBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andNoteBetween(String note1, String note2) {

			addCriterion("and NOTE between ", note1, note2, "note");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 note not between "value1" and "value2" 传递查询条件 ，例子：andNoteNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andNoteNotBetween(String note1, String note2) {

			addCriterion("and NOTE not between ", note1, note2, "note");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 proposerId is null 的查询条件
		 * @return
		 */
		public Criteria andProposerIdIsNull() {
		
			addCriterion("and PROPOSER_ID is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId not null 的查询条件
		 * @return
		 */
		public Criteria andProposerIdIsNotNull() {
		
			addCriterion("and PROPOSER_ID is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 proposerId like "%value%" 模糊查询, 例子：andProposerIdLike("%value%")...
		 * @return
		 */
		public Criteria andProposerIdLike(String proposerId) {
			addCriterion("and PROPOSER_ID like ", proposerId, "proposerId");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId = "value" 传递查询条件, 例子：andProposerIdEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerIdEqualTo(String proposerId) {

			addCriterion("and PROPOSER_ID = ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId <> "value" 传递查询条件, 例子：andProposerIdNotEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerIdNotEqualTo(String proposerId) {

			addCriterion("and PROPOSER_ID <> ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId > "value" 传递查询条件, 例子：andProposerIdGreaterThan("value")...
		 * @return
		 */
		public Criteria andProposerIdGreaterThan(String proposerId) {

			addCriterion("and PROPOSER_ID > ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId >= "value" 传递查询条件, 例子：andProposerIdGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerIdGreaterThanOrEqualTo(String proposerId) {

			addCriterion("and PROPOSER_ID >= ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId < "value" 传递查询条件 ，例子：andProposerIdLessThan("value")...
		 * @return
		 */
		public Criteria andProposerIdLessThan(String proposerId) {
		
			addCriterion("and PROPOSER_ID < ", proposerId, "proposerId");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId <= "value" 传递查询条件 ，例子：andProposerIdLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andProposerIdLessThanOrEqualTo(String proposerId) {

			addCriterion("and PROPOSER_ID <= ", proposerId, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProposerIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProposerIdIn(List<String> proposerIds) {

			addCriterion("and PROPOSER_ID in ", proposerIds, "proposerId");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 proposerId not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andProposerIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andProposerIdNotIn(List<String> proposerIds) {

			addCriterion("and PROPOSER_ID not in ", proposerIds, "proposerId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 proposerId between "value1" and "value2" 传递查询条件 ，例子：andProposerIdBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProposerIdBetween(String proposerId1, String proposerId2) {

			addCriterion("and PROPOSER_ID between ", proposerId1, proposerId2, "proposerId");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 proposerId not between "value1" and "value2" 传递查询条件 ，例子：andProposerIdNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andProposerIdNotBetween(String proposerId1, String proposerId2) {

			addCriterion("and PROPOSER_ID not between ", proposerId1, proposerId2, "proposerId");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 approverId is null 的查询条件
		 * @return
		 */
		public Criteria andApproverIdIsNull() {
		
			addCriterion("and APPROVER_ID is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId not null 的查询条件
		 * @return
		 */
		public Criteria andApproverIdIsNotNull() {
		
			addCriterion("and APPROVER_ID is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 approverId like "%value%" 模糊查询, 例子：andApproverIdLike("%value%")...
		 * @return
		 */
		public Criteria andApproverIdLike(String approverId) {
			addCriterion("and APPROVER_ID like ", approverId, "approverId");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId = "value" 传递查询条件, 例子：andApproverIdEqualTo("value")...
		 * @return
		 */
		public Criteria andApproverIdEqualTo(String approverId) {

			addCriterion("and APPROVER_ID = ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId <> "value" 传递查询条件, 例子：andApproverIdNotEqualTo("value")...
		 * @return
		 */
		public Criteria andApproverIdNotEqualTo(String approverId) {

			addCriterion("and APPROVER_ID <> ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId > "value" 传递查询条件, 例子：andApproverIdGreaterThan("value")...
		 * @return
		 */
		public Criteria andApproverIdGreaterThan(String approverId) {

			addCriterion("and APPROVER_ID > ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId >= "value" 传递查询条件, 例子：andApproverIdGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andApproverIdGreaterThanOrEqualTo(String approverId) {

			addCriterion("and APPROVER_ID >= ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId < "value" 传递查询条件 ，例子：andApproverIdLessThan("value")...
		 * @return
		 */
		public Criteria andApproverIdLessThan(String approverId) {
		
			addCriterion("and APPROVER_ID < ", approverId, "approverId");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId <= "value" 传递查询条件 ，例子：andApproverIdLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andApproverIdLessThanOrEqualTo(String approverId) {

			addCriterion("and APPROVER_ID <= ", approverId, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andApproverIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andApproverIdIn(List<String> approverIds) {

			addCriterion("and APPROVER_ID in ", approverIds, "approverId");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 approverId not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andApproverIdIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andApproverIdNotIn(List<String> approverIds) {

			addCriterion("and APPROVER_ID not in ", approverIds, "approverId");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 approverId between "value1" and "value2" 传递查询条件 ，例子：andApproverIdBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andApproverIdBetween(String approverId1, String approverId2) {

			addCriterion("and APPROVER_ID between ", approverId1, approverId2, "approverId");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 approverId not between "value1" and "value2" 传递查询条件 ，例子：andApproverIdNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andApproverIdNotBetween(String approverId1, String approverId2) {

			addCriterion("and APPROVER_ID not between ", approverId1, approverId2, "approverId");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 nowDate is null 的查询条件
		 * @return
		 */
		public Criteria andNowDateIsNull() {
		
			addCriterion("and NOW_DATE is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate not null 的查询条件
		 * @return
		 */
		public Criteria andNowDateIsNotNull() {
		
			addCriterion("and NOW_DATE is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 nowDate like "%value%" 模糊查询, 例子：andNowDateLike("%value%")...
		 * @return
		 */
		public Criteria andNowDateLike(String nowDate) {
			addCriterion("and NOW_DATE like ", nowDate, "nowDate");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate = "value" 传递查询条件, 例子：andNowDateEqualTo("value")...
		 * @return
		 */
		public Criteria andNowDateEqualTo(Date nowDate) {

			addCriterion("and NOW_DATE = ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate <> "value" 传递查询条件, 例子：andNowDateNotEqualTo("value")...
		 * @return
		 */
		public Criteria andNowDateNotEqualTo(Date nowDate) {

			addCriterion("and NOW_DATE <> ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate > "value" 传递查询条件, 例子：andNowDateGreaterThan("value")...
		 * @return
		 */
		public Criteria andNowDateGreaterThan(Date nowDate) {

			addCriterion("and NOW_DATE > ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate >= "value" 传递查询条件, 例子：andNowDateGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andNowDateGreaterThanOrEqualTo(Date nowDate) {

			addCriterion("and NOW_DATE >= ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate < "value" 传递查询条件 ，例子：andNowDateLessThan("value")...
		 * @return
		 */
		public Criteria andNowDateLessThan(Date nowDate) {
		
			addCriterion("and NOW_DATE < ", nowDate, "nowDate");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate <= "value" 传递查询条件 ，例子：andNowDateLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andNowDateLessThanOrEqualTo(Date nowDate) {

			addCriterion("and NOW_DATE <= ", nowDate, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andNowDateIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andNowDateIn(List<Date> nowDates) {

			addCriterion("and NOW_DATE in ", nowDates, "nowDate");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 nowDate not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andNowDateIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andNowDateNotIn(List<Date> nowDates) {

			addCriterion("and NOW_DATE not in ", nowDates, "nowDate");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 nowDate between "value1" and "value2" 传递查询条件 ，例子：andNowDateBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andNowDateBetween(Date nowDate1, Date nowDate2) {

			addCriterion("and NOW_DATE between ", nowDate1, nowDate2, "nowDate");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 nowDate not between "value1" and "value2" 传递查询条件 ，例子：andNowDateNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andNowDateNotBetween(Date nowDate1, Date nowDate2) {

			addCriterion("and NOW_DATE not between ", nowDate1, nowDate2, "nowDate");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 startTime is null 的查询条件
		 * @return
		 */
		public Criteria andStartTimeIsNull() {
		
			addCriterion("and START_TIME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime not null 的查询条件
		 * @return
		 */
		public Criteria andStartTimeIsNotNull() {
		
			addCriterion("and START_TIME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 startTime like "%value%" 模糊查询, 例子：andStartTimeLike("%value%")...
		 * @return
		 */
		public Criteria andStartTimeLike(String startTime) {
			addCriterion("and START_TIME like ", startTime, "startTime");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime = "value" 传递查询条件, 例子：andStartTimeEqualTo("value")...
		 * @return
		 */
		public Criteria andStartTimeEqualTo(Date startTime) {

			addCriterion("and START_TIME = ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime <> "value" 传递查询条件, 例子：andStartTimeNotEqualTo("value")...
		 * @return
		 */
		public Criteria andStartTimeNotEqualTo(Date startTime) {

			addCriterion("and START_TIME <> ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime > "value" 传递查询条件, 例子：andStartTimeGreaterThan("value")...
		 * @return
		 */
		public Criteria andStartTimeGreaterThan(Date startTime) {

			addCriterion("and START_TIME > ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime >= "value" 传递查询条件, 例子：andStartTimeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andStartTimeGreaterThanOrEqualTo(Date startTime) {

			addCriterion("and START_TIME >= ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime < "value" 传递查询条件 ，例子：andStartTimeLessThan("value")...
		 * @return
		 */
		public Criteria andStartTimeLessThan(Date startTime) {
		
			addCriterion("and START_TIME < ", startTime, "startTime");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime <= "value" 传递查询条件 ，例子：andStartTimeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andStartTimeLessThanOrEqualTo(Date startTime) {

			addCriterion("and START_TIME <= ", startTime, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andStartTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andStartTimeIn(List<Date> startTimes) {

			addCriterion("and START_TIME in ", startTimes, "startTime");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 startTime not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andStartTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andStartTimeNotIn(List<Date> startTimes) {

			addCriterion("and START_TIME not in ", startTimes, "startTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 startTime between "value1" and "value2" 传递查询条件 ，例子：andStartTimeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andStartTimeBetween(Date startTime1, Date startTime2) {

			addCriterion("and START_TIME between ", startTime1, startTime2, "startTime");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 startTime not between "value1" and "value2" 传递查询条件 ，例子：andStartTimeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andStartTimeNotBetween(Date startTime1, Date startTime2) {

			addCriterion("and START_TIME not between ", startTime1, startTime2, "startTime");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 endTime is null 的查询条件
		 * @return
		 */
		public Criteria andEndTimeIsNull() {
		
			addCriterion("and END_TIME is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime not null 的查询条件
		 * @return
		 */
		public Criteria andEndTimeIsNotNull() {
		
			addCriterion("and END_TIME is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 endTime like "%value%" 模糊查询, 例子：andEndTimeLike("%value%")...
		 * @return
		 */
		public Criteria andEndTimeLike(String endTime) {
			addCriterion("and END_TIME like ", endTime, "endTime");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime = "value" 传递查询条件, 例子：andEndTimeEqualTo("value")...
		 * @return
		 */
		public Criteria andEndTimeEqualTo(Date endTime) {

			addCriterion("and END_TIME = ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime <> "value" 传递查询条件, 例子：andEndTimeNotEqualTo("value")...
		 * @return
		 */
		public Criteria andEndTimeNotEqualTo(Date endTime) {

			addCriterion("and END_TIME <> ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime > "value" 传递查询条件, 例子：andEndTimeGreaterThan("value")...
		 * @return
		 */
		public Criteria andEndTimeGreaterThan(Date endTime) {

			addCriterion("and END_TIME > ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime >= "value" 传递查询条件, 例子：andEndTimeGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andEndTimeGreaterThanOrEqualTo(Date endTime) {

			addCriterion("and END_TIME >= ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime < "value" 传递查询条件 ，例子：andEndTimeLessThan("value")...
		 * @return
		 */
		public Criteria andEndTimeLessThan(Date endTime) {
		
			addCriterion("and END_TIME < ", endTime, "endTime");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime <= "value" 传递查询条件 ，例子：andEndTimeLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andEndTimeLessThanOrEqualTo(Date endTime) {

			addCriterion("and END_TIME <= ", endTime, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andEndTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andEndTimeIn(List<Date> endTimes) {

			addCriterion("and END_TIME in ", endTimes, "endTime");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 endTime not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andEndTimeIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andEndTimeNotIn(List<Date> endTimes) {

			addCriterion("and END_TIME not in ", endTimes, "endTime");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 endTime between "value1" and "value2" 传递查询条件 ，例子：andEndTimeBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andEndTimeBetween(Date endTime1, Date endTime2) {

			addCriterion("and END_TIME between ", endTime1, endTime2, "endTime");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 endTime not between "value1" and "value2" 传递查询条件 ，例子：andEndTimeNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andEndTimeNotBetween(Date endTime1, Date endTime2) {

			addCriterion("and END_TIME not between ", endTime1, endTime2, "endTime");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 licenseStatus is null 的查询条件
		 * @return
		 */
		public Criteria andLicenseStatusIsNull() {
		
			addCriterion("and LICENSE_STATUS is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus not null 的查询条件
		 * @return
		 */
		public Criteria andLicenseStatusIsNotNull() {
		
			addCriterion("and LICENSE_STATUS is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 licenseStatus like "%value%" 模糊查询, 例子：andLicenseStatusLike("%value%")...
		 * @return
		 */
		public Criteria andLicenseStatusLike(String licenseStatus) {
			addCriterion("and LICENSE_STATUS like ", licenseStatus, "licenseStatus");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus = "value" 传递查询条件, 例子：andLicenseStatusEqualTo("value")...
		 * @return
		 */
		public Criteria andLicenseStatusEqualTo(String licenseStatus) {

			addCriterion("and LICENSE_STATUS = ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus <> "value" 传递查询条件, 例子：andLicenseStatusNotEqualTo("value")...
		 * @return
		 */
		public Criteria andLicenseStatusNotEqualTo(String licenseStatus) {

			addCriterion("and LICENSE_STATUS <> ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus > "value" 传递查询条件, 例子：andLicenseStatusGreaterThan("value")...
		 * @return
		 */
		public Criteria andLicenseStatusGreaterThan(String licenseStatus) {

			addCriterion("and LICENSE_STATUS > ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus >= "value" 传递查询条件, 例子：andLicenseStatusGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andLicenseStatusGreaterThanOrEqualTo(String licenseStatus) {

			addCriterion("and LICENSE_STATUS >= ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus < "value" 传递查询条件 ，例子：andLicenseStatusLessThan("value")...
		 * @return
		 */
		public Criteria andLicenseStatusLessThan(String licenseStatus) {
		
			addCriterion("and LICENSE_STATUS < ", licenseStatus, "licenseStatus");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus <= "value" 传递查询条件 ，例子：andLicenseStatusLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andLicenseStatusLessThanOrEqualTo(String licenseStatus) {

			addCriterion("and LICENSE_STATUS <= ", licenseStatus, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andLicenseStatusIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andLicenseStatusIn(List<String> licenseStatuss) {

			addCriterion("and LICENSE_STATUS in ", licenseStatuss, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 licenseStatus not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andLicenseStatusIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andLicenseStatusNotIn(List<String> licenseStatuss) {

			addCriterion("and LICENSE_STATUS not in ", licenseStatuss, "licenseStatus");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 licenseStatus between "value1" and "value2" 传递查询条件 ，例子：andLicenseStatusBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andLicenseStatusBetween(String licenseStatus1, String licenseStatus2) {

			addCriterion("and LICENSE_STATUS between ", licenseStatus1, licenseStatus2, "licenseStatus");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 licenseStatus not between "value1" and "value2" 传递查询条件 ，例子：andLicenseStatusNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andLicenseStatusNotBetween(String licenseStatus1, String licenseStatus2) {

			addCriterion("and LICENSE_STATUS not between ", licenseStatus1, licenseStatus2, "licenseStatus");

			return (Criteria) this;
		}

		//
		// and
		//

		/**
		 * 查询条件(and): 根据 feedback is null 的查询条件
		 * @return
		 */
		public Criteria andFeedbackIsNull() {
		
			addCriterion("and FEEDBACK is null");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback not null 的查询条件
		 * @return
		 */
		public Criteria andFeedbackIsNotNull() {
		
			addCriterion("and FEEDBACK is not null");
			
			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 feedback like "%value%" 模糊查询, 例子：andFeedbackLike("%value%")...
		 * @return
		 */
		public Criteria andFeedbackLike(String feedback) {
			addCriterion("and FEEDBACK like ", feedback, "feedback");
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback = "value" 传递查询条件, 例子：andFeedbackEqualTo("value")...
		 * @return
		 */
		public Criteria andFeedbackEqualTo(String feedback) {

			addCriterion("and FEEDBACK = ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback <> "value" 传递查询条件, 例子：andFeedbackNotEqualTo("value")...
		 * @return
		 */
		public Criteria andFeedbackNotEqualTo(String feedback) {

			addCriterion("and FEEDBACK <> ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback > "value" 传递查询条件, 例子：andFeedbackGreaterThan("value")...
		 * @return
		 */
		public Criteria andFeedbackGreaterThan(String feedback) {

			addCriterion("and FEEDBACK > ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback >= "value" 传递查询条件, 例子：andFeedbackGreaterThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andFeedbackGreaterThanOrEqualTo(String feedback) {

			addCriterion("and FEEDBACK >= ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback < "value" 传递查询条件 ，例子：andFeedbackLessThan("value")...
		 * @return
		 */
		public Criteria andFeedbackLessThan(String feedback) {
		
			addCriterion("and FEEDBACK < ", feedback, "feedback");
		
			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback <= "value" 传递查询条件 ，例子：andFeedbackLessThanOrEqualTo("value")...
		 * @return
		 */
		public Criteria andFeedbackLessThanOrEqualTo(String feedback) {

			addCriterion("and FEEDBACK <= ", feedback, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andFeedbackIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andFeedbackIn(List<String> feedbacks) {

			addCriterion("and FEEDBACK in ", feedbacks, "feedback");

			return (Criteria) this;
		}

		/**
		 *	查询条件(and): 根据 feedback not in "value..." 传递查询条件。
		 *	例子： 
		 *	<pre>
		 *	List<String> list = new ArrayList<>();
		 *	list.add("a");
		 *	list.add("b");
		 *	list.add("c");
		 *	andFeedbackIn(list)...
		 *	</pre>
		 * @return
		 */
		public Criteria andFeedbackNotIn(List<String> feedbacks) {

			addCriterion("and FEEDBACK not in ", feedbacks, "feedback");

			return (Criteria) this;
		}

		/**
		 * 查询条件(and): 根据 feedback between "value1" and "value2" 传递查询条件 ，例子：andFeedbackBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andFeedbackBetween(String feedback1, String feedback2) {

			addCriterion("and FEEDBACK between ", feedback1, feedback2, "feedback");

			return (Criteria) this;
		}
		
		/**
		 * 查询条件(and): 根据 feedback not between "value1" and "value2" 传递查询条件 ，例子：andFeedbackNotBetween("value1", "value2")...
		 * @return
		 */
		public Criteria andFeedbackNotBetween(String feedback1, String feedback2) {

			addCriterion("and FEEDBACK not between ", feedback1, feedback2, "feedback");

			return (Criteria) this;
		}
	
	}

	/**
	 * 自定义Criteria条件
	 * @author tgioer
	 *
	 */
	public static class Criteria extends GeneratedCriteria {

	}
}