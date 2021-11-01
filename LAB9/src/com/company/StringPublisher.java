package com.company;
import java.util.concurrent.Flow;
import java.util.regex.Pattern;
import java.util.ArrayList;


public class StringPublisher implements Flow.Publisher {
        private String publisher;
        private ArrayList<StringSubscription> subscriptions = new ArrayList<StringSubscription>();

        public StringPublisher(String b) {
            this.publisher = b;
        }

        @Override
        public void subscribe(Flow.Subscriber subscriber) {
            StringSubscription subscription = new StringSubscription(subscriber);
            subscriptions.add(subscription);
            subscriber.onSubscribe(subscription);
        }




    public void postToString() {

            for (StringSubscription subscription : subscriptions){
                if (subscription.subscriber instanceof AlphabetSubscriber && Pattern.compile("[a-zA-z]").matcher(publisher).find()){
                    subscription.post(publisher);
                }
                if (subscription.subscriber instanceof NumberSubscriber && Pattern.compile("[0-9]").matcher(publisher).find()){
                    subscription.post(publisher);
                }
                if (subscription.subscriber instanceof SymbolSubscriber && Pattern.compile("[,!@#$%&*()_+=|<>?{}\\\\\\\\[\\\\\\\\]~-]").matcher(publisher).find()){
                    subscription.post(publisher);
                }

            }
    }


}
