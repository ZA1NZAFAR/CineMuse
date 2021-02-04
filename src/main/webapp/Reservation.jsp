<%@ page import="java.util.Date" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: z.zafar
  Date: 2/4/2021
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print("<h1>" + request.getParameter("nomFilm") + "</h1>");
    out.print("<h1>" + request.getParameter("idSeance") + "</h1>");
    out.print("<h1>" + Arrays.toString(new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("idSeance"))).getPlaces()) + "</h1>");
    out.print(new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("idSeance"))).getHtml());
%>

</body>
</html>
