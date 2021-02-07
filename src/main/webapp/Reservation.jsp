<%@ page import="java.util.Date" %>
<%@ page import="Tools.DbTools" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="Models.Places" %>
<%@ page import="Models.Film" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    request.getSession().setAttribute("CurrentFilmName", request.getParameter("CurrentFilmName"));
    request.getSession().setAttribute("CurrentFilmPrice", request.getParameter("CurrentFilmPrice"));
    request.getSession().setAttribute("CurrentSessionId", request.getParameter("CurrentSessionId"));
    request.getSession().setAttribute("CurrentSalleId", request.getParameter("CurrentSalleId"));
    request.getSession().setAttribute("CurrentSessionDate", request.getParameter("CurrentSessionDate"));
    request.getSession().setAttribute("CurrentFilmId", request.getParameter("CurrentFilmId"));
    out.print("<h1>" + request.getParameter("CurrentFilmName") + "</h1>");
    out.print("<h1>" + request.getParameter("CurrentFilmPrice") + "</h1>");
    out.print("<h1>" + request.getParameter("CurrentSessionId") + "</h1>");
    out.print("<h1>" + request.getParameter("CurrentSalleId") + "</h1>");
    out.print("<h1>" + request.getParameter("CurrentFilmPrice") + "</h1>");
    out.print("<h1>" + request.getParameter("CurrentSessionDate") + "</h1>");

    out.println("<h1>" + request.getSession().getAttribute("CurrentUserId") + "</h1>");

    out.println("<h1>" + request.getSession().getAttribute("CurrentFilmId") + "</h1>");


    out.print("<h1>Zain</h1>");

    Places p = new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("CurrentSessionId")));
    out.print("<h1>" + Arrays.toString(new
            DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("CurrentSessionId"))).getPlaces()) + "</h1>");
    session.setAttribute("placesForCurrentSession1", p);
    out.print(new DbTools().getPlacesForSeance(Integer.parseInt(request.getParameter("CurrentSessionId"))).getHtml());
%>

</body>
</html>
