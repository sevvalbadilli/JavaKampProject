package eCommerceSimulation.business.concretes;


import eCommerceSimulation.business.abstracts.UserCheckService;
import eCommerceSimulation.core.RegexService;
import eCommerceSimulation.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	private RegexService regexService;

	public UserCheckManager(RegexService regexService) {
		super();
		this.regexService = regexService;
	}

	@Override
	public boolean validate(User user) {

		if (checkFirstName(user.getFirstName()) && checkLastName(user.getLastName()) && checkEmailValidation(user.getEmail())&&
				checkPassword(user.getPassword())) {
              return true;
		}

		return false;
	}

	@Override
	public boolean checkFirstName(String firstName) {

		return firstName.length() > 2;
	}

	@Override
	public boolean checkLastName(String lastName) {

		return lastName.length() > 2;
	}

	@Override
	public boolean checkEmailValidation(String email) {

		return regexService.checkEmailFormat(email);
	}

	@Override
	public boolean checkPassword(String password) {

		return password.length() > 6;
	}

}
