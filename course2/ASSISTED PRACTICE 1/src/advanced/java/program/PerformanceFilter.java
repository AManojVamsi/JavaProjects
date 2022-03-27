package advanced.java.program;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/PerformanceFilter")
public class PerformanceFilter implements Filter {

    public PerformanceFilter() {
    }
  
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        
        String path = req.getServletPath();
        
        long st = System.currentTimeMillis();
        chain.doFilter(request, response);
        long et = System.currentTimeMillis();

        long tt = (et - st);

        System.out.println("Time take to execute action " + path + "   is  :  " + tt);
    }

    public void init(FilterConfig fConfig) throws ServletException {
    }

}

