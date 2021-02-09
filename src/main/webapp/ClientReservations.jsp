<%@ page import="java.util.List" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="Models.Reservation" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Tools.HtmlDisplayer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reservation Homepage</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="design.css" rel="stylesheet"/>
</head>
<body>
<h1>Mes Reservation</h1>
<%
    List<Reservation> list = null;
    try {
        list = new DbTools().getReservationsForClient((Integer) request.getSession().getAttribute("CurrentUserId"));
    } catch (SQLException e) {
        request.setAttribute("message", e.getMessage());
        HtmlDisplayer.processRequest(request, response);
    }
    assert list != null;
%>
<table>
    <tr>
        <th>Reservation ID</th>
        <th>Date</th>
        <th>Film</th>
        <th>Salle</th>
        <th>Places</th>
        <th>Prix</th>
    </tr>

    <%
        for (Reservation r : list) {
            try {
                out.print(r.getHtmlCell());
            } catch (Exception e) {
                request.setAttribute("message", e.getMessage());
                HtmlDisplayer.processRequest(request, response);
            }
        }
    %>


</table>
</body>
</html>
