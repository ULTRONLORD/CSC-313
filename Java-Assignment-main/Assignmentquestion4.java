/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentquestion4;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Assignmentquestion4 {

    public static void main(String[] args) {
       int[] numbers = new int[10];
       Scanner scanner = new Scanner(System.in);
       
       for (int i = 0; i < numbers.length; i++) {
           System.out.println("Enter element [" + i + "]: ");
           numbers[i] = scanner.nextInt();
       }
       
       System.out.println("You entered");
       
       for(int val: numbers) {
           System.out.print(val + " ");
       }
    }
}
