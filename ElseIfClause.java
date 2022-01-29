package com.company;
import java.util.Scanner;

public class ElseIfClause {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int age =sc.nextInt();

//            if(age>78){
//                System.out.println("you are experienced");
//            }else if(age>90){
//            System.out.println("you are semi experienced");
//        }else if(age>99){
//            System.out.println("you are semi semi experienced");
//        }else{
//            System.out.println("you are not experienced");
//        }if(age>7){
//            System.out.println("thanks for understanding java");
//        }

//        switch(age){
//            case 18:
//                System.out.println("you are going to become an artist");
//                break;
//            case 14:
//                System.out.println("you are going to be singer");
//                break;
//            case 15:
//                System.out.println("you are a bad singer");
//                break;
//            default:
//                System.out.println("you are  out");
//        }
//        System.out.println("thanks for the java code");
        System.out.println("what is your age");
        switch (age) {
            case 18 -> System.out.println("you are going to become an artist");
            case 14 -> System.out.println("you are going to be singer");
            case 15 -> System.out.println("you are a bad singer");
            default -> System.out.println("you are  out");
        }
        System.out.println("thanks for the java code");
    }
}
