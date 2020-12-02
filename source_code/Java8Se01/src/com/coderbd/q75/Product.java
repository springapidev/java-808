/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q75;

/**
 *
 * @author sami
 */
public class Product {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Product p1 = new Product(100, "Pen");
        Product p2 = new Product(100, "Pen");
        Product p3 = p1;
        boolean ans1 = p1 == p2;
        boolean ans2 = p1.name.endsWith(p2.name);
        System.out.println("Ans1: " + ans1 + " Ans2: " + ans2);
    }
}
