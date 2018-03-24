package com.kanq.platform.authorize.web.view.controller.aspect.logger;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.ObjectUtils;

import com.kanq.platform.authorize.config.AuthorizeLoggerRecordModule;
import com.kanq.platform.authorize.config.AuthorizeStatsiticsTableName;
import com.kanq.platform.basis.common.annotation.stereotype.PlatformComponent;
import com.kanq.platform.basis.common.util.PlatformAspectUtils;
import com.kanq.platform.basis.common.util.WebRequestContext;
import com.kanq.platform.basis.logger.mgt.LoggerRecord;
import com.kanq.platform.basis.logger.mgt.LoggerRecordFactory;
import com.kanq.platform.basis.logger.mgt.LoggerRecordLevel;
import com.kanq.platform.basis.logger.mgt.LoggerRecordOperation;

@Aspect
@PlatformComponent
public class AuthorizerViewControllerLogger {
	
	/**
	 * 
	 */
	private static final String  PAGED_RESULT_VIEW = //
			"execution(* com.kanq.platform.authorize.web.view.controller.AuthorizeViewController.pagedResultView(..))";
	
	@Around(value = PAGED_RESULT_VIEW)
	public Object pagedResultView(ProceedingJoinPoint pjp) throws Throwable {
		
      WebRequestContext wrc = WebRequestContext.get();
		
		String search = wrc.getParameter("search");
		if(null==search ) {
			search = "";
		} else {
			search = new String(search.getBytes("iso-8859-1"), Charset.forName("utf-8"));
		}
		Map<String, Object> newValue = new HashMap<>();
			
		newValue.put("search", search);
		
		LoggerRecord loggerRecord = //
		LoggerRecordFactory.getLogger(LoggerRecordLevel.DEBUG, AuthorizeLoggerRecordModule.AUTHORIZER_MODULE, LoggerRecordOperation.SELECT);

		LoggerRecordFactory.table(loggerRecord, AuthorizeStatsiticsTableName.KQ_AUTHORIZE);
		//添加数据到newvalue
		loggerRecord.newValue(newValue);
		
		Object retValue = pjp.proceed();
		loggerRecord.methodName(PlatformAspectUtils.getSimpleMethodName(pjp));

		if (!ObjectUtils.isEmpty(retValue)) {
				loggerRecord.description("[授权管理]列表查询");
		}
		return retValue;
	}
}
