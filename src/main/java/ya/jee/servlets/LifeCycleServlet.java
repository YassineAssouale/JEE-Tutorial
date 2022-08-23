package ya.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet(urlPatterns="/lifeCycle", loadOnStartup = 1)
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleServlet() {
        super();
        System.out.println("In Constructor : Servlet created");
    }
    
    @Override
    /*
     * M�thode qui permet d'initialiser notre servlet
     * On peut manipuler des les param�tres du fichier web.xml, pas possible dans le 
     * constructeur car la servlet n'est pas compl�tement initialiser
     * loadOnStartup = 1 permet d'initialiser notre servlet au d�marage de l'application
     * et non pas au premier appel doGet, l'utilisateur n'aura pas � attendre si l'initialisation d�re longtemps
     * 
     * */
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
        String dataBaseUrl = this.getServletContext().getInitParameter("DATABASE_URL");
    	System.out.println("In init " + dataBaseUrl + " " + this.getServletContext());
    	
    }
    
    /**
     * M�thode qui permet de lire la requ�te et de la dispatcher vers la bonne m�thode doGet ou doPost
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(req, resp);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Demo", "A value");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		counter++;
		System.out.println("In doGet " + counter);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/**
	 * M�thode qui permet de fermer l'instance de notre servlet
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("In destroy");
	}

}
