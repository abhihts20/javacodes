package com.company;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("input from the users ");
        Scanner sc = new Scanner(System.in);
        System.out.println("number1");
        int a = sc.nextInt();
        System.out.println("number2");

        int b = sc.nextInt();
        int sum= a+b;
        System.out.println("sum");
        System.out.println(sum);
    }
}

