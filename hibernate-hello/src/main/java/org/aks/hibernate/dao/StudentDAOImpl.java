/**
 * 
 */
package org.aks.hibernate.dao;

import java.util.List;

import org.aks.hibernate.beans.Student;
import org.aks.hibernate.util.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 * @author akshay
 *
 */
public class StudentDAOImpl implements StudentDAO {

	/* (non-Javadoc)
	 * @see org.aks.hibernate.dao.StudentDAO#saveOrUpdate(org.aks.hibernate.beans.Student)
	 */
	
	 SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
	
	public void saveOrUpdate(Student student) {
		System.out.println("In \"void org.aks.hibernate.dao.StudentDAOImpl.saveOrUpdate(Student student)\" method");
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(student);
		transaction.commit();
		session.close();

		System.out.println("Done");
	}
	
	public int save(Student student) {
		System.out.println("In \"void org.aks.hibernate.dao.StudentDAOImpl.save(Student student)\" method");
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		int result = (Integer)session.save(student);
		transaction.commit();
		session.close();

		return result;
	}

	/* (non-Javadoc)
	 * @see org.aks.hibernate.dao.StudentDAO#get(int)
	 */
	public Student get(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student student = (Student) session.get(Student.class, id);
		return student;
	}
	
	/* (non-Javadoc)
	 * @see org.aks.hibernate.dao.StudentDAO#getAllStudents()
	 */
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Student> students;
		Criteria criteria = session.createCriteria(Student.class);
		students = criteria.list();
		return students;
	}

}
