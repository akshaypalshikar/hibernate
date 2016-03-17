/**
 * 
 */
package org.aks.hibernate.service;

import org.aks.hibernate.beans.Student;
import org.aks.hibernate.util.HibernateSessionFactory;
import org.hibernate.classic.Session;

/**
 * @author akshay
 *
 */
public class UseStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateSessionFactory.getSessionFactory().openSession();

		session.beginTransaction();

		Student student = new Student();

		student.setId(1);
		student.setName("Akshay");
			
		session.save(student);
		session.getTransaction().commit();

		System.out.println("Done");

	}

}
