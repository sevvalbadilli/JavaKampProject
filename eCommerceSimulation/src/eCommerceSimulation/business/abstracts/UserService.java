package eCommerceSimulation.business.abstracts;

import eCommerceSimulation.entities.concretes.User;

public interface UserService {

	void signIn(String email,String password);
	void signUp(User user);
	void userVerify(User user);
}
