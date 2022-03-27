package advanced.java.program;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {
     
       public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
 
                String userId = request.getParameter("userid");
                if( userId != null){
                	response.getWriter().write("passing through LoginFilter...............");
                    chain.doFilter(request, response);
            }else           
                response.getWriter().write("blocked by LoginFilter as there is no userid");
        }

        public void init(FilterConfig fConfig) throws ServletException {
           
        }
        
        public void destroy() {
            
        }
}

