package coffeeShopsManager;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Furkan","Þimþek","33333333333","01.01.2004");
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
		starbucksCustomerManager.save(customer1);
		starbucksCustomerManager.sayHello(customer1);
	}

}
