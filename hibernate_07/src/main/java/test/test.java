package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateUtil.hibernateUtil;
import model.CuocHop;
import model.NhanVien;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		if(sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			

			NhanVien nv1 = new NhanVien("001", "Nguyen Huu Cuong",new Date(System.currentTimeMillis()));
//			session.save(nv1);
			
			
			CuocHop ch1 = new CuocHop(001, "ABC", new Date(System.currentTimeMillis()));
			ch1.addNhanVien(nv1);
			
			session.save(ch1);
			tr.commit();
			session.close();
		}
	}
}
