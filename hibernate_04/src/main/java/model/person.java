package model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class person {
	
	@Id
	@GeneratedValue
	@Column(name="person_id")
	private Integer id;
	private String name;
	private Date dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="spouse_id")
	private person spouse;
	
	public person() {
		super();
	}

	public person( String name, Date dateOfBirth, person spouse) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.spouse = spouse;
	}
	
	public person(Integer id, String name, Date dateOfBirth, person spouse) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.spouse = spouse;
	}

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

	public person getSpouse() {
		return spouse;
	}

	public void setSpouse(person spouse) {
		this.spouse = spouse;
	}

	
}
