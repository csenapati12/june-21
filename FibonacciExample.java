package com.javacodeexamples.basic;
 
import java.util.Scanner;
 
public class FibonacciExample {
 
    public static void main(String[] args) {
        
        //get input number from console
        int number = getInputNumberFromConsole();
 
        //define first two numbers of the series
        int a = 0;
        int b = 1;
        
        //variable to hold the sum
        int sum = 0;
        
        System.out.println("Fibonacci series");
        System.out.print(a + " " + b + " ");
        
        for( int i = 2; i < number ; i++ ){
            
            //sum last two numbers
            sum = a + b;
            
            //change the numbers, shift them one place in the series
            a = b;
            b = sum;
            
            System.out.print(sum + " ");
        }
        
    }
    
    private static int getInputNumberFromConsole(){
        
        //create a scanner
        Scanner s = new Scanner(System.in);
        
        System.out.println("Input a number");
 
        //get the int value from the console
        int n = s.nextInt();
 
        //close the scanner
        s.close();
 
        return n;
    }
 
}