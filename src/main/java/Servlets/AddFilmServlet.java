package Servlets;

import Models.Film;
import Tools.DbToolsInsert;
import Tools.HtmlDisplayer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddFilmServlet", urlPatterns = "/AddFilmServlet")
public class AddFilmServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Film film = new Film(
                    request.getParameter("nomFilm"),
                    request.getParameter("genreFilm"),
                    request.getParameter("langueFilm"),
                    request.getParameter("photoAdresseFilm"),
                    Double.parseDouble(request.getParameter("prixFilm")),
                    Integer.parseInt(request.getParameter("anneeFilm")),
                    Integer.parseInt(request.getParameter("dureeFilm"))
            );
            new DbToolsInsert().insertFilm(film);
            request.setAttribute("message","Film added successfully.");
            HtmlDisplayer.processRequest(request,response);
        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
            HtmlDisplayer.processRequest(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
