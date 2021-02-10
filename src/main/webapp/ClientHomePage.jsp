<%@ page import="java.util.ArrayList" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Tools.HtmlDisplayer" %>
<%@ page import="Tools.DateTools" %>
<%@ page import="DTO.FilmSeanceDTO" %>
<%@ page import="static Tools.Constants.howManyDaysToLoad" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Film Selection</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="design.css" rel="stylesheet"/>
</head>
<jsp:include page="Header.jsp" />
<body>
<jsp:include page="CheckUser.jsp" />
<h1>CineMuse - Planned Films</h1>
<table>
    <tr>
        <th class="tableHeading">Date</th>
        <th class="tableHeading">Films</th>
    </tr>
    <%
        request.getSession().setAttribute("CurrentUserId",session.getAttribute("CurrentUserId"));
        for (int i = 0; i < howManyDaysToLoad; i++) {
            out.println("<tr>");
            out.println("<th class=\"dateHomePage\">" + DateTools.getDaysAfter(i) + "</th>");
            ArrayList<FilmSeanceDTO> listToday = null;
            try {
                listToday = (ArrayList<FilmSeanceDTO>) new DbTools().getFilms(DateTools.getDaysAfter(i));
            } catch (SQLException e) {
                request.setAttribute("message", e.getMessage());
                HtmlDisplayer.processRequest(request, response);
            }
            for (FilmSeanceDTO f : listToday) {
                out.print("<td>");
                out.print(f.getForm());
                out.print("</td>");
            }
            out.println("<tr>");
        }
    %>
</table>
</body>
</html>
