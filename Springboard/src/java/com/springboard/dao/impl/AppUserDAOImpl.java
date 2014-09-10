package com.springboard.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.springboard.dao.specs.AppUserDAO;
import com.springboard.entities.AppUser;

@Component
public class AppUserDAOImpl extends GenericDAOImpl<AppUser, Long> implements AppUserDAO {
	
	public AppUser findByEmail(String email) {
		String hql = "SELECT appUser FROM AppUser as appUser WHERE appUser.email = :email";
		Query query = getSession().createQuery(hql).setParameter("email", email);
		return findOne(query);
	}
	
	@SuppressWarnings("unchecked")
	public List<String> listAllEmails() {
		String hql = "SELECT appUser.email FROM AppUSer as appUser";
		Query query = getSession().createQuery(hql);
		return (List<String>) query.list();
	}
	
}
