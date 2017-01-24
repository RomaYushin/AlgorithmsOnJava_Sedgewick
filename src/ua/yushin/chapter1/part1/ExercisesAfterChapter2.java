/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.yushin.chapter1.part1;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author roma_yushin
 */
public class ExercisesAfterChapter2 {
    
    public static void main (String [] args) {
        task_1_2_1();        
        //task_1_1_2();
        //task_1_1_6();
        //task_1_1_7();
        //task_1_1_8();
        //task_1_1_13();
        //task_1_1_14_lg ();
        //task_1_1_19_fibonacci (56);
        //System.out.println(task_1_1_19_fibonacci (45));
    }
    
    private static void task_1_2_1() {
        int N = 5;
        Point2D pointsArray [] = new Point2D [N];
        int i = 0;
        while (N > i) {
            double x = new Random().nextDouble();
            double y = new Random().nextDouble();
            System.out.println("x: " + x + " y: " + y);
            pointsArray[i] = new Point2D(x, y);
            i++;
        }
        
        double len = 0;
        double minLen = 1.0;
        for (int j = 0; j < pointsArray.length; j++) {
            for (int k = j+1; k < pointsArray.length; k++) {
                double x2x1=pointsArray[j].x() - pointsArray[k].x(); // x2 - x1
                double y2y1=pointsArray[j].y() - pointsArray[k].y(); // y2 - y1
                len = Math.sqrt(Math.pow(x2x1, 2) + Math.pow(y2y1, 2));
                if (len<minLen) {
                    StdDraw.setPenRadius(0.005);
                    StdDraw.clear();
                    StdDraw.line(pointsArray[j].x(), pointsArray[j].y(), pointsArray[k].x(), pointsArray[k].y());
                    minLen=len;
                }
            }
        }
        System.out.println("\nmin length between two points is " + minLen);
        
        i=0;
        while (N > i) {
            StdDraw.setPenRadius(0.01);
            StdDraw.point(pointsArray[i].x(), pointsArray[i].y());
            i++;
        }
        
    }
}
