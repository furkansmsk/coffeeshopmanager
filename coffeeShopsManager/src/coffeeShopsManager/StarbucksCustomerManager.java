package coffeeShopsManager;

public class StarbucksCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		
		if(CustomerCheckManager.isReal(customer)==true) {
			System.out.println("Kayd�n�z Ba�ar�yla Tamamland� " + customer.getFirstName()+ " " + customer.getLastName() + ".");
		}else {
			System.out.println("Kayd�n�z, Kimlik Bilgilerinizin Do�rulanamamas� Nedeniyle Tamamlanamad�.");
		}
		
	}


}
