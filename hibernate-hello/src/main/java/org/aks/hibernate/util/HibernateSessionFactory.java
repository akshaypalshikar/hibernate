/**
 * 
 */
package org.aks.hibernate.util;

import org.aks.hibernate.beans.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author akshay
 *
 */
public class HibernateSessionFactory {

	    private static final SessionFactory sessionFactory = buildSessionFactory();

	    private static SessionFactory buildSessionFactory() {
	            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	    public static void shutdown() {
	    	getSessionFactory().close();
	    }

}
