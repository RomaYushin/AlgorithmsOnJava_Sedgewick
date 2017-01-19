/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.yushin.chapter1.part1;

import java.util.Random;

/**
 *
 * @author roma_yushin
 */
public class CountGCD {
    
    public static void main (String [] args) {

        for (int i = 0; i < 100; i++) {
            int a = new Random().nextInt(100);
            int b = new Random().nextInt(100);
            int gcdOf2Numbers = gcd(a, b);
            System.out.println("GCD " + a + ", " + b + " is " + gcdOf2Numbers);
        }   
        
    }
    
    private static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        } 
        int c = a%b;
        return gcd (b, c);
    }
    
}
