package com.springboard.dao.specs;

import java.util.List;

import com.springboard.entities.AppUser;

public interface AppUserDAO extends GenericDAO<AppUser, Long> {
	
	public AppUser findByEmail(String email);
	
	public List<String> listAllEmails();
	
}
