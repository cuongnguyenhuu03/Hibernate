// many to one in Hibernate 
package test;

import java.sql.Date;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateUtil.hibernateUtil;
import model.author;
import model.book;

public class test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		if(sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
//			author author_1 = new author("001", "Nguyen Nhat Anh", new Date (System.currentTimeMillis()));
//			book book_1 = new book("b1", "Ngay xua co mot chuyen tinh", 500000, author_1);
//			book book_2 = new book("b2", "Toi thay hoa vang tren co xanh", 650000, author_1);
//			book book_3 = new book("b3", "Toi la Beto", 450000, author_1);
//			
//			session.saveOrUpdate(author_1);
//			session.saveOrUpdate(book_1);
//			session.saveOrUpdate(book_2);
//			session.saveOrUpdate(book_3);
			
//			author author_1 = new author("002", "Tran Yen Nhi", new Date (System.currentTimeMillis()));
//			book book_1 = new book("b4", "Fly me to the moon", 500000, author_1);
//			book book_2 = new book("b5", "Im not the only one", 650000, author_1);
//			book book_3 = new book("b6", "hello", 450000, author_1);
//			
//			session.saveOrUpdate(author_1);
//			session.saveOrUpdate(book_1);
//			session.saveOrUpdate(book_2);
//			session.saveOrUpdate(book_3);

			book b1 = session.find(book.class, "b1");
			System.out.println("tac gia cua sach "+b1.getTitle()+ " là: "+b1.getAuthor().getName());
			
			tr.commit();
			session.close();
		}
	}

}
