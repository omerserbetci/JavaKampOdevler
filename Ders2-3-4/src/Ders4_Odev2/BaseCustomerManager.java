package Ders4_Odev2;

public abstract class BaseCustomerManager implements ICustomerService {

	public void save(Customer customer) {
		
		System.out.println("Customer saved succesfully. " + customer.getFirstName());
		
	}
	
}
