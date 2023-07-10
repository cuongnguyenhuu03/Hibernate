package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateUtil.hibernateUtil;
import model.person;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		if(sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			String hql = "select p.name, p.spouse.name from person p";
			List<Object[]> result = session.createQuery(hql).list();
			
			System.out.println(result);
			
			for (Object[] rs : result) {
				String name = rs[0]+"";
				String spouseName = rs[1]+"";
				
				System.out.println(name +  " is married to  " + spouseName);
			}
			tr.commit();
			session.close();
		}
	}

}
