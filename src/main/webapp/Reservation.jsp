<%@ page import="java.util.Date" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="Models.Places" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print("<h1>" + request.getParameter("nomFilm") + "</h1>");
    out.print("<h1>" + request.getParameter("idSeance") + "</h1>");
    Places p = new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("idSeance")));
    out.print("<h1>" + Arrays.toString(new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("idSeance"))).getPlaces()) + "</h1>");
    session.setAttribute("placesForCurrentSession1", p);
    out.print(new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("idSeance"))).getHtml());
%>

</body>
</html>
