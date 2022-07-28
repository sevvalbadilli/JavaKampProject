package coffeCustomerProject.classes;

import coffeCustomerProject.entities.Customer;
import coffeCustomerProject.interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkİfRealPerson(Customer customer) {

		return true;
	}

}
