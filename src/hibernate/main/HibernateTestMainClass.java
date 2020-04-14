package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.model.UserDetails;

public class HibernateTestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails u1= new UserDetails();
		u1.setId(1);
		u1.setUser_name("Urgyen");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		session.save(u1);
		session.getTransaction().commit();
		
	}

}
