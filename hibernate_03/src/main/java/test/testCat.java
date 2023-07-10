package test;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import DAO.CatDAO;
import hibernateUtil.hibernateUtil;
import model.cat;

public class testCat {

	public static void main(String[] args) {
		CatDAO Cat_DAO = new CatDAO();
		
//		test select all
//		List<cat> list = Cat_DAO.selectAll();
//		for (cat cat : list) {
//			System.out.println(cat);
//		}
		
//		test select by id 
//		cat myCat_1 = new cat();
//		myCat_1.setId(2);
//		
//		cat myCat_2 = Cat_DAO.selectById(myCat_1);
//		System.out.println(myCat_2);
		
//		test insert update 
		cat myCat_3 = new cat();
		myCat_3.setName("Manh");
		myCat_3.setDateOfBirth(new Date(System.currentTimeMillis()));
		myCat_3.setGender(true);
		myCat_3.setId(4);
		Cat_DAO.delete(myCat_3);
		
		
	}

}
