package ya.jee.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet Filter implementation class LifeCycleFilter
 */
@WebFilter("/lifeCycle")
public class LifeCycleFilter implements Filter {
       
    
    public LifeCycleFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("In LifeCycleFilter init ");
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		chain.doFilter(request, new HttpServletResponseWrapper((HttpServletResponse)response) {
			@Override
			public void setHeader(String name, String value) {
				if(!name.equals("Demo"))
					super.setHeader(name, value);
				else
					try {
						response.getWriter().append("Invalid Response Header name");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
	}

	public void destroy() {
		System.out.println("In LifeCycleFilter destroy ");
	}



}
