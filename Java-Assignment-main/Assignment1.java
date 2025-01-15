/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Assignment {

    public static void main(String[] args) {
        /* Single loop */
          String map = "****====****";
       for(int row = 1; row < 5; row++) {
           System.out.println(map);
       }
       
        /* Nested loop */
        System.out.println("Enter an asterisk:");
        Scanner input1 = new Scanner(System.in);
        String val1 = input1.nextLine();
        System.out.println("Enter an equal to sign:");
        Scanner input2 = new Scanner(System.in);
        String val2 = input2.nextLine();
        
        for(int row = 1; row <= 4; row++) {
            for(int col = 1; col <= 12; col++) {
                if(col < 5 || col >= 9) {
                    System.out.print(val1);
                } else {
                    System.out.print(val2);
                }
            }
            System.out.print("\n");
        }
    }
}
