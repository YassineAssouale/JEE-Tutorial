package ya.jee.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Class qui permet d'écouter les attributs de session
 * @author yassi
 *
 */
@WebListener
public class MySessionListener2 implements HttpSessionAttributeListener{
 
	 @Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		HttpSessionAttributeListener.super.attributeAdded(event);
	}
	 
	 @Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		HttpSessionAttributeListener.super.attributeReplaced(event);
	}
	 
	 @Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		HttpSessionAttributeListener.super.attributeRemoved(event);
	}
}
