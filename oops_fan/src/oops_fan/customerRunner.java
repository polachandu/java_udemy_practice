package oops_fan;

public class customerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("9 TH","Calgary","T2P 2B3");
		Customer customer = new Customer("chandu",homeAddress);
		System.out.println(customer);
		Address workAddress = new Address("UoC","Calgary","T2P 2B3");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
