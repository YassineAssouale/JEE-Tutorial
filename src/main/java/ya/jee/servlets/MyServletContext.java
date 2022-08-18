package ya.jee.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*
 * Class qui sera utiliser comme listener (écouteur)
 * pour capter toutes les modifications concernant notre appli
 * arrêt de l'appli, démarrage ...
 * 
 * On peut enregistrer notre classe listener dans le serveur de deux manière
 * 1 - web.xml : <listener><description><listener-classe>
 * 2- @webListener : annotation de javax.servlet.annotation.WebListener
 * */
@WebListener
public class MyServletContext implements ServletContextListener {
	
	private static final Logger LOG = Logger.getLogger(MyServletContext.class.getName());
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		LOG.log( Level.INFO, "======== JEE-Tutorial App Started ========");
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		LOG.log( Level.INFO, "======== JEE-Tutorial App Stopped ========");
	}
}
