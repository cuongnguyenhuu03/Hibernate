package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class book {
	@Id
	private String book_id;
	private String title;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private author author;
	
	public book(String book_id, String title, double price, model.author author) {
		this.book_id = book_id;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public book() {
		super();
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public author getAuthor() {
		return author;
	}

	public void setAuthor(author author) {
		this.author = author;
	}
	
	
	
	
}
