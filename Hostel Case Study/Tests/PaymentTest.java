import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentTest {

	private Payment payment;
	
	@BeforeEach
	public void setUp() 
	{
	System.out.println("Inside setup");
	payment = new Payment("January", 100);
		
	}
	
	@Test
	public void testgetMonthfromInput1() 
	{
		assertEquals("January", payment.getMonth());
		
	}
	
	@Test
	public void testgetMonthfromInput2() 
	{
		assertNotEquals("February", payment.getMonth());
		
	}
	
	@Test
	public void testgetMonthNegative() 
	{
		assertNotEquals("Enter a valid month", payment.getMonth());
		
	}
	
	
	@Test
	public void testgetAmountValid() 
	{
		assertEquals(100, payment.getAmount());
		
	}
	
	
	@Test
	public void testgetAmountInValid() 
	{
		assertNotEquals(200, payment.getAmount());
		
	}
	
	@Test
	public void testgetAmountTrue() 
	{
		assertNotEquals("Enter a valid amount", payment.getAmount());
		
	}
	
}
