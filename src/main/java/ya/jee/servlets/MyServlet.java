package ya.jee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.WriteBuffer;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/test")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        System.out.println("In MyServlet Controller");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In MyServlet doGet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if (login == null) login = "";
		if (password == null) password = "";
		
		HttpSession session = request.getSession(true);
		session.setAttribute(login, "login");
		session.setAttribute(password, "password");
		
		request.getRequestDispatcher("/test.jsp").forward(request, response);
//		this.getServletContext().getRequestDispatcher("/test.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In MyServlet doPost");
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession(true);
		session.setAttribute(login, "login");
		session.setAttribute(password, "password");
		
		System.out.println("Login = " + login + " - Password = " + password);
		if(login.equals("Y@ssine") && password.equals("1983"))
			request.getRequestDispatcher("/connected.jsp").forward(request, response);
		else
			request.getRequestDispatcher("/test.jsp").forward(request, response);
			
	}

}
