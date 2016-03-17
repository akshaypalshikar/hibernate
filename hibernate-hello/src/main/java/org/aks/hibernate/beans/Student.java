/**
 * 
 */
package org.aks.hibernate.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Akshay
 *
 */
@Entity
@Table(name="STUDENT")
public class Student implements Serializable{
	
	@Id
	@Column(name="ID")
	int id;
	
	@Column(name="NAME")
	String name;

	private static final long serialVersionUID = -7717800592024907087L;
	
	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
