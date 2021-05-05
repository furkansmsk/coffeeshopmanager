package coffeeShopsManager;

public class StarbucksCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		
		if(CustomerCheckManager.isReal(customer)==true) {
			System.out.println("Kaydınız Başarıyla Tamamlandı " + customer.getFirstName()+ " " + customer.getLastName() + ".");
		}else {
			System.out.println("Kaydınız, Kimlik Bilgilerinizin Doğrulanamaması Nedeniyle Tamamlanamadı.");
		}
		
	}


}
