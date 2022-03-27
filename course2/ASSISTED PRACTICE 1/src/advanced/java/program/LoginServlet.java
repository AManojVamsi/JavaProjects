package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	//private static final long serialVersionUID = 1L;
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			
			String user = req.getParameter("user");
			String pass = req.getParameter("password");
			
			if ("virendra".equals(user) && "viren".equals(pass)) {
				response(resp, "login ok");
			} else {
				response(resp, "invalid login");
			}
		}

		private void response(HttpServletResponse resp, String msg)
				throws IOException {
			PrintWriter out = resp.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			out.println("<t1>" + msg + "</t1>");
			out.println("</body>");
			out.println("</html>");
		}
	}