/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.yushin.chapter1.part2.task121;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roma_yushin
 */
public class Main {
   
   private static Main main = new Main ();
   private static final int N_POINTS = 10;
   private static final int MIN_COORD_X = 0;
   private static final int MAX_COORD_X = 10;
   private static final int MIN_COORD_Y = 0;
   private static final int MAX_COORD_Y = 10;
   private static final double RADIUS = 0.01;
   private List <Point2D> points = new ArrayList<Point2D>();
   
   public static void main (String [] args) {
       main.createRandomAmountOfPoints();
       main.showPoints();
   }
   
   private void createRandomAmountOfPoints () {
       for (int i = 0; i < N_POINTS; i++) {
           int x = StdRandom.uniform(MIN_COORD_X, MAX_COORD_X);
           int y = StdRandom.uniform(MIN_COORD_Y, MAX_COORD_Y);           
           points.add(new Point2D(x, y));
       }
//       return points;
   }
   
   private void showPoints () {
       StdDraw.setPenRadius(RADIUS);
       StdDraw.setPenColor(StdDraw.BLUE);
       for (double i = 0; i < 1; i+=0.1) {
           
       StdDraw.point(i, i);
//StdDraw.point(0.1, 0.1);
//StdDraw.point(0.2, 0.1);
       }
   }
   
}
