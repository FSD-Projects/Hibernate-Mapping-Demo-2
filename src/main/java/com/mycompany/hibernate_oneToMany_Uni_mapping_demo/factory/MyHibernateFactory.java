package com.mycompany.hibernate_oneToMany_Uni_mapping_demo.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.model.Course;
import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.model.Review;

public class MyHibernateFactory {
	private static Session session;
	private static SessionFactory factory;

	public static Session getMySession() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).buildSessionFactory();
		session = factory.openSession();
		return session;
	}
}
