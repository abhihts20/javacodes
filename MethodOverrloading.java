package com.company;

public class MethodOverrloading{
    static void foo(){
        System.out.println("good morning bro");

    }
    static void foo(int a){
        System.out.println(" good morning bro " + a);

    }
static void foo(int a , int b){
    System.out.println("good morning bro" + a );
    System.out.println(" good morning bro" +b);
}
static int foo(int a ,int b, int c){
    System.out.println(" gooooood" + a + b +c);
    return c;
}
    public static void main(String[] args) {
        foo();
        foo(78);
        foo(90,89);
        foo(33,45,23);

    }
        }
