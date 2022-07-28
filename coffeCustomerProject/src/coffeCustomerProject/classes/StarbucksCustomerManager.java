package coffeCustomerProject.classes;

import coffeCustomerProject.entities.Customer;
import coffeCustomerProject.interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {

		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {

		if (checkService.checkİfRealPerson(customer)) {
			System.out.println("Starbucks Manager : Validation successfull.");
			super.save(customer);
		} else {
			System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
		}

	}

}
