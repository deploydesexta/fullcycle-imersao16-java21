package com.deploydesexta.imersao16.application.gateways;

import com.deploydesexta.imersao16.domain.PaymentMethod;

public interface PaymentGateway {

    Output execute(Input input);

    record Input(PaymentMethod paymentMethod) {
    }

    record Output(String transactionId) {
    }
}
