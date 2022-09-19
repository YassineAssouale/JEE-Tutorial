package ya.jee.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class PasswordFilter
 */
@WebFilter("/login")
public class PasswordFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public PasswordFilter() {
        super();
        System.out.println("In PasswordFilter Constructor");
    }


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("In PasswordFilter init");
	}
	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest) request;
		int password = Integer.parseInt(req.getParameter("txtPassword"));
		
		if(password > 1)
			chain.doFilter(request, response);
		else
			out.print("Invalid password ");
	}
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
