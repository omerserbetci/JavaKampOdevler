package Ders4_Odev2;

public class StarbucksCustomerManager extends BaseCustomerManager{

	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Customer couldn't be verified!");
		}
		
	}
	
}
