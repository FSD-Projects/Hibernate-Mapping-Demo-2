package com.mycompany.hibernate_oneToMany_Uni_mapping_demo;

import org.hibernate.Session;

import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.DAO.ReviewDAO;
import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.DAO.ReviewDAOImpl;
import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.factory.MyHibernateFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			ReviewDAO dao = new ReviewDAOImpl();

			// Create Course
			// dao.createCourseDemo();
			// Create Review
			dao.createReviewDemo();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
