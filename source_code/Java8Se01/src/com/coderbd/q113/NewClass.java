/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q113;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sami
 */
public class NewClass {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.of(2014,7,31,1,1);
        dt.plusDays(30);
        dt.plusMonths(1);
     //   System.out.println(dt format (DateTimeFormatter.ISO_DATE));
    }
}
