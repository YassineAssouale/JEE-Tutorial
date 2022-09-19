package ya.jee.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

@WebFilter(urlPatterns = "/lifeCycle")
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}
	
	
	@Override
	public void doFilter(ServletRequest request	, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response2 = (HttpServletResponse) response;
		if (response2.getHeader("value").equals("Demo"))
			chain.doFilter(request, response);
		chain.doFilter(request , new HttpServletResponseWrapper( (HttpServletResponse) response){
			@Override
			public void setHeader(String name, String value) {
				if (! name.equalsIgnoreCase("Demo"))
					super.setHeader(name, value);
			}
		});
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

}
