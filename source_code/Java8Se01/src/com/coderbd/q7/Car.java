/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q7;

/**
 *
 * @author sami
 */
public class Car extends Vehicle {

    String trans;

//    public Car(String trans) {//wrong
//      this.trans=trans;
//    }
    public Car(String type, String maxSpeed) {
        super(type, maxSpeed);
    }

    public Car(String trans, String type, String maxSpeed) {
        super(type, maxSpeed);
        this.trans = trans;
    }

}
