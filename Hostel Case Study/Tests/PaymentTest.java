import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentTest {

	private Payment payment;

	@BeforeEach
	public void setUp() {
		System.out.println("Inside setup");
		payment = new Payment("January", 100);
	}

	@Test
	public void getInputForEquals() {
		assertEquals("January", payment.getMonth());
	}

	@Test
	public void getInputForNotEquals() {
		assertNotEquals("February", payment.getMonth());
	}

	@Test
	public void getMonthValidOrNot() {
		assertNotEquals("Enter a valid month", payment.getMonth());
	}

	@Test
	public void getAmountEqualsWithGiven() {
		assertEquals(100, payment.getAmount());
	}

	@Test
	public void getAmountNotEqualsWithGiven() {
		assertNotEquals(200, payment.getAmount());
	}

	@Test
	public void getAmounValidOrNot() {
		assertNotEquals("Enter a valid amount", payment.getAmount());
	}

}
