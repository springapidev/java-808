/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.q104;

/**
 *
 * @author sami
 */
public class NewClass {

    public static void main(String[] args) {
        int nums[];
        nums = new int[2];
        nums[0] = 10;
        nums[1] = 20;
        nums = new int[4];
        nums[2] = 30;
        nums[3] = 40;
        for (int x : nums) {
            System.out.println(" " + x);
        }
    }

}
