<!DOCTYPE html>
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="en">

	<head>

		<meta charset="UTF-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no" />
		<meta name="apple-mobile-web-app-capable" content="yes" />
		<meta name="apple-mobile-web-app-status-bar-style" content="black" />
		<meta name="format-detection" content="telephone=no" />

		<title>登录</title>

		<meta name="_csrf" content="${_csrf.token}" />
		<meta name="_csrf_header" content="${_csrf.headerName}" />
		<link href="${pageContext.request.contextPath}/common/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/common/font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/common/layer-v2.4/layer/skin/layer.css" />
		<link href="${pageContext.request.contextPath}/css/animate/animate.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css" />
		
		<%-- <link rel="icon" href="<c:url value="/favicon.ico" />" type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/largedata/css/global.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/largedata/css/login.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/largedata/css/jquery-ui.css" />  --%>
		<style type="text/css">
			.ui-draggable, .ui-droppable {
				background-position: top;
			}
		</style>
	</head>
<c:if test="${not empty registeredService}">
	<c:set var="registeredServiceLogo" value="images/webapp.png" />
	<c:set var="registeredServiceName" value="${registeredService.name}" />
	<c:set var="registeredServiceDescription" value="${registeredService.description}" />

	<c:choose>
		<c:when test="${not empty mduiContext}">
			<c:if test="${not empty mduiContext.logoUrl}">
				<c:set var="registeredServiceLogo" value="${mduiContext.logoUrl}" />
			</c:if>
			<c:set var="registeredServiceName" value="${mduiContext.displayName}" />
			<c:set var="registeredServiceDescription" value="${mduiContext.description}" />
		</c:when>
		<c:when test="${not empty registeredService.logo}">
			<c:set var="registeredServiceLogo" value="${registeredService.logo}" />
		</c:when>
	</c:choose>
</c:if>
	<body class="gray-bg">
		<div class="middle-box text-center loginscreen animated fadeInDown">
			<h2 class="logo-name">湖北省纪委电子政务系统</h2>
			</p>
			<form:form method="post" class="login-form" role="form" id="fm1" commandName="${commandName}" htmlEscape="true" onsubmit="checkForm()">
				<div class="form-group">
					<span  class="fa fa-user">
					</span>
					<form:input class="form-control" placeholder="用户名" required="true" cssClass="form-control" id="username"  path="username" autocomplete="off" htmlEscape="true" />
				</div>
				<div class="form-group"><span  class="fa fa-unlock-alt">
					</span>
					<form:password class="form-control" placeholder="密码" required="true" cssClass="form-control"  id="password" path="password" htmlEscape="true" autocomplete="off" />
				</div>
				<div class="form-rember">
					<a href="#" class="pull-left"><input type="checkbox" name="rememberPwd" id="rememberPwd" value="" /><label for="rememberPwd">记住密码</label></a>
					<!--<a class="pull-right" href="register.html">忘记密码?</a>-->
				</div>
				<input type="hidden" name="lt" value="${loginTicket}" />
	            <input type="hidden" name="execution" value="${flowExecutionKey}" />
	            <%-- <input type="hidden" name="ssoToken" value="${ssoToken}" /> --%>
	            <input type="hidden" name="_eventId" value="submit" />
				<div class="form-group">
					<button type="submit" class="btn btn-primary loginBtn login_submit" id="loginBtn">登录</button>
				</div>
				<!--<div class="form-group">
					<button type="submit" class="btn btn-primary registerBtn">注册</button>
				</div>-->
			</form:form>
		</div>
		
		<!-- Mainly scripts -->
		<script src="${pageContext.request.contextPath}/common/bootstrap-3.3.5-dist/js/jquery-1.11.3.min.js"></script>
		<script src="${pageContext.request.contextPath}/common/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/common/layer-v2.4/layer/layer.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/common/validate/jquery.validate.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/common/validate/additional-methods.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/common/localization/messages_zh.min.js" type="text/javascript" charset="utf-8"></script>
		
		<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/largedata/js/supersized.3.2.7.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/largedata/js/supersized-init.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/largedata/js/jquery-ui.min.js"></script> --%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/Base64.js"></script>
		
		<script type="text/javascript">
			function checkForm(){
				var password = document.getElementById("password").value;
				var base = new Base64();  
				var password_ = base.encode(password);
				document.getElementById("password").value = password_;
				var password2 = document.getElementById("password").value;
			}
		</script>
		
		<script> 
			function getParam(paramName) {  
			    paramValue = "", isFound = !1;  
			    if (this.location.search.indexOf("?") == 0 && this.location.search.indexOf("=") > 1) {  
			        arrSource = decodeURI(this.location.search).substring(1, this.location.search.length).split("&"), i = 0;  
			        while (i < arrSource.length && !isFound) arrSource[i].indexOf("=") > 0 && arrSource[i].split("=")[0].toLowerCase() == paramName.toLowerCase() && (paramValue = arrSource[i].split("=")[1], isFound = !0), i++  
			    }  
			    return paramValue == "" && (paramValue = null), paramValue  
			} 
			//判断登录次数是否已满
			var loginType = getParam('loginType');  
			if (loginType&&${isLock}) {
				
				//alert("登录次数已达上限，请五分钟后重试"); 
				 $( "#dialog" ).dialog();
			} 
		</script> 
	</body>

</html>