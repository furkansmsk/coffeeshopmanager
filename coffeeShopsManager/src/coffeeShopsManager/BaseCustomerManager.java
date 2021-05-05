package coffeeShopsManager;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void save(Customer customer);
	
	public final void sayHello(Customer customer) {
		System.out.println("Hoþgeldiniz " + customer.getFirstName() + " " + customer.getLastName() + ".");
	}
}
