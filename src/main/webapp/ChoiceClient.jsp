<html>
<head>
    <title>Client Home Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="design.css" rel="stylesheet"/>
</head>
<body>
<jsp:include page="Header.jsp" />
<div class="login">
    <form action="ClientHomePage.jsp" method='post'>
        <br> <br>
        <input class="submit" type="submit" name="" value="Reserver">
    </form>

    <form action="ClientReservations.jsp">
        <input class="submit" type="submit" name="" value="Mes Reservation">
    </form>
</div>
</body>
</html>
