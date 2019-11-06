package Hw3;

import java.util.Scanner;

public class E52 {

public static void main(String[] args) {
 
 Scanner in = new Scanner(System.in);
 
 
 System.out.println("Please enter a number: ");
 float number = in.nextFloat();
 
 if(number < 0 ) {
  
  if(Math.abs(number) < 0) {
   // System.out.println("The number  is negative and small");
  }//nested if
  
  else if (Math.abs(number) > 1000000) {
   //System.out.print(" and Large");
  }
 }//if 
 System.out.print("The number  is negative and small");
 System.out.println(" and Large");

}// main

}// class