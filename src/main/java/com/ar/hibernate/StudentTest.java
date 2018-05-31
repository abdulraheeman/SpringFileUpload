package com.ar.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		Student s = new Student();
		s.setId(409);
		s.setName("jagadesh►reddy");
		s.setAddress("Andra'Pradesh");

		Student s1 = new Student();
		s1.setId(410);
		s1.setName("tarun");
		s1.setAddress("Pune");

		session.persist(s);

		session.persist(s1);

		tx.commit();

		session.close();
		System.out.println("Successfully saved");
	}

}
