/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentquestion5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Assignmentquestion5 {

    public static void main(String[] args) {
         int[][] numbers = new int[10][10];
       Scanner scanner = new Scanner(System.in);
       
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
           System.out.println("Enter element [" + i + "] [" + j + "]: ");
           numbers[i][j] = scanner.nextInt();
          }
       } 
       
       System.out.println("You entered");
       
       for(int[] row: numbers) {
           for (int col: row) {
           System.out.print(col + " ");
          }
           System.out.print("\n");
       }  
    }
}
