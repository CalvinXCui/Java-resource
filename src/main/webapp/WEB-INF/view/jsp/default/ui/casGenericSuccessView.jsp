<jsp:directive.include file="includes/top.jsp" />
<div id="msg" class="success">
	<h2>
		<spring:message code="screen.success.header" />
	</h2>
	<p>
		<spring:message code="screen.success.success" arguments="${principal.id}" />
	</p>
	<p>
		<spring:message code="screen.success.security" />
	</p>
	<script type="text/javascript">
	<!--
		var getQueryString = function(name) {
			var reg = new RegExp( "(^|&)" + name + "=([^&]*)(&|$)", "i" );
			var r = window.location.search.substr( 1 ).match( reg );
			if ( r != null ) return (r[2]);
			return null;
		}

		var service = getQueryString( 'service' );
		if ( typeof service == 'string' && service != null && service != undefined && service != '' ) {
			window.location.href = service;
		}
	//-->
	</script>
</div>
<jsp:directive.include file="includes/bottom.jsp" />

