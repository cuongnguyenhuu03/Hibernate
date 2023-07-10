package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernateUtil.hibernateUtil;
import model.cat;

public class testCat {

	public static void main(String[] args) {
		try {
			
			SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
			if( sessionFactory != null) {
				Session session = sessionFactory.openSession();
				try {
					cat myCat1 = new cat();
					myCat1.setName("Doremon");
					myCat1.setGender(true);
					session.save(myCat1);
				} finally {
					session.close();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
