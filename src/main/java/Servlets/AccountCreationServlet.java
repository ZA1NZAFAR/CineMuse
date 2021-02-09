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

@WebServlet(name = "AccountCreationServlet", urlPatterns = "/AccountCreationServlet")
public class AccountCreationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Person p = new Person(request.getParameter("prenom"), request.getParameter("nom"),
                    request.getParameter("email"), request.getParameter("telephone"),
                    request.getParameter("username"), request.getParameter("password"),
                    request.getParameter("naissance"), request.getParameter("sex").charAt(0));
            new DbTools().createAccount(p);
            request.setAttribute("message", "Account creation successful.");
        } catch (Exception e) {
            request.setAttribute("message", "Account creation failed. " + e.getMessage());
        } finally {
            HtmlDisplayer.processRequest(request, response);
        }
    }
}
