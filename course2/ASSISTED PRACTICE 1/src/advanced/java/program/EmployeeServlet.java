package advanced.java.program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/EmployeeServlet1")
public class EmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setEmail("pankaj@gmail.com"); 
		emp1.setName("Pankaj");
		emp1.setPassword("Developer");
		
		Employee emp2 = new Employee();
		emp2.setEmail("meghna@gmail.com"); 
		emp2.setName("Meghna");
		emp2.setPassword("Tester");
		
		empList.add(emp1);
		empList.add(emp2);
		
		request.setAttribute("empList", empList);
		
		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "https://www.facebook.com");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jstlEmployee.jsp");
		rd.forward(request, response);
	}
 }

