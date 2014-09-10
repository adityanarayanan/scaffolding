package com.springboard.dao.specs;

import com.springboard.entities.AppUser;

public interface AppUserDAO extends GenericDAO<AppUser, Long> {
	
	public AppUser findByEmail(String email);
	
}
