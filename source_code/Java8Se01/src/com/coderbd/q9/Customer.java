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
public class Customer {

    ElectricAccount account = new ElectricAccount();

    public void useElectricity(double kwh) {
        account.addKWh(kwh);
    }
}
