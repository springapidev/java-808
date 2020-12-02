/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q26;

import java.util.ArrayList;
import java.util.List;

public class NewClass {

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if (names.remove("Bran")) {
            names.remove("Jon");
        }
        System.out.println(names);

    }
}
