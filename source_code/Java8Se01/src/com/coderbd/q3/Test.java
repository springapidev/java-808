/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sami
 */
public class Test {

    public static void main(String[] args) {
        // String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);//Ok Result is 2014-05-04
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
    }

}
