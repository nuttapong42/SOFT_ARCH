package com.company;

public class Main {

    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher( "testvalue");
        AlphabetSubscriber alphabetSubscriber = new AlphabetSubscriber();
        publisher.subscribe(alphabetSubscriber);
        publisher.setSubscription();
    }
}
