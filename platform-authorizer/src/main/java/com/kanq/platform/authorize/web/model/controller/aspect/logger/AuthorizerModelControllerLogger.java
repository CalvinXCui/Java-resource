package com.kanq.platform.authorize.web.model.controller.aspect.logger;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import com.kanq.platform.authorize.config.AuthorizeLoggerRecordModule;
import com.kanq.platform.authorize.model.Authorize;
import com.kanq.platform.authorize.service.AuthorizeService;
import com.kanq.platform.basis.common.annotation.stereotype.PlatformComponent;
import com.kanq.platform.basis.common.util.PlatformAspectUtils;
import com.kanq.platform.basis.logger.config.PlatformTableName;
import com.kanq.platform.basis.logger.mgt.LoggerRecord;
import com.kanq.platform.basis.logger.mgt.LoggerRecordFactory;
import com.kanq.platform.basis.logger.mgt.LoggerRecordLevel;
import com.kanq.platform.basis.logger.mgt.LoggerRecordOperation;

@Aspect
@PlatformComponent
public class AuthorizerModelControllerLogger {
	
	@Autowired
	private AuthorizeService authorizeService;

	
	/**
	 * 查询操作的pointcut表达式  queryExportData
	 */
	private static final String QUERY_EXPORT_DATA = //
	"execution(* com.kanq.platform.authorize.web.model.controller.AuthorizeModelController.queryExportData(..))";
	
	/**
	 * 统计查询操作的日志记录
	 * 
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around(value = QUERY_EXPORT_DATA)
	public Object queryExportData(ProceedingJoinPoint pjp) throws Throwable {
		Object[] args = pjp.getArgs();
		Object obj = pjp.proceed();
		
		String ApproverId = (String)args[0];
		
		// 获得日志对象
		LoggerRecord loggerRecord = //
				LoggerRecordFactory.getLogger(LoggerRecordLevel.DEBUG, AuthorizeLoggerRecordModule.AUTHORIZER_MODULE, LoggerRecordOperation.SELECT);
		// 设置锁
		LoggerRecordFactory.setLock(true);

		/*String key = authorize.getApproverId();*/
		// 查询保存的对象
		Authorize authorizeData = authorizeService.selectByPrimaryKey(ApproverId);
		loggerRecord.methodName(PlatformAspectUtils.getSimpleMethodName(pjp)).newValue(authorizeData);

		// 设置表
		LoggerRecordFactory.table(loggerRecord, PlatformTableName.KQ_AUTHORIZE, ApproverId);

		loggerRecord.description("[授权管理]'操作者'为" + authorizeData.getProposer() + "生成许可");
		return obj;
	}
}
