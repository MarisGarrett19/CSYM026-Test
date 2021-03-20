import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PaymentListTest {

	@Test
	public void positiontest() {
		
		Payment pay = new Payment("January",10);
		Payment pay1 = new Payment("Febrary",24);
		Payment pay2 = new Payment("March",34);
		PaymentList list = new PaymentList(5);
		list.add(pay);
		list.add(pay1);
		list.add(pay2);
		Payment posit = list.getPayment(1);
		assertEquals(pay1,posit);
		
	}
	
	@Test
	public void findposition() {
		
		Payment pay = new Payment("January",10);
		Payment pay1 = new Payment("Febrary",24);
		Payment pay2 = new Payment("March",34);
		PaymentList list = new PaymentList(5);
		list.add(pay);
		list.add(pay1);
		list.add(pay2);
		Payment posit = list.getPayment(2);
		assertTrue(pay1==posit);
		
	}
	@Test
	
public void totaltest() {
		
		Payment pay = new Payment("January",10);
		Payment pay1 = new Payment("Febrary",24);
		Payment pay2 = new Payment("March",34);
		PaymentList list = new PaymentList(5);
		list.add(pay);
		list.add(pay1);
		list.add(pay2);
		double gettotal = list.calculateTotalPaid();
		double total= 68;
		assertTrue(total==gettotal);
		
		
	}
	
	
	@Test
	
	public void findtotal() {
			
			Payment pay = new Payment("January",10);
			Payment pay1 = new Payment("Febrary",24);
			Payment pay2 = new Payment("March",34);
			PaymentList list = new PaymentList(5);
			list.add(pay);
			list.add(pay1);
			list.add(pay2);
			double gettotal = list.calculateTotalPaid();
			assertEquals(50,gettotal);
			
		}
}
