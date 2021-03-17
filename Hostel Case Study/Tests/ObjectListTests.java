import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObjectListTests {
	
	private ObjectList objectList;

	// Arrange
	@BeforeEach
	void setUp() throws Exception {
		objectList = new ObjectList(10);
	}

	@AfterEach
	void tearDown() throws Exception {
		objectList = null;
	}

	@Test
	void constructorSetsTotalCorrectly() {
		//act
		int total =  objectList.getTotal();
		
		//assert
		assertEquals(0, total);
	}

	@Test
	void addSetsTotalCorrectlyWithSingleAddition() {
		// act
		objectList.add(12);
		
		var total = objectList.getTotal();
		
		// assert
		assertEquals(1, total);
	}
	
	@Test
	void addSetsTotalCorrectlyWithMultipleAdditions() {
		// act
		objectList.add(12);
		objectList.add(14);
		objectList.add(15);
		
		var total = objectList.getTotal();
		
		// assert
		assertEquals(3, total);
	}
	
	@Test
	void addReturnsTrueWhenAdded() {
		// act
		boolean result = objectList.add(12);
		
		// assert
		assertTrue(result);
	}
		
	@Test
	void addReturnsFalseWhenNotAdded() {
		// arrange
		objectList = new ObjectList(1);
		
		// act
		objectList.add(10);
		
		boolean result = objectList.add(12);
		
		// assert
		assertFalse(result);
	}
	
	@Test
	void getItemReturnsItemAtPosition() {
		// arrange
		objectList = new ObjectList(3);
		
		// act
		objectList.add(1);
		objectList.add(2);
		objectList.add(3);
		
		Object obj = objectList.getItem(2);
		int result = Integer.parseInt(obj.toString());
		
		// assert
		assertEquals(2, result);
	}
	
	@Test
	void getItemReturnsNullWhenNegativePostition() {
		// arrange
		objectList = new ObjectList(3);
		
		// act
		Object obj = objectList.getItem(-1);
		
		// assert
		assertNull(obj);
	}
	
	@Test
	void getItemReturnsNullWhenZeroPostition() {
		// arrange
		objectList = new ObjectList(3);
		
		// act
		Object obj = objectList.getItem(0);
		
		// assert
		assertNull(obj);
	}
	
	@Test
	void getTotalReturnsCorrectTotal() {
		// arrange
		objectList = new ObjectList(3);
		
		// act
		objectList.add(1);
		objectList.add(2);
		objectList.add(3);
		
		int total = objectList.getTotal();
		
		// assert
		assertEquals(3, total);
	}
	
	@Test
	void isEmptyReturnsFalseWhenNotEmpty() {
		// act
		objectList.add(12);
		
		boolean result = objectList.isEmpty();
		
		// assert
		assertFalse(result);
	}
	
	@Test
	void isEmptyReturnsTrueWhenEmpty() {
		// act
		boolean result = objectList.isEmpty();
		
		// assert
		assertTrue(result);
	}
	
	@Test
	void isFullReturnsFalseWhenNotFull() {
		// act
		boolean result = objectList.isFull();
		
		// assert
		assertFalse(result);
	}
	
	@Test
	void isFullReturnsTrueWhenFull() {
		// arrange
		objectList = new ObjectList(1);
		
		// act
		objectList.add(10);
		
		boolean result = objectList.isFull();
		
		// assert
		assertTrue(result);
	}
	
	@Test
	void removeReturnsFalseWhenNoItems() {
		// act
		boolean result = objectList.remove(1);
		
		// assert
		assertFalse(result);
	}
	
	@Test
	void removeReturnsFalseWhenNegativeItemNumber() {
		// act
		boolean result = objectList.remove(-1);
		
		// assert
		assertFalse(result);
	}
	
	@Test
	void removeReturnsFalseWhenZeroItemNumber() {
		// act
		boolean result = objectList.remove(0);
		
		// assert
		assertFalse(result);
	}
	
	@Test
	void removeDecreasesTotalWhenItemRemoved() {
		// act
		objectList.add(10);
		
		int total = objectList.getTotal();
		assertEquals(1, total);
		
		objectList.remove(1);
		total = objectList.getTotal();
		
		// assert
		assertEquals(0, total);
	}
	
	@Test
	void removeReturnsTrueWhenItemRemoved() {
		// act
		objectList.add(10);
		
		boolean result = objectList.remove(1);
		
		// assert
		assertTrue(result);
	}
	
	@Test
	void toStringReturnsItemsInStringWhenSingleItem() {
		// act
		objectList.add(10);
		
		String result = objectList.toString();
		
		// assert
		assertEquals("[  10  ]", result);
	}
	
	@Test
	void toStringReturnsItemsInStringWhenMultipleItems() {
		// act
		objectList.add(10);
		objectList.add(13);
		
		String result = objectList.toString();
		
		// assert
		assertEquals("[  10  13  ]", result);
	}
}
