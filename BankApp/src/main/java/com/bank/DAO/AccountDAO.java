package com.bank.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.Model.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Long>{

}
