package Tools;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlDisplayer {
    public static void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Success</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + (String) request.getAttribute("message") + "</h1>");
            out.println("<br><a href=\"index.html\">Creer un compte</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
