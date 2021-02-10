package Servlets;

import DTO.PersonDTO;
import Tools.DbTools;
import Tools.HtmlDisplayer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AuthentificationServlet", urlPatterns = "/AuthentificationServlet")
public class AuthentificationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PersonDTO respone = new DbTools().checkExist(request.getParameter("idLogin"), request.getParameter("passwordLogin"));
            if (respone.getIdPerson() > -1) {
                request.getSession().setAttribute("CurrentUserId", respone.getIdPerson());
                request.getSession().setAttribute("UserType", respone.getTypePerson());
                if (respone.getTypePerson().equals("Client"))
                    request.getRequestDispatcher("ChoiceClient.jsp").forward(request, response);
                else if (respone.getTypePerson().equals("Manager")) {
                    request.getSession().setAttribute("CurrentUserId", respone.getIdPerson());
                    request.getSession().setAttribute("UserType", respone.getTypePerson());
                    request.getRequestDispatcher("ChoiceManager.jsp").forward(request, response);
                } else
                    throw new Exception("Unknown user type.");
            } else {
                request.setAttribute("message", "Unable to login.");
            }
        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
        }
        HtmlDisplayer.processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
