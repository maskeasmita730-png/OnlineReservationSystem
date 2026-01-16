package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CancellationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String pnr = req.getParameter("pnr");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body style='font-family:Arial;'>");
        out.println("<h2>Ticket Cancelled Successfully</h2>");
        out.println("<p>PNR Number: " + pnr + "</p>");
        out.println("<a href='reservation.html'>Book New Ticket</a>");
        out.println("</body></html>");
    }
}
