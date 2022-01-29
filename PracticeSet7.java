package com.company;

public class PracticeSet7 {

// write a java method to print multiplication table of a given number n
//        static int table(int n) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(n * i);
//                return n*i;
//            }
//
//          return n;
//        }
//
//    public static void main(String[] args) {
//
//    static void table1(int n){
//        for(int i=1; i <=10; i++ ){
//            System.out.println(  n +"*"+ i +"="+ n*i);
//            //System.out.format("%d X %d = %d\n",n,i,n*i);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("the table is");
//        table1(10);
//    }


//  static void star(int n){
//      for(int i = 1; i<= n;i++){
//          for(int j =1 ; j<=i; j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//  }
//
//    public static void main(String[] args) {
//        star(4);
//    }
    // sum(n) = sum(n-1) +n
    //sum(3) = 3+ sum(2)
    // sum(3) = 3+2+sum(1)
    // sum(3) = 3+2+1
//    static int sum(int n ){
//        if (n==1){
//            return 1;
//        }
//        else{
//            return n+ sum(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(5));
   // }
//    static void reverse(int n){
//        for(int i =n ; i>=1; i--){
//            for(int j =i;j>=1; j--){
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        reverse(4);
//    }
    //write s function to print nth term of fibonacci series using recursion
    //static int fib(int n) {
        //if (n == 1) {
         //   return 0;
       // } else
       // if(n==2){
//            return 1;
//        }else
//        {
//            return fib(n-1) +fib(n-2);
//        }
//        // if (n==1 || n==0)
//        // return n-1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fib(4));
//    }
    // write a function to find average of a set of numbers passed as arguments
//    static void average(int ...arr){
//        double sum = 0;
//        for(int i =0; i<arr.length;i++){
//            sum+= arr[i];
//
//        }
//        System.out.println(sum/arr.length);
//    }
//
//    public static void main(String[] args) {
//        average(2,3);
//    }
  //  static void pattern_rec(int n) {

//        if(n>0){
//            pattern_rec(n-1);
//         for(int i=1 ;i<=n; i++){
//             System.out.print("*");
//         }
//            System.out.println();
//        }
//
//    }
//// pattern_rec(3)
// // pattern_rec(2)+ 3 times star and new line
// //pattern_rec(1) + 2 times star and new line + 3 times star and new line
////pattern_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
//    public static void main(String[] args) {
//        pattern_rec(4);
//    }

    static void convert(float n){
        System.out.println((0 *9/5)+32);
    }

    public static void main(String[] args) {
        convert(0);
    }
    }
