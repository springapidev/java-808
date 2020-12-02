/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q123;

import java.time.LocalDate;

/**
 *
 * @author sami
 */
public class NewClass {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 31);// 32 is wrong
        date.plusDays(10);
        System.out.println(date);
    }
}
