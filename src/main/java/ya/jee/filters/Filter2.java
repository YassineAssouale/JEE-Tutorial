package ya.jee.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

@WebFilter(urlPatterns = "/lifeCycle")
public class Filter2 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, new HttpServletResponseWrapper ((HttpServletResponse) response){
			@Override
			public void setHeader(String name, String value) {
				if(! name.equalsIgnoreCase("Demo"))
					super.setHeader(name, value);
			}
		});
	}
}
