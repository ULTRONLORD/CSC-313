/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assigmentquestion2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Assigmentquestion2 {

    public static void main(String[] args) {
        /* Single loop */
        String a = "* * * * = = = = = = =";
        String b = "=  =  = = = = = = = =";
        for(int row = 1; row < 7; row++) {
            if(row >= 1 && row <= 3) {
                System.out.println(a);
            }else {
                System.out.println(b);
            }
        }
        
        
        /* Nested Loop */
        System.out.println("Enter an asterisk:");
        Scanner input1 = new Scanner(System.in);
        String val1 = input1.nextLine();
        System.out.println("Enter an equal to sign:");
        Scanner input2 = new Scanner(System.in);
        String val2 = input2.nextLine();
        
        for(int row = 1; row <= 6; row++) {
            for (int col = 1; col <= 11; col++) {
                if((row >= 1 && row <= 3) && (col >= 1 && col <= 4)) {
                System.out.print(val1 + " ");
            } else {
                    System.out.print(val2 + " ");
               }
            }
            System.out.print("\n");
        }
    }
}
