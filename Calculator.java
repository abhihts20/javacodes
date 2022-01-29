package com.company;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("taking input from the user of 5 subjects");
        System.out.println("subject1 marks");
        int a = sc.nextInt();
        System.out.println("subject2 marks");
        int b= sc.nextInt();
        System.out.println("subject3");
        int c = sc.nextInt();
        System.out.println("subject4 marks");
        int d = sc.nextInt();
        System.out.println("subject5 marks");
        int e = sc.nextInt();
        double per= ((double) (a+b+c+d+e)/500)*100;
        System.out.println(per);
    }
}
