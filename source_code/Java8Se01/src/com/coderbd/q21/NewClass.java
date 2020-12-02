/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q21;

/**
 *
 * @author sami
 */
public class NewClass {

    public static void main(String[] args) {
        String opt = "true";
        switch (opt) {//incompatible types: boolean cannot be converted to int
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("***");
        }
        System.out.println("Done");
    }
}
