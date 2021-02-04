<%@ page import="java.util.ArrayList" %>
<%@ page import="Models.Film" %>
<%@ page import="Servlets.GetFilms" %>
<%@ page import="java.awt.image.DataBuffer" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Tools.HtmlDisplayer" %>
<%@ page import="Tools.DateTools" %>
<%@ page import="DTO.FilmSeanceDTO" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <%
        for (int i = 0; i < 3; i++) {
            out.println("<tr>");
            out.println("<td>" + DateTools.getDaysAfter(i) + "</td>");
            ArrayList<FilmSeanceDTO> listToday = null;
            try {
                listToday = (ArrayList<FilmSeanceDTO>) new DbTools().getFilms(DateTools.getDaysAfter(i), null);
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
