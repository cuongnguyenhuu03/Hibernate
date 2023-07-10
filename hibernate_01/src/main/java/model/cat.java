package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class cat {
	private Integer id;
	private String name;
	private Date dateOfBirth;
	private Boolean Gender;
	public cat(Integer id, String name, Date dateOfBirth, Boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		Gender = gender;
	}
	public cat() {
		super();
	}
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Boolean getGender() {
		return Gender;
	}
	public void setGender(Boolean gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "cat [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", Gender=" + Gender + "]";
	}
	
	
}
