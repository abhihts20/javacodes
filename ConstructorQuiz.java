package com.company;
class employee2{
    int id;
    String name;
    double Salaryy;
//     public void salary1( String n, double Salaryy){
//         name =n;
//         Salaryy= 10000;
//     }
//    public void salary1( String n , int i){
//         id = i;
//         name =n;
//
//    }
    public employee2(){
        double Salaryy ;
    }
    public employee2(double salaryy){
         salaryy= 90000;
    }

}


public class ConstructorQuiz {
    public static void main(String[] args) {
       // employee2 abhi = new employee2();
        employee2 abhii = new employee2(900000);
        System.out.println(abhii.Salaryy);

    }
}
