package Ders4_Odev2;

public class Main {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Omer", "Serbetci", "32296576730");
		customer1.setDateOfBirth(1996, 1, 7);
		
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(customer1);
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		starbucksCustomerManager.save(customer1);
	}
}
