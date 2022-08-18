package ya.jee.servlets;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * Pour d�finir la dur�e de la session 
 * on utilise <session-config><session-timeout>dur�e en minutes (par d�faut 30)
 * dans le web.xml
 * 
 * synchronized : si on est dans un cas de multi-threads 
 * pour synchroniser les acc�s � l'appli par plusieurs 
 * utilisateurs au m�me temps */

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
