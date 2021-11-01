package com.company;


import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher {
        private String publisher;
        private StringSubscription[] subscriptions = new StringSubscription[]{};
        public StringPublisher(String a) {
            this.publisher = a;
        }

        @Override
        public void subscribe(Flow.Subscriber subscriber) {
            StringSubscription subscription = new StringSubscription(subscriber);
            subscriber.onSubscribe(subscription);
            subscriptions[subscriptions.length] = subscription;
        }
        public void setSubscription() {
            for (int j = 0; j < subscriptions.length; j++) {
                subscriptions[j].post(publisher);
            }
        }
}
