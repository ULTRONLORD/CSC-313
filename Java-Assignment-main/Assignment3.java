/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meanmedian;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class MeanMedian {

    public static void main(String[] args) {
       double[] num = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
       
       double mean = calcMean(num);
       System.out.println("Mean = " + mean);
       
       double median = calcMedian(num);
       System.out.println("Median = " + median);
       
       double standardDev = calcStandardDev(num, mean);
       System.out.println(standardDev);
       
      
       
    }
    
    public static double calcMean(double[] num) {
        double sum = 0;
        for(double val: num) {
            sum += val;
        }
        return sum / num.length;
    }
    
    public static double calcMedian(double[] num) {
        double median;
         if(num.length % 2 == 0){
           median = (num[num.length/2 - 1] + num[num.length/2])/2;
       }else {
           median = num[num.length/2];
       }
       return median;
    }
    
    public static double calcStandardDev(double[] num, double mean) {
        double square = 0;
        for(double val: num) {
            square += Math.pow((val - mean), 2);
        }
        double dev = square/num.length;
        return Math.sqrt(dev);
    }
    
}
