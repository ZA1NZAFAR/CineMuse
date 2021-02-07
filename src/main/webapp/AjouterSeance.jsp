<%@ page import="Models.Film" %>
<%@ page import="java.util.List" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="Tools.HtmlDisplayer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="/CineMuse-V1/AddSeanceServlet" method="post">


    <label for="film">Film:</label>
    <select id="film" name="idFilm">
        <%
            List<Film> listCatagory = null;
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
    <br/><br/>

    <label for="date">Date:</label>
    <input type="date" id="date" name="dateSeance">
    <br/><br/>

    <label for="heure">Horaire:</label>
    <select id="heure" name="heure">
        <option value="18">18h</option>
        <option value="20">20h</option>
        <option value="22">22h</option>
    </select>
    <br/><br/>

    <label for="salle">Salle:</label>
    <select id="salle" name="idSalle">
        <option value="1">Salle 1</option>
        <option value="2">Salle 2</option>
    </select>
    <br/><br/>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>
