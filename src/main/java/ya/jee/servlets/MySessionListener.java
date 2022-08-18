package ya.jee.servlets;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * Pour définir la durée de la session 
 * on utilise <session-config><session-timeout>durée en minutes (par défaut 30)
 * dans le web.xml
 * 
 * synchronized : si on est dans un cas de multi-threads 
 * pour synchroniser les accès à l'appli par plusieurs 
 * utilisateurs au même temps */

@WebListener
public class MySessionListener implements HttpSessionListener{
	
	private static final Logger LOG = Logger.getLogger(MySessionListener.class.getName());
	private int sessionCounter = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		synchronized (this) {
			sessionCounter++;
		}
		LOG.log(Level.INFO, "======= Session created - {0} in memory ========", sessionCounter);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		synchronized (this) {
			sessionCounter--;
		}
		LOG.log(Level.INFO, "======= Session stopped - {0} in memory ========", sessionCounter);
	}
}
