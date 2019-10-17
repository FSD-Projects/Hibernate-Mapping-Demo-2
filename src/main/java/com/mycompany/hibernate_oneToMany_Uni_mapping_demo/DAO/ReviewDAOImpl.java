package com.mycompany.hibernate_oneToMany_Uni_mapping_demo.DAO;

import static java.lang.System.in;

import java.util.Scanner;

import org.hibernate.Session;

import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.factory.MyHibernateFactory;
import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.model.Course;
import com.mycompany.hibernate_oneToMany_Uni_mapping_demo.model.Review;

public class ReviewDAOImpl implements ReviewDAO {
	Scanner sc = new Scanner(in);
	private static Session session;

	public void createCourseDemo() {
		session = MyHibernateFactory.getMySession();
		session.getTransaction().begin();
		Course tempCourse = new Course("Pacman - How To Score One Million Points");
		session.save(tempCourse);
		session.getTransaction().commit();
		session.close();
	}

	public void createReviewDemo() {
		// TODO Auto-generated method stub
		session = MyHibernateFactory.getMySession();
		// System.out.println("Enter the course id to review: ");
		// int id = sc.nextInt();
		int id = 1;
		Course tempCourse = session.get(Course.class, id);

		tempCourse.addReview(new Review("Great course ... loved it!"));
		tempCourse.addReview(new Review("Cool course, job well done"));
		tempCourse.addReview(new Review("What a dumb course, you are an idiot!"));

		session.getTransaction().begin();
		session.save(tempCourse);
		session.getTransaction().commit();
		System.out.println("Done!");
		session.close();

	}

}
