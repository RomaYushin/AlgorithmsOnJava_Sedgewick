/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.yushin.chapter1.part1;

import edu.princeton.cs.algs4.StdDraw;
import java.util.Random;

/**
 *
 * @author roma_yushin
 */
public class SimpleExcercisesWithArrays {
    
    public static final int ARR_CAPACITY = 20;  
    public static final int MATRIX_CAPACITY = 5;
    
    public static void main (String [] args) {
        
        SimpleExcercisesWithArrays sewa = new SimpleExcercisesWithArrays();
        int [] array1 = sewa.fillArray();
        int [] array2 = sewa.fillArray();
        
        int [][] matrix1 = sewa.fillMatrix();
        int [][] matrix2 = sewa.fillMatrix();               
        
        System.out.print("Массив №1: ");
        sewa.printArr(array1);
        System.out.print("Массив №2: ");
        sewa.printArr(array2);
        
        System.out.println("Максимальное число в массиве №1: " + sewa.findMax(array1));
        System.out.println("Среднее значение в массиве №1: " + sewa.findMid(array1));
        System.out.print("Копирование массива №1 в №2: ");
        sewa.printArr(sewa.copyArray(array1, array2));
        
        System.out.print("Массив №1 в обратном порядке: ");
        sewa.printArr(sewa.reorderArray(array1));
        
        System.out.println("Матрица №1: ");
        sewa.printMatrix(matrix1);
        System.out.println("Матрица №2: ");
        sewa.printMatrix(matrix2);
        
        System.out.println("Матрица №1 умноженная на матрицу №2: ");        
        sewa.printMatrix(sewa.multiplicationMatrix(matrix1, matrix2));
    }
    
    /*
     * заполнение массива числами
     */
    private int[] fillArray () {
        int [] array = new int [ARR_CAPACITY];   
        
        for (int i = 0; i < array.length; i++) {
            int r = new Random().nextInt(ARR_CAPACITY);
            array[i] = r;
        }
        return array; 
    } 
    
     /*
     * заполнение матрицы
     */
    private int [][] fillMatrix () {
        int [][] m1 = new int [MATRIX_CAPACITY][MATRIX_CAPACITY];
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = new Random().nextInt(ARR_CAPACITY);
            }            
        }
        return m1;
    }
    
    /*
     *  выведение содержимого массива в консоль
     */ 
    private void printArr(int arr []) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
   
    
    /*
     * выведение содержимого матрицы в консоль
     */
    private void printMatrix (int [][] matr) {
        for (int i = 0; i < matr.length; i++){
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    /*
     * поиск максимального значения в массиве 
     */
    private int findMax(int array []) {        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max< array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    
    /*
     *  вычесление среднего значения массива
     */    
    private int findMid (int array []) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int mid = sum/(array.length);
        return mid;                
    }
    
    /*
     * копирование значений в другой массив
     */
    private int [] copyArray (int srcArr[], int distArr []) {
        
        if (srcArr.length != distArr.length) {
            throw new UnsupportedOperationException();
        }
        for (int i = 0; i < srcArr.length; i++) {
            distArr[i] = srcArr[i];
        }
        return distArr;
    }

    /*
     * перестановка элементов массива в обратном порядке
     */
    private int [] reorderArray (int srcArr[]) {
        
        int reorderedArr [] = new int [ARR_CAPACITY];
        for (int i = srcArr.length-1, j = 0; j < srcArr.length; i--, j++) {
            reorderedArr[i] = srcArr[j];
        }
        return reorderedArr;
    }
    
    /*
     * умножение матрицы на матрицу
     */
    private int[][] multiplicationMatrix (int matr1 [][], int matr2[][]) {
        
        int [][] multMatr = new int [matr1[0].length][matr2.length];
        
        for (int i = 0; i < matr1[0].length; i++) {
            for (int j = 0; j < matr2.length; j++) {
                for (int k = 0; k < matr2.length; k++) {
                    multMatr [i][j] += matr1[i][k] * matr2[k][j]; 
                }
            }
        }
        return multMatr;
    }            
}
