package coffeCustomerProject.classes;

import coffeCustomerProject.entities.Customer;
import coffeCustomerProject.interfaces.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {

		System.out.println("Customer succesfully added to database.");

	}

}
