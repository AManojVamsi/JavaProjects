package advanced.java.program;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    
    public MyServletContextListener() {}
    
    private ServletContext context;
    
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context Initialized");
        // get servlet context
        context =servletContextEvent.getServletContext();
        // set attribute in context
        String attributeValue = "Context Param Value";
        String attributeName ="ContextParam";
        context.setAttribute(attributeName, attributeValue);
    }
  
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Context Destroyed");
    }
}
