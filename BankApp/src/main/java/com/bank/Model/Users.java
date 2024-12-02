package com.bank.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String userName;
	private String name;
	private String password;
	private String city;
	private String state;
	
	
	
}
