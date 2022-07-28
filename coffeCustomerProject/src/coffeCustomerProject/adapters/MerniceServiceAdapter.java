package coffeCustomerProject.adapters;

import java.rmi.RemoteException;

import coffeCustomerProject.entities.Customer;
import coffeCustomerProject.interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkİfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.
					  TCKimlikNoDogrula(
							  Long.parseLong(customer.getNationalId()), 
							  customer.getFirstName(), 
							  customer.getLastName(), 
							  customer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	
		
		
		
	}

}
