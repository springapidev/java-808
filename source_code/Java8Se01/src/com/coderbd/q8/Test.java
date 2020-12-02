/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q8;

import java.io.IOException;

/**
 *
 * @author sami
 */
public class Test {

    public static void main(String[] args) throws IOException {// correct
        X obj = new X();
        obj.printFileContent();
    }
//    public static void main(String[] args) {// correct
//        X obj = new X();
//        try {
//            obj.printFileContent();
//        } catch (IOException op) {
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    
//     public static void main(String[] args) {// wrong
//        X obj = new X();
//        try {
//            obj.printFileContent();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }catch (IOException op) {
//
//        }

    
}
