import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TenantTest {
    Tenant myTenant;
    PaymentList paymentList;
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
    void getName() {
        assertEquals("Sasha", myTenant.getName());
    }

    @Test
    void getRoom() {
        assertEquals(2, myTenant.getRoom());
    }

    @Test
    void makePayment() {
        myTenant.makePayment(payment);
        assertEquals("May", payment.getMonth());
    }

    @Test
    void getPayments() {
        assertTrue(myTenant.getPayments().isEmpty());
        myTenant.makePayment(payment);
        assertFalse((myTenant.getPayments().isEmpty()));


    }
}