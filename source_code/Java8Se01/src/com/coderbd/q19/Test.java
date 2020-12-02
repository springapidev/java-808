package com.coderbd.q19;

public class Test {

    void readCard(int cardNo) throws Exception {
        System.out.println("Reading card");
    }

    void checkingCard(int cardNo) throws RuntimeException {
        System.out.println("Reading card");
    }

    public static void main(String[] args) {
        Test test = new Test();
        int cardNo = 123456;
        test.checkingCard(cardNo);
        //test.readCard(cardNo);// problem is Here: unreported exception Exception; must be caught or declared to be thrown
    }
}
