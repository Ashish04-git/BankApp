package com.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Model.Account;
import com.bank.Service.AccountServiceImpl;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountServiceImpl accountService;
	
	@GetMapping("/accountList")
	public ResponseEntity<List<Account>> getAccounts(){
		
		return accountService.getAccounts();
	}
	
	@PostMapping("/addAccount")
	public ResponseEntity<String> addAccount(Account account){
		
		return accountService.addAccount(account);
	}

}
