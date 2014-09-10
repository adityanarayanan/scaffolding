package com.springboard.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboard.dao.specs.GenericDAO;

public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {
	
	@Autowired
	private SessionFactory sessionFactory; // session factory singleton from Spring container
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void save(T entity) {
		getSession().saveOrUpdate(entity);
	}
	
	public void merge(T entity) {
		getSession().merge(entity);
	}
	
	public void delete(T entity) {
		getSession().delete(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findMany(Query query) {
		return (List<T>) query.list();
	}
	
	@SuppressWarnings("unchecked")
	public T findOne(Query query) {
		return (T) query.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public T findById(Class<T> clazz, Long id) {
		return (T) getSession().get(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> clazz) {
		String hql = "from " + clazz.getName();
		Query query = getSession().createQuery(hql);
		return (List<T>) query.list();
	}
	
}
