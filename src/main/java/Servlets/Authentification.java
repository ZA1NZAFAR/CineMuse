package Servlets;

import Models.Person;
import Tools.ConnectionDB;
import Tools.DbTools;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;

@WebServlet(name = "Authentification")
public class Authentification extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        Person p = new Person((String) request.getAttribute("prenom"), (String) request.getAttribute("nom"),
                (String) request.getAttribute("email"), (String) request.getAttribute("telephone"),
                (String) request.getAttribute("username"), (String) request.getAttribute("password"),
                (Date) request.getAttribute("naissance"), (char) request.getAttribute("sex"));
        try {
            DbTools.createAccount(ConnectionDB.getConnection(), p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher requetsDispatcherObj;
            Connection connection = ConnectionDB.getConnection();
            if (DbTools.checkExist(connection, (String) request.getAttribute("idLogin"), (String) request.getAttribute("passwordLogin")) == 1) {
                requetsDispatcherObj = request.getRequestDispatcher("/ClientHomePage.jsp");
                HttpSession session = request.getSession();
                requetsDispatcherObj.forward(request, response);
            } else if (DbTools.checkExist(connection, (String) request.getAttribute("idLogin"), (String) request.getAttribute("passwordLogin")) == 2) {
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
