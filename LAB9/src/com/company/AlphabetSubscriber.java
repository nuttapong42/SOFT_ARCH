package com.company;

import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber {

    public void onSubscribe (Flow.Subscription subscription) {
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println(item);
    }



}
