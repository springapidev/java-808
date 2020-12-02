/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q108;

/**
 *
 * @author sami
 */
public class NewClass {

    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        do {
            idx++;
        } while (idx < size - 1);
        System.out.println("The Top Element: " + stack[idx]);
    }

}
