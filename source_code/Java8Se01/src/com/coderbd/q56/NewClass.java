package com.coderbd.q56;

public class NewClass {

    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);
    }

    static public void main(String[] args) {
        System.out.println("Main main ");
    }
}
