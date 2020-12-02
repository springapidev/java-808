/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q81;

/**
 *
 * @author sami
 */
public class NewClass {

    int x;
    int y;

    public void dostuff(int x, int y) {
        this.x = x;
        y = this.y;
    }

    public void display() {
        System.out.println("X: " + x + " Y " + y);
    }

    public static void main(String[] args) {
        NewClass m1 = new NewClass();
        m1.x = 100;
        m1.y = 200;
        NewClass m2 = new NewClass();
        m2.dostuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}
