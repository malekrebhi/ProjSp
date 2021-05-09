package Proj.Spring.AppCoVacc19;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import Proj.Spring.AppCoVacc19.Exception.AdminNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(AdminNotFoundException.class)
	public void handleAdministrateurNotFoundException(AdminNotFoundException e) {
		
	}
	}