package Servlets;

import Tools.DbTools;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/GetFilms")
public class GetFilms extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.getSession().setAttribute("listFilmToday", new DbTools().getFilms(null, null));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RequestDispatcher requetsDispatcherObj = request.getRequestDispatcher("/ClientHomePage.jsp");
        requetsDispatcherObj.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
