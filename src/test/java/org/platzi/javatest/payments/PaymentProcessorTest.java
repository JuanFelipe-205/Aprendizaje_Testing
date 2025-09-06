package org.platzi.javatest.payments;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {

    /// Como se usa el metodo before se declaran atributos
    private PaymentGatway paymentGatWay;
    private PaymentProcessor paymentProcessor;

    /// Este metodo se usa para evitar repetir funciones
    @Before
    public void setUp(){
        paymentGatWay = Mockito.mock(PaymentGatway.class); /// Instancia de clase con valores Mock
        paymentProcessor = new PaymentProcessor(paymentGatWay);
    }

    @Test
    public void payment_is_correct(){
        /// Primera parte, preparacion
        Mockito.when(paymentGatWay.requestPaiment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK)); /// Simulacion de caso, donde se simula una respuesta esperada

        /// Segunda parte, comprovacion del resultado
        Assert.assertEquals(true, paymentProcessor.makePawyment(1000));
    }

    @Test
    public void payment_is_incorrect(){
        Mockito.when(paymentGatWay.requestPaiment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        Assert.assertEquals(false, paymentProcessor.makePawyment(1000));
    }
}