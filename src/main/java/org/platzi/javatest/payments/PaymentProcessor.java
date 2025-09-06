package org.platzi.javatest.payments;

public class PaymentProcessor {

    /// Atributo
    private PaymentGatway paymentGatway;

    /// Constructor
    public PaymentProcessor(PaymentGatway paymentGatway) {
        this.paymentGatway = paymentGatway;
    }

    /// Metodos
    public boolean makePawyment(double amount) {
        PaymentResponse response = paymentGatway.requestPaiment(new PaymentRequest(amount));
        if (response.getSatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
