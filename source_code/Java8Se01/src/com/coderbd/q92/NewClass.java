/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q92;

/**
 *
 * @author sami
 */
public class NewClass {

    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String[] pwd = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
            }
        } catch (Exception e) {
            System.out.println("Invalid Name");
        }
        for (String p : pwd) {
            System.out.println(p);
        }
    }

}
