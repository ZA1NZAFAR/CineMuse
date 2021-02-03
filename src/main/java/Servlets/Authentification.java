package Servlets;

import Models.Person;
import Tools.DbTools;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/Authentification")
public class Authentification extends HttpServlet {
    private DbTools dbTools = new DbTools();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            Person p = new Person(request.getParameter("prenom"), request.getParameter("nom"),
                    request.getParameter("email"), request.getParameter("telephone"),
                    request.getParameter("username"), request.getParameter("password"),
                    request.getParameter("naissance"), request.getParameter("sex").charAt(0));
            dbTools.createAccount(p);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher requetsDispatcherObj;
            int respone = dbTools.checkExist((String) request.getParameter("idLogin"), (String) request.getParameter("passwordLogin"));
            if (respone == 1) {
                requetsDispatcherObj = request.getRequestDispatcher("/ClientHomePage.jsp");
                HttpSession session = request.getSession();
                requetsDispatcherObj.forward(request, response);
            } else if (respone == 2) {
                requetsDispatcherObj = request.getRequestDispatcher("/ManagerHomePage.jsp");
                HttpSession session = request.getSession();
                requetsDispatcherObj.forward(request, response);
            } else
                throw new Exception("Invalid user.");

        } catch (Exception throwables) {
            System.out.println(throwables.getMessage());
        }
    }
}
