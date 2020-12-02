/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q17;

/**
 *
 * @author sami
 */
public class Test {
    
    public static void main(String[] args) {
        CheckingAmount acc = new CheckingAmount((int) (Math.random() * 1000));
        // acc.amount = 0;//Ok
        //  acc.changeAmount(-acc.getAmount());//Ok
        acc.changeAmount(-acc.amount);
        System.out.println(acc.getAmount());
    }
}
