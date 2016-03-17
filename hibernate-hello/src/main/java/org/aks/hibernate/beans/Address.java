/**
 * 
 */
package org.aks.hibernate.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author akshay
 *
 */
@Entity
@Table(name="address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4817420571059678962L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="house_no")
	private String houseNumber;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip_code")
	private String zipCode;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value=CascadeType.SAVE_UPDATE)
	@JoinColumn(name="student_id")
	Student student;
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result + id;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		if (this.getCity() == null) {
			if (other.getCity() != null) {
				return false;
			}
		} else if (!this.getCity().equals(other.getCity())) {
			return false;
		}
		if (this.getHouseNumber() == null) {
			if (other.getHouseNumber() != null) {
				return false;
			}
		} else if (!this.getHouseNumber().equals(other.getHouseNumber())) {
			return false;
		}
		if (this.getId()!= other.getId()) {
			return false;
		}
		if (this.getState()== null) {
			if (other.getState()!= null) {
				return false;
			}
		} else if (!this.getState().equals(other.getState())) {
			return false;
		}
		if (this.getStreet()== null) {
			if (other.getStreet()!= null) {
				return false;
			}
		} else if (!this.getStreet().equals(other.getStreet())) {
			return false;
		}
		if (this.getZipCode()== null) {
			if (other.getZipCode ()!= null) {
				return false;
			}
		} else if (!this.getZipCode().equals(other.getZipCode())) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", student=" + student.getName() + "]";
	}

	
}
