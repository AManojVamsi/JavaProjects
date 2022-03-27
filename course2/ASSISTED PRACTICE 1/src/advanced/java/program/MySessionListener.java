package advanced.java.program;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener  implements HttpSessionListener {

	public MySessionListener() {
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
	    HttpSession session = httpSessionEvent.getSession();
	    System.out.println("Session Created at  " + session.getCreationTime() + " with id  " + session.getId() );
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
	    HttpSession session = httpSessionEvent.getSession();
	    System.out.println("Session destroyed  with id ::  " + session.getId() );
	}   
}
