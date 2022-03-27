package advanced.java.program;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//@WebServlet("/Dashboardcookie")
public class Dashboard extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            Cookie cookie = null;
            Cookie[] cookies = null;
            boolean found = false;
            
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            cookies = request.getCookies();
            if (cookies != null) {
                    for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    if (cookie.getName().contentEquals("userid") && cookie.getValue() != null) {
                        out.println("UserId read from cookie:" + cookie.getValue() + "<br>");
                        found = true;
                    }
                 }
            }
            if (!found) {
                out.println("No UserId was found in cookie.<br>");
            }
            out.println("</body></html>");
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
                doGet(request, response);
        }
}
