<html>
<head>
    <title>Page de Connexion au CinéMuse</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<jsp:include page="Header.jsp"/>
<jsp:include page="CheckUser.jsp" />

<h1>CineMuse - Adding Film</h1>
<div class="entirePage">
    <form action="/CineMuse-V1/AddFilmServlet" method="POST" style="padding: 10px">

        <table>
            <tr>
                <td>
                    <label for="nameFilm">Nom : </label>
                </td>
                <td>
                    <input type="text" placeholder="Entrez nom film" id="nameFilm" name="nomFilm" required="">
                </td>
            </tr>

            <tr>
                <td>
                    <label for="prix">Prix : </label>
                </td>
                <td>
                    <input type="number" step="any" placeholder="Entrez nom film" id="prix" name="prixFilm" required="">
                </td>
            </tr>

            <tr>
                <td>
                    <label for="genre">Genre : </label>
                </td>
                <td>
                    <input type="text" placeholder="Entrez nom film" id="genre" name="genreFilm" required="">
                </td>
            </tr>

            <tr>
                <td>
                    <label for="annee">Annee : </label>
                </td>
                <td>
                    <input type="number" placeholder="Entrez nom film" id="annee" name="anneeFilm" required="">
                </td>
            </tr>

            <tr>
                <td>
                    <label for="duree">Duree : </label>
                </td>
                <td>
                    <input type="text" placeholder="Entrez nom film" id="duree" name="dureeFilm" required="">
                </td>
            </tr>


            <tr>
                <td>
                    <label for="langue">Langue : </label>
                </td>
                <td>
                    <input type="text" placeholder="Entrez nom film" id="langue" name="langueFilm" required="">
                </td>
            </tr>

            <tr>
                <td>
                    <label for="photoAdresse">Photo Adresse : </label>
                </td>
                <td>
                    <input type="text" placeholder="Entrez nom film" id="photoAdresse" name="photoAdresseFilm"
                           required="">
                </td>
            </tr>

        </table>
        <input type="submit" value="ajouter le film" class="u-form-control-hidden">
    </form>


</div>
</body>
</html>
