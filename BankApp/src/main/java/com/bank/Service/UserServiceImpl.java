package com.bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.UsersDAO;
import com.bank.Exception.UserException;
import com.bank.Model.Users;

@Service
public class UserServiceImpl {

	@Autowired
	private UsersDAO dao;
	
	
	public List<Users> getAllUsers() throws UserException {
		
		List<Users> allUsers= dao.findAll();
		if(allUsers.size()>0)
			return allUsers;
		else
			throw new UserException("No users found");
	}
	
	public Users createUser(Users user) throws UserException {
		
		if(dao.existsById(user.getUserName()))
				throw new UserException("User already exist ˙◠˙");
		else
			dao.save(user);
			return user;
	}
	
	public Users updateUser(Users user) throws UserException {
		
		if(dao.existsById(user.getUserName())) {
			dao.save(user);
			return user;}
		else
			throw new UserException("User not found!");
	}
	
	public String deleteUser(String username){
		
		if(dao.existsById(username)) {
			dao.deleteById(username);
			return "User deleted successfully!";
		}else {
			throw new UserException("User not found!");
		}
			
	}
	
	public List<Users> getUsersNameStartsWith(String ch){
		
		List<Users> userList= dao.getUsersNameStartsWith(ch);
		if(userList.size()>0)
			return userList;
		else
			throw new UserException("No users found!");
	}
	
	public List<Users> getUsersWithState(String state){
		
		List<Users> userList= dao.getUsersWithState(state);
		if(userList.size()>0)
			return userList;
		else
			throw new UserException("No users found!");
	}
}
