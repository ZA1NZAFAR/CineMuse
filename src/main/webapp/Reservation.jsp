<%@ page import="Tools.DbTools" %>
<%@ page import="Models.Places" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Tools.HtmlDisplayer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seat Selection</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="design.css" rel="stylesheet"/>
</head>
<body>
<form style="text-align: center" action="/CineMuse-V1/ReservationServlet" method="post">
    <%
        request.getSession().setAttribute("CurrentFilmName", request.getParameter("CurrentFilmName"));
        request.getSession().setAttribute("CurrentFilmPrice", request.getParameter("CurrentFilmPrice"));
        request.getSession().setAttribute("CurrentSessionId", request.getParameter("CurrentSessionId"));
        request.getSession().setAttribute("CurrentSalleId", request.getParameter("CurrentSalleId"));
        request.getSession().setAttribute("CurrentSessionDate", request.getParameter("CurrentSessionDate"));
        request.getSession().setAttribute("CurrentFilmId", request.getParameter("CurrentFilmId"));
        out.print("<img src=\""+request.getParameter("CurrentFilmPhoto")+"\" width=\"200\" height=\"300\">");
        out.print("<h1>" + request.getParameter("CurrentFilmName") + "</h1>");
        out.print("<h1>" + request.getParameter("CurrentSessionDate") + "</h1>");
        out.print("<h1>" + request.getParameter("CurrentSeanceHoraire") + "</h1>");
        Places p = null;
        try {
            p = new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("CurrentSessionId")));
            session.setAttribute("placesForCurrentSession", p);
            out.print(p.getHtml());
        } catch (SQLException e) {
            request.setAttribute("message", e.getMessage());
            HtmlDisplayer.processRequest(request, response);
        }

    %>

    <br><br>
    <select name="SelectedTarif">
        <option value="1">Tarif Plein  (100%)</option>
        <option value="2">Tarif Reduit (75% )</option>
        <option value="2">Tarif Enfant (50% )</option>
    </select>
    <br><br>
    <input type="submit" value="Reserver">
</form>


</body>
</html>
