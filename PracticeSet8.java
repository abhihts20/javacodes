package com.company;
class employee1{
    int salary;
    String name;
    public int getSalary1(){
        return salary;

    }
    public String getName(){
        return  name;
    }
public void  setName(String n){
        name  = n;
    System.out.println(name);
    }}
    // problem 2
    class CellPhone {
        public void ringing(){
            System.out.println("ringing....");
        }

    public void vibrating(){
        System.out.println("vibrating....");
    }
   public void callFriend(){
       System.out.println("calling abhilasha");
   }
    }
class square{
    int side;
    public int area(){
        return side*side;
    }
public int parameter(){
        return 4*side;
}
}
public class PracticeSet8 {
    public static void main(String[] args) {
       /* employee1 harry =  new employee1();
        harry.name =(" abhilasha varshney");
        harry.salary = 78;
        harry.setName("abhi");

        //problem 2

   CellPhone asus = new CellPhone();
   asus.ringing();
   asus.vibrating();
   asus.callFriend();

    */
// problem 3
        // create a class square with a method to initialize its sides,calculating area, parameter
square sq = new square();
sq.side= 4;
        System.out.println(sq.area());
        System.out.println(sq.parameter());

    }
}
