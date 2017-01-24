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
        //task_1_1_7();
        //task_1_1_8();
        //task_1_1_13();
        //task_1_1_14_lg ();
        //task_1_1_19_fibonacci (56);
        System.out.println(task_1_1_19_fibonacci (45));
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
        
        // ******************
        
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i;j++) {
                sum++;
            }
        }
        StdOut.println(sum);
        StdOut.println("");
    }
    
    private static void task_1_1_8 () {
        System.out.println('b');            // b
        System.out.println('b'+'c');        // код символа b + c
        System.out.println((char) ('a'+4)); // код символа a + 4 --> другой символ
    }
    
    private static void task_1_1_13 () {
        int matr1 [] [] = {{1,2},{3,4}};
        int matr2 [] [] = {{0,0},{0,0}};
        
        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1[0].length; j++) {
                System.out.print(matr1[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1[0].length; j++) {
                matr2[i][j] = matr1[j][i]; 
            }
        }
        
        for (int i = 0; i < matr2.length; i++) {
            for (int j = 0; j < matr2[0].length; j++) {
                System.out.print(matr2[i][j] + " ");
            }
            System.out.println("");
        }        
    }
    
    private static void task_1_1_14_lg () {
        int N = 16;
        int result = 0;
        int log2_N=1;
        do {       
            if (log2_N >= N ) {
                if (log2_N > N) {
                    result--;
                }
                break;
            }
            log2_N *= 2;  
            result++;             
        } while (true);       
        System.out.println(result);
    }
    
    private static long task_1_1_19_fibonacci (int N) {
        
        if (N == 0) return 0;
        if (N == 1) return 1;
        return task_1_1_19_fibonacci(N-1) + task_1_1_19_fibonacci(N-2);
    }    
}