package advanced.java.program;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondCookie extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
    
	try{  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    Cookie ck[]=request.getCookies();  
	    
	    for(int i=0;i<ck.length;i++){  
	    	 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
	    	} 
        out.close();  
         }
	catch(Exception e)
	{
		System.out.println(e);
	}  
  }  
}  
