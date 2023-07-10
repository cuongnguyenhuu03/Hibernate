package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class my_oder {
	
	@Id
	private String order_id;
	private String address;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private customer customer;
	
	public my_oder(String order_id, String address, model.customer customer) {
		this.order_id = order_id;
		this.address = address;
		this.customer = customer;
	}

	public my_oder() {
		super();
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public customer getCustomer() {
		return customer;
	}

	public void setCustomer(customer customer) {
		this.customer = customer;
	}
	
	
}
