<%@page import="java.util.Map.Entry"%>
<jsp:directive.include file="includes/top.jsp" />
<%@page import="java.util.Map" %>
<%@page import="java.util.Set" %>
  <div id="msg" class="success">
    <h2><spring:message code="screen.logout.header" /></h2>
    <p><spring:message code="screen.logout.success" /></p>
    <p><spring:message code="screen.logout.security" /></p>
  </div>
  <%
  
  Map<String, String[]> params = request.getParameterMap();
  Set<Entry<String, String[]>> entries = params.entrySet();
  
  StringBuilder paramBuilder = new StringBuilder();
  for(Entry<String, String[]> entry : entries) {
	  for(String value : entry.getValue()) {
		  paramBuilder.append(entry.getKey()).append("=").append(value).append("&");
	  }
  }
  
  
  String paramStr = 
  paramBuilder.length() > 1 ?  paramBuilder.substring(0, paramBuilder.length() - 1) : paramBuilder.toString();
  
 response.sendRedirect("login?" + paramStr); 
  %>
<jsp:directive.include file="includes/bottom.jsp" />