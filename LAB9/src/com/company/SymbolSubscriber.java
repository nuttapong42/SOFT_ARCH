package com.company;

import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber {


    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("Symbol = " + item);
    }
}




