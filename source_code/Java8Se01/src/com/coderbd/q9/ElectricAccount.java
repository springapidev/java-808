/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q9;

/**
 *
 * @author sami
 */
public class ElectricAccount {

    private double kwh;
    private double rate = 0.7;
    private double bill;

    public void addKWh(double kwh) {
        this.kwh += kwh;
        this.bill = this.kwh * this.rate;
    }
}
