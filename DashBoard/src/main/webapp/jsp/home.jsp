<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h1>Welcome To Struts 2!</h1>
<%
	response.sendRedirect("/app/login");
%>
</body>
</html>
