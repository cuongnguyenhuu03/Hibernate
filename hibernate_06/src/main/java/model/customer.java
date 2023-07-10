package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class customer {
	
	@Id
	private String id;
	private String name;
	private String email;
	
	@OneToMany(mappedBy = "customer")
	private List<my_oder> orders;
	
	public List<my_oder> getOrders() {
		return orders;
	}

	public void setOrders(List<my_oder> orders) {
		this.orders = orders;
	}

	public customer(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public customer() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", email=" + email + ", orders=" + orders.size() + "]";
	}
	
	
	
}
