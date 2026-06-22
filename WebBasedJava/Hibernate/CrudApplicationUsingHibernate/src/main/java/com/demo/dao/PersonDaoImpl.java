package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.Person;

public class PersonDaoImpl implements PersonDao {
	private SessionFactory sf;
	{
		sf = HibernateUtil.getMySessionFactory();
	}

	@Override
	public boolean save(Person p) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(p);
		tr.commit();
		session.close();
		return true;
	}

	@Override
	public Person findPersonById(int pid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p = session.find(Person.class, pid);
		tr.commit();
		session.close();
		return p;
	}

	@Override
	public boolean modifyById(int pid, String pname, String mob) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p = session.find(Person.class, pid);
		if (p != null) {
			p.setPname(pname);
			p.setMobile(mob);
			session.merge(p);

		}
		tr.commit();
		session.close();
		return p != null;

	}

	@Override
	public boolean removePersonByid(int pid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p = session.find(Person.class, pid);
		if (p != null) {
			session.remove(p);

		}
		tr.commit();
		session.close();

		return p != null;
	}
	
	
	
	
	
	
	
	
}
