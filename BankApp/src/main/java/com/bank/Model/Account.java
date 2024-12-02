package com.bank.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	@Id
	@GeneratedValue(generator = "Acc_Id_generator", strategy= GenerationType.SEQUENCE)
	@SequenceGenerator(initialValue = 1101, name = "Acc_Id_generator",sequenceName = "Acc_Id_generator", allocationSize = 101)
	private Long accountNo;
	private String accountType;
	private Double accountBalance;
	
	@OneToOne
	private Users user;

	
	
}
