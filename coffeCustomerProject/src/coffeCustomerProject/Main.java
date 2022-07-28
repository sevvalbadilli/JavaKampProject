package coffeCustomerProject;



import java.time.LocalDate;

import coffeCustomerProject.adapters.MerniceServiceAdapter;
import coffeCustomerProject.classes.BaseCustomerManager;
import coffeCustomerProject.classes.NeroCustomerManager;
import coffeCustomerProject.classes.StarbucksCustomerManager;
import coffeCustomerProject.entities.Customer;

public class Main {

	public static void main(String[] args) {

		
		Customer customer = new Customer(1,"ŞEVVAL","BADILLI",LocalDate.of(2000, 1, 24),"49876756574");
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MerniceServiceAdapter()) ;
		baseCustomerManager.save(customer);
		
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(customer);
	}

}
