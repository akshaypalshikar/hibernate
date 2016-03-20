/**
 * 
 */
package org.aks.hibernate.dao;

import java.util.List;

import org.aks.hibernate.beans.Student;

/**
 * @author akshay
 *
 */
public interface StudentDAO {
	
	public int save(Student student);
	public void saveOrUpdate(Student student);
	public Student get(int id);
	public List<Student> getAllStudents();
}
