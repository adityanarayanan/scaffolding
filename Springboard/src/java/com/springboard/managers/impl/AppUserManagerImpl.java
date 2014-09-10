package com.springboard.managers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.springboard.dao.specs.AppUserDAO;
import com.springboard.entities.AppUser;
import com.springboard.managers.specs.AppUserManager;

public class AppUserManagerImpl implements AppUserManager {
	
	@Autowired
	private AppUserDAO appUserDAO;
	
	@Transactional
	public AppUser findByEmailAddress(String email) {
		return appUserDAO.findByEmail(email);
	}
	
	@Transactional
	public List<AppUser> loadAllAppUsers() {
		return appUserDAO.findAll(AppUser.class);
	}
	
	@Transactional
	public List<String> loadAllAppUserEmailAddresses() {
		return appUserDAO.listAllEmails();
	}
	
	@Transactional
	public void saveNewAppUser(AppUser user) {
		appUserDAO.save(user);
	}
	
	@Transactional
	public AppUser findAppUserById(Long id) {
		return appUserDAO.findById(AppUser.class, id);
	}
	
	@Transactional
	public void deleteAppUser(AppUser user) {
		appUserDAO.delete(user);
	}
	
}
