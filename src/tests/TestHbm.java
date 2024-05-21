package tests;

import org.hibernate.SessionFactory;

import dao.util.HibernateUtil;

public class TestHbm {

	public static void main(String[] args) {
		SessionFactory s = HibernateUtil.getSessionFactory();
		s.close();
	}

}
