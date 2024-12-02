package com.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Exception.UserException;
import com.bank.Model.Users;
import com.bank.Service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("/")
	public List<Users> getAllUsers() throws UserException{

		return userService.getAllUsers();
	}
	
	@GetMapping("/userList/{char}")
	public List<Users> getUsersNameStartsWith(@PathVariable("char") String ch){
		
		return userService.getUsersNameStartsWith(ch);
	}
	
	@GetMapping("/userListForState/{state}")
	public List<Users> getUsersWithState(@PathVariable("state") String state){
		
		return userService.getUsersWithState(state);
	}
	
	@PostMapping("/addUser")
	public Users createUser(@RequestBody Users user) throws UserException{

		return userService.createUser(user);
	}
	
	@PutMapping("/updateUser")
	public Users updateUser(@RequestBody Users user) throws UserException{

		return userService.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{username}")
	public String deleteUser(@PathVariable("username") String username) {
		
		return userService.deleteUser(username);
	}
	
	
}
