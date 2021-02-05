package Servlets;

import Models.Places;
import Tools.DbToolsInsert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/Reservation")
public class Reservation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Places places = (Places) request.getSession().getAttribute("placesForCurrentSession1");

        for (int i = 0; i < 50; i++) {
            places.getPlaces()[i] = (null == request.getParameter("idPlaceToReserve" + i)) ? 0 : 1;
        }
        try {
            new DbToolsInsert().insertPlaces(places);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.getSession().setAttribute("tsst", places);
        RequestDispatcher requetsDispatcherObj = request.getRequestDispatcher("/test.jsp");
        requetsDispatcherObj.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
