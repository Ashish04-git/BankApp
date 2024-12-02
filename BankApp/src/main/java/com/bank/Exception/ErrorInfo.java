package com.bank.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo {

	
	private LocalDateTime timestamp;
	private String message;
	private HttpStatus[] status;
	
	
	
}
