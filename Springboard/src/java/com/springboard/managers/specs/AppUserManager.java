package com.springboard.managers.specs;

import java.util.List;

import com.springboard.entities.AppUser;

public interface AppUserManager {
	
	public AppUser findByEmailAddress(String email);
	
	public List<AppUser> loadAllAppUsers();
	
	public List<String> loadAllAppUserEmailAddresses();
	
	public void saveNewAppUser(AppUser user);
	
	public AppUser findAppUserById(Long id);
	
	public void deleteAppUser(AppUser user);
	
}
