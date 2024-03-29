<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Créer mon compte</title>
</head>
<body>
<jsp:include page="Header.jsp" />
<div class="container">
    <form action="/CineMuse-V1/AccountCreationServlet" method="post">
        <H1>Création du compte</H1>

        <label><h3>Nom</h3></label>
        <input type="text" id="nom" name="nom" required>

        <label><h3>Prenom</h3></label>
        <input type="text" id="prenom" name="prenom" required>

        <h3>Sexe :</h3> <br>
        <select name="sex">
            <option value="M">Homme</option>
            <option value="F">Femme</option>
        </select>

        <label><h3>Identifiant</h3></label>
        <input type="text" id="login" name="username" required>

        <label><h3>Mot de passe</h3></label>
        <input type="password" id="MDP" name="password" required>

        <label><h3>Votre adresse E-mail </h3></label>
        <input type="email" id="email" name="email" required>

        <label><h3>Votre numéro de Téléphone : </h3></label>
        <input type="tel" id="phone" name="telephone" required>

        <label><h3>Votre Date de Naissance</h3></label>
        <input type="date" id="birth" name="naissance" min="1900-01-01" max="2021-02-14">

        <input type="submit" value="Créer le compte"/>
    </form>
</div>
</body>
</html>
