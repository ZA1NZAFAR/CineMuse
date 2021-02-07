package Servlets;

import DTO.PersonDTO;
import Models.Person;
import Tools.DbTools;
import Tools.HtmlDisplayer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Authentification")
public class Authentification extends HttpServlet {
    private DbTools dbTools = new DbTools();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Person p = new Person(request.getParameter("prenom"), request.getParameter("nom"),
                    request.getParameter("email"), request.getParameter("telephone"),
                    request.getParameter("username"), request.getParameter("password"),
                    request.getParameter("naissance"), request.getParameter("sex").charAt(0));
            dbTools.createAccount(p);
            request.setAttribute("message", "Account creation successful.");
        } catch (Exception e) {
            request.setAttribute("message", "Account creation failed. " + e.getMessage());
        } finally {
            HtmlDisplayer.processRequest(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PersonDTO respone = dbTools.checkExist(request.getParameter("idLogin"), request.getParameter("passwordLogin"));
            if (respone.getIdPerson() > -1) {
                request.getSession().setAttribute("CurrentUserId", respone.getIdPerson());
                request.getSession().setAttribute("UserType", respone.getTypePerson());
                if (respone.getTypePerson().equals("Client"))
                    request.getRequestDispatcher("ChoiceClient.jsp").forward(request, response);
                else if (respone.getTypePerson().equals("Manager"))
                    request.getRequestDispatcher("ChoiceManager.jsp").forward(request, response);
                else
                    throw new Exception("Unknown user type.");
            } else {
                request.setAttribute("message", "Unable to login.");
                HtmlDisplayer.processRequest(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("message",e.getMessage());
           HtmlDisplayer.processRequest(request,response);
        }
    }
}
