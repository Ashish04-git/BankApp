package com.bank.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.Model.Users;

@Repository
public interface UsersDAO extends JpaRepository<Users, String>{

	@Query("select u from Users u where u.name like :char%")
	List<Users> getUsersNameStartsWith(@Param("char") String ch);
	
	@Query("select u from Users u where u.state like :state%")
	List<Users> getUsersWithState(@Param("state") String state);
}
