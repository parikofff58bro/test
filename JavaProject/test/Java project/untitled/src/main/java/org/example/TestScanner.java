package org.example;
import java.util.Scanner;
class TestScanner {

//    public static void main(String[] args) {
//
//        Scanner testSc = new Scanner(System.in);
//        String textSc = testSc.nextLine();
//        System.out.println(textSc);
//
//        int textIntSc = testSc.nextInt();
//        System.out.println(textIntSc);
//    }

//     public static void main(String[] args) {
//
//         int a = 10,b = 5,c;
//
//         c = a+b;
//         System.out.println(c);
//     }

    public static void main(String[] args) {
        Scanner testSc = new Scanner(System.in);
        System.out.println("please enter num 1: ");
        int num1 = testSc.nextInt();
//
        System.out.println("please enter num 2: ");
        int num2 = testSc.nextInt();
//
       // int Rec = num1+num2;
        System.out.println("Summa:" + (num1+num2));
        System.out.println("Summa:" + (num1*num2));
        System.out.println("Summa:" + (num1/num2));
        System.out.println("Summa:" + (num1%num2));
    }
}

