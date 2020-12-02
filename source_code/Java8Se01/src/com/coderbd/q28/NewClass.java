package com.coderbd.q28;

public class NewClass {

    static int i;
    int j;

    public static void main(String[] args) {
        NewClass x1 = new NewClass();
        NewClass x2 = new NewClass();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " "
                + x1.j + " "
                + x2.i + " "
                + x2.j);
    }

}
