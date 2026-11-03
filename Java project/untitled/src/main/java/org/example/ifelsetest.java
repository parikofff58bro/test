package org.example;

import java.util.Scanner;

 class ifelsetest {


     public static void main(String[] args) {
         Scanner testSc = new Scanner(System.in);
         System.out.println("please enter num 1: ");
         int num1 = testSc.nextInt();

         if (num1 == 15) {
             System.out.println("please enter num 2: ");
             int num2 = testSc.nextInt();
             int rec = num1 + num2;

             //boolean newSumma;
             //newSumma = rec!== 20;
             if (rec != 20)
                 System.out.println("Oh no my summa is:" + rec);
             else
                 System.out.println("Vau my summa is:" + rec);

         }

     }
 }
