package coffeeShopsManager;

public class StarbucksCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		
		if(CustomerCheckManager.isReal(customer)==true) {
			System.out.println("Kaydýnýz Baþarýyla Tamamlandý " + customer.getFirstName()+ " " + customer.getLastName() + ".");
		}else {
			System.out.println("Kaydýnýz, Kimlik Bilgilerinizin Doðrulanamamasý Nedeniyle Tamamlanamadý.");
		}
		
	}


}
