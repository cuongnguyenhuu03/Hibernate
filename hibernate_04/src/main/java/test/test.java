// one to one in Hibernate
package test;

import java.sql.Date;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateUtil.hibernateUtil;
import model.person;

public class test {
	public static void main(String[] args) {
			SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
//				person p1 = new person("Tran Yen Nhi", new Date(System.currentTimeMillis()), null);
//				session.save(p1);		
				
//				person p1 = session.find(person.class, 1);
//				
//				person p2 = new person("Nguyen Huu Cuong", new Date(System.currentTimeMillis()), p1);
//				session.save(p2);
//				
				person p1 = session.find(person.class, 1);
				person p2 = session.find(person.class, 2);
				
				p1.setSpouse(p2);
				session.saveOrUpdate(p1);
				tr.commit();
				session.close();
			}
	}
}
