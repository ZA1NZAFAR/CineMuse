package Servlets;

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
            int respone = dbTools.checkExist((String) request.getParameter("idLogin"), (String) request.getParameter("passwordLogin"));
            if (respone == 1) {
                request.getSession().setAttribute("UserType", "Client");
                new GetFilms().doPost(request, response);
            } else if (respone == 2) {
                request.getSession().setAttribute("UserType", "Manager");
                new GetFilms().doPost(request, response);
            } else
                request.setAttribute("message", "Unknown error.");
            HtmlDisplayer.processRequest(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
