package model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class NhanVien {
	
	@Id
	private String id;
	private String name;
	private Date dateOfBirth;
	
	@ManyToMany(mappedBy = "danhSachNhanVien")
	private Set<CuocHop> danhSachCuocHop = new HashSet<CuocHop>();
	
	public NhanVien() {
	}

	public NhanVien(String id, String name, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	
}
