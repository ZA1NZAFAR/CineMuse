<%@ page import="Models.Film" %>
<%@ page import="java.util.List" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="Tools.HtmlDisplayer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page de Connexion au CinéMuse</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<jsp:include page="Header.jsp" />
<h1>CineMuse - Planning Session</h1>
<form action="/CineMuse-V1/AddSeanceServlet" method="post">

    <table>
        <tr>
            <td>
                <label for="film">Film:</label>
            </td>
            <td>
                <select id="film" name="idFilm">
                    <%
                        List
                                <Film> listCatagory = null;
                        try {
                            listCatagory = new DbTools().getAllFilms();
                        } catch (SQLException e) {
                            request.setAttribute("message", e.getMessage());
                            HtmlDisplayer.processRequest(request, response);
                        }
                        for (Film film : listCatagory) {
                    %>
                    <option value="<%=film.getId() %>"><%=film.getNom() %>
                    </option>
                    <%} %>
                </select>
            </td>
        </tr>

        <tr>
            <td>
                <label for="date">Date:</label>
            </td>
            <td>
                <input type="date" id="date" name="dateSeance">
            </td>
        </tr>
        <tr>
            <td>
                <label for="heure">Horaire:</label>
            </td>
            <td>
                <select id="heure" name="heure">
                    <option value="18">18h</option>
                    <option value="20">20h</option>
                    <option value="22">22h</option>
                </select></td>
        </tr>

        <tr>
            <td>
                <label for="salle">Salle:</label>
            </td>
            <td>
                <select id="salle" name="idSalle">
                    <option value="1">Salle 1</option>
                    <option value="2">Salle 2</option>
                </select>
            </td>
        </tr>
    </table>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>
