package com.company;

public class MethodsNote {
//    static int logic(int x, int y) {
//int z;
//if (x>y){
//    z=x+y;
//}
//else
//{z= (x+y)*5;
//    }return z;
//
//}
//
//    public static void main(String[] args) {
//        int a = 6;
//        int b= 9;
//        int c;
//        c= logic(a,b);
//        int a1 = 9;
//        int b1 = 7;
//        int c1;
//        c1 = logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);



         int logic(int x, int y) {
            int z;
            if (x>y){
                z=x+y;
            }
            else
            {z= (x+y)*5;
            }return z;

        }

       public   static void main(String[] args) {
            int a = 6;
            int b= 9;
            int c;
            MethodsNote obj = new MethodsNote();
            c= obj.logic(a,b);
            int a1 = 9;
            int b1 = 7;
            int c1;
            c1 = obj.logic(a1,b1);
            System.out.println(c);
            System.out.println(c1);

    }


}