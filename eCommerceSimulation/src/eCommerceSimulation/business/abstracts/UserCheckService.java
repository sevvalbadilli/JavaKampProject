package eCommerceSimulation.business.abstracts;

import eCommerceSimulation.entities.concretes.User;

public interface UserCheckService {

	boolean validate(User user);
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkEmailValidation(String email);
	boolean checkPassword(String password);

}
