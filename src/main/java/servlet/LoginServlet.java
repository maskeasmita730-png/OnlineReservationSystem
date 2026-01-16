package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    // Handles browser GET request
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendRedirect("login.html");
    }

    // Handles form POST request
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "admin123".equals(password)) {
            resp.sendRedirect("reservation.html");
        } else {
            resp.sendRedirect("login.html");
        }
    }
}
