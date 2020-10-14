package org.sid.secservice.service;

import org.sid.secservice.entities.AppRole;
import org.sid.secservice.entities.AppUser;

public interface AccountService{

	 public AppUser saveUser(String username,String password,String confirmedPassword);
	 public AppRole save(AppRole role);
	 public AppUser loadUserByUsername(String username);
	 public void addRoleToUser(String username,String rolename);
	 
	
}
