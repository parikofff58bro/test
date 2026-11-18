package org.example;

import java.util.Scanner;

public class circleTest {

    public static void main(String[] args) {

        for (int index = 0; index <= 20; index += 2) {
          if (index == 10) {
              break;
          }
           if (index % 5 == 0)
              continue;
        System.out.println("I see index is: " + index);
        }
          
      System.out.println("--------------");
       int  index = 100;
while (index >= 20) {
    System.out.println("I see index is: " + index);
    index -= 20; 
}

      System.out.println("--------------");

         int  indexT = 100;
         do {
             System.out.println("I see index is: " + indexT);
             indexT -= 20;
         }while (indexT<50 ) ;
    }

}

