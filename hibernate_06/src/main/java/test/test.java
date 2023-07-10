package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateUtil.hibernateUtil;
import model.customer;
import model.my_oder;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		if(sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
//			customer c1 = new customer("001", "Nguyen Huu Cuong", "Cuong@gmail.com");
//			my_oder o1 = new my_oder("1" ,"Nghe An", c1);
//			my_oder o2 = new my_oder("2" ,"Nghe An", c1);
//			my_oder o3 = new my_oder("3" ,"Nghe An", c1);
//			
//			List<my_oder> l1 = new ArrayList<>();
//			l1.add(o1);
//			l1.add(o2);
//			l1.add(o3);
//			
//			c1.setOrders(l1);
//			session.saveOrUpdate(o1);
//			session.saveOrUpdate(o2);
//			session.saveOrUpdate(o3);
//			
//			
//			session.saveOrUpdate(c1);
			
			customer c1 = new customer("002", "Tran Yen Nhi", "Nhi@gmail.com");
			session.saveOrUpdate(c1);
			
			String hql = "from customer c where size(c.orders) > 0";
			List<customer> rs = session.createQuery(hql).list();
			
			for (customer c : rs) {
				System.out.println(c);
			}
			tr.commit();
			session.close();
		}

	}
}
