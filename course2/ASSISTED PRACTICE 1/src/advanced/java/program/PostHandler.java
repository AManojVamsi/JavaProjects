package advanced.java.program;

import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostHandler")
public class PostHandler extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
                    PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    
                    out.println("Name=" + name + "<br>Address=" + address);
                    
                    out.println("</body></html>");
        }

}

