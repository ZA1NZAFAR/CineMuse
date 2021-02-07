<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un Film</title>
</head>
<body>
<h1>CineMuse film à ajouter</h1>
<div class="entirePage">
    <form action="/CineMuse-V1/AddFilmServlet" method="POST" style="padding: 10px">

        <label for="nameFilm">Nom film : </label>
        <input type="text" placeholder="Entrez nom film" id="nameFilm" name="nomFilm" required="">
        <br>

        <label for="prix">Prix film : </label>
        <input type="number" step="any" placeholder="Entrez nom film" id="prix" name="prixFilm" required="">
        <br>

        <label for="genre">Genre film : </label>
        <input type="text" placeholder="Entrez nom film" id="genre" name="genreFilm" required="">
        <br>

        <label for="annee">Annee film : </label>
        <input type="number" placeholder="Entrez nom film" id="annee" name="anneeFilm" required="">
        <br>

        <label for="duree">Duree film : </label>
        <input type="text" placeholder="Entrez nom film" id="duree" name="dureeFilm" required="">
        <br>

        <label for="langue">Langue film : </label>
        <input type="text" placeholder="Entrez nom film" id="langue" name="langueFilm" required="">
        <br>

        <label for="photoAdresse">Photo Adresse film : </label>
        <input type="text" placeholder="Entrez nom film" id="photoAdresse" name="photoAdresseFilm" required="">
        <br>

        <input type="submit" value="ajouter le film" class="u-form-control-hidden">
    </form>


</div>
</body>
</html>
