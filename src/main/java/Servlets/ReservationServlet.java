package Servlets;

import Models.Places;
import Models.Reservation;
import Tools.DbTools;
import Tools.DbToolsInsert;
import Tools.HtmlDisplayer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/ReservationServlet")
public class ReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int x = 0;
        Places places = (Places) request.getSession().getAttribute("placesForCurrentSession");
        for (int i = 0; i < 50; i++) {
            places.getPlaces()[i] = (null == request.getParameter("idPlaceToReserve" + i)) ? 0 : 1;
            x += (null == request.getParameter("idPlaceToReserve" + i)) ? 0 : 1;
        }
        try {
            new DbToolsInsert().insertPlaces(places);
            new DbToolsInsert().insertReservation(new Reservation(
                    (String) request.getSession().getAttribute("CurrentSessionDate"),
                    Integer.parseInt((String) request.getSession().getAttribute("CurrentSessionId")),
                    (int) request.getSession().getAttribute("CurrentUserId"),
                    Integer.parseInt((String) request.getSession().getAttribute("CurrentSalleId")),
                    Integer.parseInt(request.getParameter("SelectedTarif")),
                    Double.parseDouble((String) request.getSession().getAttribute("CurrentFilmPrice")) * x * new DbTools().getTarifCoefById(Integer.parseInt(request.getParameter("SelectedTarif"))),
                    Integer.parseInt((String) request.getSession().getAttribute("CurrentFilmId")),
                    places.toString()));
            RequestDispatcher requetsDispatcherObj = request.getRequestDispatcher("/ClientReservations.jsp");
            requetsDispatcherObj.forward(request, response);
        } catch (SQLException e) {
            request.setAttribute("message", e.getMessage());
            HtmlDisplayer.processRequest(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}
