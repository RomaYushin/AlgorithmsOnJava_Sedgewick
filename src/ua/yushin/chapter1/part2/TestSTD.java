/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.yushin.chapter1.part2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Random;

/**
 *
 * @author roma_yushin
 */
public class TestSTD {

    public static void main(String[] args) {
//        int N = 100;
//        double [] array = new double [N];
//        for (int i = 0; i < N; i++) {
//            array[i] = Math.random();
//            System.out.println(array[i]);
//        } 
//        StdDraw.setScale(-.05, 1.05);
//        for (int i = 0; i < N; i++) {
//            double x = ((double)i)/N;
//            double y = array[i]/2.0;
//            double rw = 0.25/N;
//            double rh = array[i]/2.0;
//            StdDraw.filledRectangle(x, y, rw, rh);
//        }

    StdDraw.setScale(-2, +2);
   StdDraw.enableDoubleBuffering();

   for (double t = 0.0; true; t += 0.002) {
       double x = Math.sin(t);
       double y = Math.cos(t);
       StdDraw.clear();
       StdDraw.filledCircle(x, y, 0.05);
       StdDraw.filledCircle(-x, -y, 0.05);
       StdDraw.show();
       StdDraw.pause(1);
   }
    } 

}
