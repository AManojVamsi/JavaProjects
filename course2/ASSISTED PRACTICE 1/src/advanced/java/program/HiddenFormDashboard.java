package advanced.java.program;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//@WebServlet("/HiddenFormDashboard")
public class HiddenFormDashboard extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String userId = request.getParameter("userid");
            
            if (userId == null) {
                out.println("No UserId was found in hidden form field.<br>");
            } else {
                out.println("UserId found in hidden form field: " + userId + "<br>");               
            }
            out.println("</body></html>");
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
            doGet(request, response);
        }
}
