import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.Exception.ErrorInfo;
import com.bank.Exception.UserException;
import com.bank.Model.Users;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

//	@ExceptionHandler(UserException.class)
//	public @ResponseBody ErrorInfo userException(UserException user){
//		
//		return new ErrorInfo(LocalDateTime.now(), user.getMessage(), HttpStatus.values());
//	}
	
	@ExceptionHandler(UserException.class)
	public @ResponseBody ResponseEntity<String> userException(UserException user){
		
		return new ResponseEntity<String>(user.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
}
