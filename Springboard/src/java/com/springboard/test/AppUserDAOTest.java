package com.springboard.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.springboard.dao.specs.AppUserDAO;
import com.springboard.entities.AppUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@Transactional // definitely need this, otherwise tests are parallelized, which doesn't work with transactions
@TransactionConfiguration(defaultRollback = true) // ensures that any test rows added won't remain after the test ends
public class AppUserDAOTest {
	
	@Autowired
	private AppUserDAO appUserDAO;
	
	@Before
	public void setupData() {
		String[] emailAddresses = { "natasha.romanoff@blackwidow.com", "thor@thor.com",
				"steve.rogers@captainamerica.com", "bruce.banner@hulk.com" };
		String[] passwords = { "archerguy", "natalieportman", "40swoman", "scientistgirl" };
		
		for (int i = 0; i < emailAddresses.length; i++) {
			appUserDAO.save(new AppUser(emailAddresses[i], passwords[i]));
		}
	}
	
	@After
	public void tearDownData() {
		
	}
	
	@Test
	public void testSaveNewUser() {
		int previousSize = appUserDAO.findAll(AppUser.class).size();
		System.out.println("Current size of appusers table : " + previousSize);
		String email = "tony.stark@ironman.com";
		String password = "pepper";
		AppUser user = new AppUser(email, password);
		
		appUserDAO.save(user);
		
		// Check if a database id was auto-generated while persisting
		Long id = user.getId();
		Assert.assertNotNull(id);
		
		// Check if size of table increased by 1 on adding a new user
		Assert.assertEquals(previousSize + 1, appUserDAO.findAll(AppUser.class).size());
		
		// Retrieve persisted AppUser instance corresponding to the id of the newly saved user
		AppUser persistedUser = appUserDAO.findById(AppUser.class, id);
		
		// Check if contents of the retrieved AppUser instance are the same as what was saved
		Assert.assertEquals(email, persistedUser.getEmail());
		Assert.assertEquals(password, persistedUser.getPassword());
	}
	
}
