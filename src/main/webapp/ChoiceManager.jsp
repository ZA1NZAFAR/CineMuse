<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Manager Homepage</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="design.css" rel="stylesheet"/>
</head>
<body>
<h1 style="text-align: center">Manager Control Panel</h1>
<div class="login">
    <form action="AjouterFilm.jsp" method="post">
        <input type="submit" value="Ajouter un film">
    </form>
    <br>
    <form action="AjouterSeance.jsp" method="post">
        <input type="submit" value="Planifier une seance">
    </form>
</div>
</body>
</html>