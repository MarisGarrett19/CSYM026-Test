import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentListTest {
	private PaymentList paymentList;
	private Payment pay, pay1, pay2;

	@BeforeEach
	public void setUp() {
		paymentList = new PaymentList(4);
		pay = new Payment("January", 10);
		pay1 = new Payment("Febrary", 24);
		pay2 = new Payment("March", 34);
		paymentList.add(pay);
		paymentList.add(pay1);
		paymentList.add(pay2);
	}
	
	@Test
	public void getPaymentFromPosition() {
		assertEquals(10, pay.getAmount());
	}
	
	@Test
	public void getPaymentNull() {
		assertNull(paymentList.getPayment(0));
	}
	
	@Test
	public void getPaymentObjectNotNull() {
		assertNotNull(paymentList.getPayment(2));
	}
	
	@Test
	public void getPaymentGreaterthanTotalsize() {
		assertNull(paymentList.getPayment(paymentList.getTotal() + 1));
	}
	
	@Test
	public void getPaymentTotal() {
		assertEquals(68, paymentList.calculateTotalPaid());
	}
	
	@Test
	public void getPaymentTotalNegative() {
		PaymentList newpaymentlist = new PaymentList(1);
		assertEquals(0, newpaymentlist.calculateTotalPaid());
	}

}
