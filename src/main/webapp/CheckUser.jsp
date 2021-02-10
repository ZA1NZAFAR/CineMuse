<%@ page import="Tools.HtmlDisplayer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Check User</title>
</head>
<body>
<%
    if (null == request.getSession().getAttribute("CurrentUserId")) {
        request.setAttribute("message", "Please login.");
        HtmlDisplayer.processRequest(request, response);
    }
%>
</body>
</html>
