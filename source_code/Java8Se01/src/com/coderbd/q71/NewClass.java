package com.coderbd.q71;

public class NewClass extends RuntimeException {

    public static void main(String[] args) {
        try {
            method1();
        } catch (NewClass e) {
            System.out.println("A");
        }
    }

    public static void method1() {
        try {
            throw Math.random() > 0.5 ? new NewClass() : new RuntimeException();
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}
