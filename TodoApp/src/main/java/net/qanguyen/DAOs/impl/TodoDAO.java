package net.qanguyen.DAOs.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import net.qanguyen.Models.Todo;
import net.qanguyen.DAOs.*;

//@Repository
//@Transactional
//public class TodoDAO implements ITodoDAO {
//
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	protected Session getSession() {
//		return sessionFactory.getCurrentSession();
//	}
//
//	@Override
//	public void save(Todo todo) {
//		getSession().save(todo);
//	}
//
//	@Override
//	public void update(Todo todo) {
//		getSession().update(todo);
//	}
//
//	@Override
//	public void delete(Long id) {
//		Todo todo = getById(id);
//		if (todo != null) {
//			getSession().delete(todo);
//		}
//	}
//
//	@Override
//	public Todo getById(Long id) {
//		return getSession().get(Todo.class, id);
//	}
//
//	@Override
//	public List<Todo> getAll() {
//		Session session = this.sessionFactory.getCurrentSession();
//		List<Todo> todosList = session.createQuery("from Todo").list();
//		
//		return todosList;
//	}
//}
