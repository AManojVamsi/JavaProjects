package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet
{

	public ServletLifeCycle()
	{	
		System.out.println("Am from default constructor");
	}

	public void init(ServletConfig config) // 1st time calling
	{
		System.out.println("Am from Inait method...!");
	}

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException // every request it is called
	{	
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("I am from doGet method");
		pw.close();
	}	

	public void destroy()   // during destruction of object
	{
		System.out.println("Am from Destroy methods");
	}

}
