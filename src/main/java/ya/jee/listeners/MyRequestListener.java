package ya.jee.listeners;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Classe qui permet d'écouter les requêtes
 * On peut l'utiliser pour connaître le temps nécessaire
 * pour l'éxecution d'une requête par exemple
 * @author yassi
 *
 */
@WebListener
public class MyRequestListener implements ServletRequestListener{
	 
	private static final Logger LOG = Logger.getLogger(MyRequestListener.class.getName());
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		request.setAttribute("startime", System.currentTimeMillis());
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		long startime = (long) request.getAttribute("startime");
		LOG.log(Level.INFO, "Request is produced in {0} milliseconds", System.currentTimeMillis() - startime);
	}
}
