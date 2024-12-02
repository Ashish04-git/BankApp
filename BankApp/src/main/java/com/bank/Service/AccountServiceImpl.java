package com.bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bank.DAO.AccountDAO;
import com.bank.Exception.UserException;
import com.bank.Model.Account;

@Service
public class AccountServiceImpl {

	@Autowired
	AccountDAO dao;
	
	public ResponseEntity<List<Account>> getAccounts(){
		
		List<Account> accountList= dao.findAll();
		if(accountList.size()>0)
			return new ResponseEntity<List<Account>>(accountList,HttpStatus.OK);
		throw new UserException("No accounts found!");
	}
	
	public ResponseEntity<String> addAccount(Account account) {
		
		if(dao.existsById(account.getAccountNo()))
			throw new UserException("Account already exist!");
		dao.save(account);
		return new ResponseEntity<String>("Account added successfully", HttpStatus.CREATED);
	}
	
}
