package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class ReservationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String trainNo = req.getParameter("trainNo");
        String classType = req.getParameter("classType");
        String date = req.getParameter("date");
        String from = req.getParameter("from");
        String to = req.getParameter("to");

        int pnr = 100000 + new Random().nextInt(900000);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body style='font-family:Arial;'>");
        out.println("<h2>Reservation Successful</h2>");
        out.println("<p><b>PNR:</b> " + pnr + "</p>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Train No:</b> " + trainNo + "</p>");
        out.println("<p><b>Class:</b> " + classType + "</p>");
        out.println("<p><b>From:</b> " + from + "</p>");
        out.println("<p><b>To:</b> " + to + "</p>");
        out.println("<a href='reservation.html'>Book Another Ticket</a>");
        out.println("</body></html>");
    }
}
