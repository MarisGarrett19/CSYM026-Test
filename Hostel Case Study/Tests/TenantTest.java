import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TenantTest {

    Tenant myTenant;
    Payment payment;
    @BeforeEach
    void setUp() {
        myTenant = new Tenant("Sasha", 2);
        payment = new Payment("May", 1980);

    }

    @AfterEach
    void tearDown() {
        myTenant = null;
    }

    @Test
    void getNameReturnsTenantName() {
        assertEquals("Sasha", myTenant.getName());
    }

    @Test
    void getRoomReturnsTenantRoomNumber() {
        assertEquals(2, myTenant.getRoom());
    }

    @Test
    void makePaymentAddsPaymentToPaymentList() {
        myTenant.makePayment(payment);
        assertEquals("May", payment.getMonth());
    }

    @Test
    void getPaymentsReturnsPayment() {
        assertTrue(myTenant.getPayments().isEmpty());
        myTenant.makePayment(payment);
        assertFalse((myTenant.getPayments().isEmpty()));


    }

}
