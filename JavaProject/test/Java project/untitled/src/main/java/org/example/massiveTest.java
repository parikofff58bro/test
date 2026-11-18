package org.example;

import java.util.Scanner;


public class massiveTest {
    public static void main(String[] args) {

       int[] mas = new int[8];
       mas[0] = 10;
        mas[1] = 11;
        mas[2] = 12;
        mas[3] = 13;
        mas[4] = 14;
        mas[5] = 15;
        mas[6] = 16;
        mas[7] = 16;
            //System.out.println(mas[0]);

        byte[] mas2 = {-20,21,-22,24};
for (int index = 0;index <mas2.length;index++){

           //System.out.println(mas2[index]);
        }


        System.out.println("Please enter number massive");
        Scanner scan = new Scanner(System.in);
        int  user_num = scan.nextInt();
        int[] mas3 = new int[user_num];
        for (int index = 0;index <user_num;index++){
            System.out.println("Please enter element massive #" + (index+1)+ ":");
            int  user_el = scan.nextInt();
            mas3[index] = user_el;

        }
        int max_num = 0;
        for (int index = 0;index <user_num;index++){
            if (mas3[index] > max_num)
                max_num = mas3[index];

        }
        System.out.println("maximum number is " +max_num);

        for (int index = 0;index <user_num;index++)
            System.out.println(mas3[index]);

//String [][] mas4 = new String[2][2];
        String [][] mas4 = {
                {"Саша","Люба"},
                {"Ярік","Ігор"}
        };

        System.out.println(mas4[0][1]);

/////для реквесту
    }




    }



