/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzjavaapplication113;

import java.util.Scanner;

/**
 *
 * @author Abdelrahman
 */
public class JavaApplication113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //declearing all the points with an array with the length of 3 because the triangle have 3 nodes
        // you can use these numbers to get a good triangle : 5 5, 30 30, 10 40
        int[] x = new int[3];
        int[] y = new int[3];
        int a = 0;
        boolean[][] matrix = new boolean[51][51];

        while (a != 3) {
            System.out.println("");
            a = 0;
            clearMatrix(matrix);

            //This "for" loop to let the user enter all points
            for (int i = 0; i < x.length; i++) {
                System.out.println("Enter x" + (i + 1));
                x[i] = scn.nextInt();
                System.out.println("Enter y" + (i + 1));
                y[i] = scn.nextInt();

            }
            //This "for" loop to end the program when the user enters 0 for all the points

            for (int j = 0; j < 3; j++) {
                if (x[j] == 0 && y[j] == 0) {
                    a++;
                }
            }
            //this for loop to invoke the drawline method
            for (int i = 0; i < x.length; i++) {
                drawline(matrix, x[i], y[i], x[(i + 1) % 3], y[(i + 1) % 3]);
            }
            PrintMatrix(matrix);
        }
    }

    public static void drawline(boolean[][] matrix, int x0, int y0, int x1, int y1) {

        // Switching between x1,x0,y1,y0 to not get any negeative numbers
        int Bx = x1, Ax = x0, By = y1, Ay = y0;
        if (x0 > x1) {
            Bx = x0;
            Ax = x1;
        }
        if (y0 > y1) {
            By = y0;
            Ay = y1;
        }
        //Slope eqations for x and y points
        double sx = x1 - x0;
        double sy = y1 - y0;
        //ratio= slope / matrix.length
        double yratio = sy / 51, xratio = sx / 51;
        if (sx == 0) {
            for (int i = Ay; i <= By; i++) {
                decide(matrix, x1, i);
            }
        } else if (sy == 0) {
            for (int i = Ax; i <= Bx; i++) {
                decide(matrix, i, y1);
            }
        } else {
            for (int i = 0; i < 51; i++) {
                decide(matrix, (int) (x0 + i * xratio), (int) (y0 + i * yratio));
            }
        }
    }

    public static void decide(boolean[][] matrix, int x, int y) {
        matrix[x][y] = true;
    }

    public static void clearMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = false;
            }
        }
    }

    public static void PrintMatrix(boolean[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix.length; x++) {
                if (matrix[y][x]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (x == 50) {
                    System.out.println("");
                }
            }
        }
    }
}