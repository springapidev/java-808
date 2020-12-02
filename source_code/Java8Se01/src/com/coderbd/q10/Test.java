package com.coderbd.q10;

/**
 *
 * @author sami
 */
public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s)) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
    }
}
