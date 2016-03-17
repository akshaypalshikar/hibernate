/**
 * 
 */
package org.aks.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.aks.hibernate.beans.Address;
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
		Address address = new Address();
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		
		address.setHouseNumber("123");
		address.setStreet("My Ave");
		address.setCity("My City");
		address.setState("ABC state");
		address.setZipCode("00110");
		
				
		student.setId(1);
		student.setName("Akshay");
		student.setAddresses(addresses);
		
		address.setStudent(student);
			
		session.saveOrUpdate(student);
		session.getTransaction().commit();

		System.out.println("Done");

	}

}
