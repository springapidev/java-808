package com.coderbd.q45;

import java.util.ArrayList;

public class NewClass {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true) {
                myList.add("My String");
                System.out.println("Size: " + myList.size());
            }
        } catch (RuntimeException re) {
            System.out.println("Caught Runtime Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
        System.out.println("Ready to use");
    }

}
