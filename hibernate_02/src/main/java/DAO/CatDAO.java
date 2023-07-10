package DAO;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateUtil.hibernateUtil;
import model.cat;

public class CatDAO implements DAOinterface<cat> {

	@Override
	public List<cat> selectAll() {
		List<cat> result = new ArrayList();
		try {
			SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				String hql = "from cat";
				Query query = session.createQuery(hql);
				result = query.getResultList();
				
				tr.commit();
				session.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public cat selectById(cat t) {
		List<cat> result = new ArrayList();
		try {
			SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				String hql = "from cat where id = :id";
				Query query = session.createQuery(hql);
				query.setParameter("id", t.getId());
				result = query.getResultList();
				
				tr.commit();
				session.close();
			}
		} catch (Exception e) {
			System.out.println();
		}
		if(result.size() > 0) {
			return result.get(0);
		}else {
			return null;
		}
	}

	public boolean saveOrUpdate(cat t) {
		try {
			SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.saveOrUpdate(t);
				
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		return false;
	}
	
	@Override
	public boolean insert(cat t) {
		return saveOrUpdate(t);
	}

	@Override
	public boolean update(cat t) {
		return saveOrUpdate(t);
	}

	@Override
	public boolean delete(cat t) {
		try {
			SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.delete(t);
				
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		return false;
	}

}
