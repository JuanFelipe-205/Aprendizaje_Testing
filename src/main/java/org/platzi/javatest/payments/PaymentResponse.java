package org.platzi.javatest.payments;

public class PaymentResponse {

    enum PaymentStatus{
        OK, ERROR
    }

    /// Atributo
    private PaymentStatus satus;

    /// Constructor
    public PaymentResponse(PaymentStatus satus) {
        this.satus = satus;
    }

    /// Get
    public PaymentStatus getSatus() {
        return satus;
    }
}
