<%@ page import="Models.Film" %>
<%@ page import="Models.Seance" %>
<%@ page import="java.util.List" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="Models.Reservation" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Tools.HtmlDisplayer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Mes Reservation</h1>
<%
    List<Reservation> list = null;
    try {
        list = new DbTools().getReservationsForClient((Integer) request.getSession().getAttribute("CurrentUserId"));
    } catch (SQLException e) {
        request.setAttribute("message",e.getMessage());
        HtmlDisplayer.processRequest(request,response);
    }
    for (Reservation r:list) {
        out.println("<h1>"+r.toString()+"</h1>");
    }
%>
</body>
</html>
