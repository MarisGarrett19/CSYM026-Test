import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TenantListTests {
	
	private TenantList tenantList;
	private Tenant tenant;

	@BeforeEach
	void setUp() throws Exception {
		tenantList = new TenantList(3);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getTenantShouldReturnTenantAtPosition() {
		//arrange
		tenantList.add(new Tenant("Tenant Name 1", 1));
		
		//act
		tenant = tenantList.getTenant(1);
		
		//assert
		assertEquals("Tenant Name 1", tenant.getName());
	}
	
	@Test
	void getTenantShouldReturnNullWhenPositionLessThanOne() {
		//act
		tenant = tenantList.getTenant(0);
		
		//assert
		assertNull(tenant);
	}
	
	@Test
	void getTenantShouldReturnNullWhenPositionGreaterThanTotal() {
		//act
		tenant = tenantList.getTenant(4);
		
		//assert
		assertNull(tenant);
	}
	
	@Test
	void searchShouldReturnTenantWithGivenRoomWhenSingleTenant() {
		//arrange
		tenantList.add(new Tenant("Tenant Name 1", 1));
		
		//act
		tenant = tenantList.search(1);
		
		//assert
		assertEquals(1, tenant.getRoom());
		assertEquals("Tenant Name 1", tenant.getName());
	}
	
	@Test
	void searchShouldReturnTenantWithGivenRoomWhenMultipleTenants() {
		//arrange
		tenantList.add(new Tenant("Tenant Name 1", 1));
		tenantList.add(new Tenant("Tenant Name 2", 2));
		
		//act
		tenant = tenantList.search(2);
		
		//assert
		assertEquals(2, tenant.getRoom());
		assertEquals("Tenant Name 2", tenant.getName());
	}
	
	@Test
	void searchShouldReturnNullWhenNoTenantInSpecifiedRoom() {
		//arrange
		tenantList.add(new Tenant("Tenant Name 1", 1));
		
		//act
		tenant = tenantList.search(2);
		
		//assert
		assertNull(tenant);
	}
	
	@Test
	void searchShouldReturnNullWhenEmptyList() {
		//act
		tenant = tenantList.search(1);
		
		//assert
		assertNull(tenant);
	}
	
	@Test
	void removeTenantShouldReturnTrueWhenTenantIsRemovedSingle() {
		//arrange
		tenantList.add(new Tenant("Tenant Name 1", 1));
		
		//act
		boolean wasRemoved = tenantList.removeTenant(1);
		
		//assert
		assertTrue(wasRemoved);
	}
	
	@Test
	void removeTenantShouldReturnTrueWhenTenantIsRemovedMultiple() {
		//arrange
		tenantList.add(new Tenant("Tenant Name 1", 1));
		tenantList.add(new Tenant("Tenant Name 2", 2));
		
		//act
		boolean wasRemoved = tenantList.removeTenant(2);
		
		//assert
		assertTrue(wasRemoved);
		
	}
	
	@Test
	void removeTenantShouldReturnFalseWhenEmpty() {
		//act
		boolean wasRemoved = tenantList.removeTenant(1);
		
		//assert
		assertFalse(wasRemoved);
	}
	
	@Test
	void removeTenantShouldReturnFalseWhenTenantNotFound() {
		//arrange
		tenantList.add(new Tenant("Tenant Name 1", 1));
		
		//act
		boolean wasRemoved = tenantList.removeTenant(2);
		
		//assert
		assertFalse(wasRemoved);
	}
}
