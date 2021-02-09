package Servlets;

import Models.Seance;
import Tools.DbToolsInsert;
import Tools.HtmlDisplayer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddSeanceServlet", urlPatterns = "/AddSeanceServlet")
public class AddSeanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Seance seance = new Seance(
                Integer.parseInt(request.getParameter("idFilm")),
                request.getParameter("dateSeance"),
                Integer.parseInt(request.getParameter("idSalle")),
                Integer.parseInt(request.getParameter("heure")));
        try {
            new DbToolsInsert().insertSeance(seance);
        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
            HtmlDisplayer.processRequest(request, response);
        }
        request.setAttribute("message", "Session inserted successfully.");
        HtmlDisplayer.processRequest(request, response);
    }
}
