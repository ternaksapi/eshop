package id.ac.ui.cs.advprog.eshop.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import enums.PaymentStatus;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    private Map<String, String> paymentData;

    @BeforeEach
    void setUp() {
        this.paymentData = new HashMap<>();
    }
    @Test
    void testCreatePaymentDefault(){
        Payment payment = new Payment("13652556-012a-4c07-b546-54eb1396d79b",
                "VOUCHER", this.paymentData);

        assertEquals("13652556-012a-4c07-b546-54eb1396d79b", payment.getId());
        assertEquals("VOUCHER", payment.getMethod());
        assertEquals("PENDING", payment.getStatus());
        assertEquals(this.paymentData, payment.getPaymentData());
    }
    @Test
    void testCreatePaymentSuccessStatus(){
        Payment payment = new Payment("13652556-012a-4c07-b546-54eb1396d79b",
                "VOUCHER", this.paymentData, PaymentStatus.SUCCESS.getValue());

        assertEquals("13652556-012a-4c07-b546-54eb1396d79b", payment.getId());
        assertEquals("VOUCHER", payment.getMethod());
        assertEquals("SUCCESS", payment.getStatus());
        assertEquals(this.paymentData, payment.getPaymentData());
    }
    @Test
    void testCreatePaymentInvalidStatus(){
        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("13652556-012a-4c07-b546-54eb1396d79b",
                    "VOUCHER", this.paymentData, "MEOW");
        });
    }
    @Test
    void testSetPaymentToInvalidStatus(){
        Payment payment = new Payment("13652556-012a-4c07-b546-54eb1396d79b",
                "VOUCHER", this.paymentData);

        assertThrows(IllegalArgumentException.class, () -> {
            payment.setStatus("MEOW");
        });
    }
    @Test
    void testSetPaymentToSuccessStatus(){
        Payment payment = new Payment("13652556-012a-4c07-b546-54eb1396d79b",
                "VOUCHER", this.paymentData);

        payment.setStatus("SUCCESS");
        assertEquals("SUCCESS", payment.getStatus());
    }
}

