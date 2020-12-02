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
public class CheckingAmount {
    public int amount;

    public CheckingAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    public void changeAmount(int x){
        amount +=x;
    }
}
