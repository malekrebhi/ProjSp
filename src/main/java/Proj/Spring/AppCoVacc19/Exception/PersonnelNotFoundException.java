package Proj.Spring.AppCoVacc19.Exception;

@SuppressWarnings("serial")
public class PersonnelNotFoundException extends RuntimeException{
	public PersonnelNotFoundException(String message) {
		super(message);
	}

}
