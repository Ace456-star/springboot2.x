package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		
		Student s1=new Student(1, "reshma",21 );
		Student s2=new Student(2, "samata", 22);
		session.save(s1);
		session.save(s2);
		
		
		
		
		
		
		
		
		session.getTransaction().commit();
		session.close();
		

	}

}
