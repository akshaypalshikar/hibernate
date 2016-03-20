/**
 * 
 */
package org.aks.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.aks.hibernate.beans.Address;
import org.aks.hibernate.beans.Student;
import org.aks.hibernate.dao.StudentDAO;
import org.aks.hibernate.dao.StudentDAOImpl;

/**
 * @author akshay
 *
 */
public class UseStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAOImpl();

		Student student = new Student();
		Address address = new Address();
		List<Address> addresses = new ArrayList<Address>();
		
		addresses.add(address);
		
		address.setHouseNumber("123");
		address.setStreet("My Ave");
		address.setCity("My City");
		address.setState("ABC state");
		address.setZipCode("00110");
		
				
		student.setName("Poorva");
		student.setAddresses(addresses);
		studentDAO.save(student);
		
		
/*		Student studentFromDB = studentDAO.get(1);
		System.out.println("studentFromDB is : " + studentFromDB);
		
		Student secondStudentToSave = new Student();
		secondStudentToSave.setName("Akshay");
		students.clear();
		students.add(secondStudentToSave);
		address.setStudents(students);
		
		secondStudentToSave.setAddresses(addresses);
		
		studentDAO.save(secondStudentToSave);
		
		Collection<Student> studentsFromDB = studentDAO.getAllStudents();
		System.out.println("All students are : " + studentsFromDB);
		
*/			
	}

}
