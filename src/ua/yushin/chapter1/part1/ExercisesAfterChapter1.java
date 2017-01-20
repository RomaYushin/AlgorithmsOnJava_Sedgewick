/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.yushin.chapter1.part1;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author roma_yushin
 */
public class ExercisesAfterChapter1 {
    
    public static void main (String [] args) {
        //task_1_1_1();        
        //task_1_1_2();
        //task_1_1_6();
        task_1_1_7();
    }
    
    private static void task_1_1_1 () {
        System.out.println((0+15)/2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
        System.out.println("");
    }
    
    private static void task_1_1_2 () {
        System.out.println((1+2.236)/2);        // 1.618
        System.out.println(1 + 2 + 3 + 4.0);    // 10.0
        System.out.println(4.1 > 4);            // true
        System.out.println(1 + 2 + "3");        // 33
        System.out.println("");
    }
    
    private static void task_1_1_6 () {
        int f = 0;
        int g = 1;
        for (int i=0; i<=15; i++) {
            StdOut.println(f);
            f=f+g;
            g=f-g;
        }
        System.out.println("");
    }
    
    private static void task_1_1_7 () {
        double t = 9.0;
        while (Math.abs(t-9.0/t)>.001) {
            t = (9.0/t+t)/2.0;
        }
        StdOut.printf("%.5f\n", t);
        System.out.println("");
    }
    
}
