package org.platzi.javatest.payments;

public interface PaymentGatway {

    PaymentResponse requestPaiment(PaymentRequest request);
}
