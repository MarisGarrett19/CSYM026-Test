import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class getMonth {

	@Test
	public void getMonthtest() {
		Payment monthlist = new Payment("January", 1000);
		String month = monthlist.getMonth();
		assertEquals("January", month);
				
	}
	
	@Test
	public void Monthtest() {
		Payment monthlist = new Payment("January", 1000);
		String month = monthlist.getMonth();
		assertTrue("March"==month);
				
	}
	
	@Test
	public void getAmounttest() {
		Payment amount = new Payment("January", 1000.00);
		double amountval = amount.getAmount();
		assertEquals(2000.00, amountval);
				
	}
	
	@Test
	public void Amounttest() {
		Payment amount = new Payment("January", 1000.00);
		double amountval = amount.getAmount();
		assertTrue(1000.00==amountval);
				
	}
}

