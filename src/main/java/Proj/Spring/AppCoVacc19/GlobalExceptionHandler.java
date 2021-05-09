package Proj.Spring.AppCoVacc19;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import Proj.Spring.AppCoVacc19.Exception.AdminNotFoundException;
import Proj.Spring.AppCoVacc19.Exception.CentreVaccNotFoundException;
import Proj.Spring.AppCoVacc19.Exception.CitoyenNotFoundException;
import Proj.Spring.AppCoVacc19.Exception.PersonnelNotFoundException;
import Proj.Spring.AppCoVacc19.Exception.RendezVousNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(AdminNotFoundException.class)
	public void handleAdminNotFoundException(AdminNotFoundException e) {
		
	}
	@ExceptionHandler(CentreVaccNotFoundException.class)
	public void handleCentreVaccNotFoundException(CentreVaccNotFoundException e) {
		
	}
	@ExceptionHandler(CitoyenNotFoundException.class)
	public void handleCitoyenNotFoundException(CitoyenNotFoundException e) {
		
	}
	@ExceptionHandler(PersonnelNotFoundException.class)
	public void handlePersonnelNotFoundException(PersonnelNotFoundException e) {
		
	}
	@ExceptionHandler(RendezVousNotFoundException.class)
	public void handleRendezVousNotFoundException(RendezVousNotFoundException e) {
		
	}
	}