package advanced.java.program;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
       
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 
        	     Cookie userId = new Cookie("userid", request.getParameter("userid"));
                 response.addCookie(userId);
                 response.sendRedirect("dashboardcookie");               
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
                doGet(request, response);
        }

}

