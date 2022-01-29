package com.company;

public class VarArgs {
//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    static int sum(int a, int b, int c, int d)
//
//    {
//        return a + b + c + d;
//    }
 static int sum( int ...arr){
  //  available as  int[] arr;
     int result = 0;
     for(int a : arr){
         result += a;
     }
     return result;
 }
        public static void main(String[] args) {
            System.out.println(" nothing  " + sum());
        System.out.println(" the sum of 4 and 5 :" + sum(4 , 5));
        System.out.println(" the sum " + sum(1,2,3 ));
            System.out.println(" the sum is " + sum(1 , 2, 3, 4));
    }
}
