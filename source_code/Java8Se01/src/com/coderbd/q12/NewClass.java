/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q12;

/**
 *
 * @author sami
 */
public class NewClass {
    
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta = ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
        
    }
}
