package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateUtil.hibernateUtil;
import model.GiaoVien;
import model.SinhVien;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		if(sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			GiaoVien gv = new GiaoVien("01", "Tran yen Nhi", new Date(System.currentTimeMillis()),"Ngữ VĂN");
			SinhVien sv = new SinhVien("003","Nguyen Huu Cuong",new Date(System.currentTimeMillis()), 10 );
			
			session.save(sv);
			session.save(gv);
			tr.commit();
			session.close();
		}
	}
}
