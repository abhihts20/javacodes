package com.company;
class employee{
    int id;
    String name;
    int salary ;
    public void printDetails(){
        System.out.println(" my id is" +id);
        System.out.println("and my name is " + name);

    }
//    public int getSalary(){
//        return salary;
//    }
    public void salary(){
        System.out.println("salary is" + salary);
    }

}
public class Oops {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee emp = new employee();// instantiating a new employee object
      //setting attributes
        emp.name= " hi ";
        emp.id = 12;
        emp.salary = 90;
        //printing the attributes
//        System.out.println(emp.name);
//        System.out.println(emp.id);
       emp.printDetails();
       //you can create many objects bs ek baar template define krdo
       employee john = new employee();
       john.id = 4;
       john.name="john";
       john.salary= 78;
      john.printDetails();
      employee Salary = new employee();
//      int salary = john.getSalary();
//        System.out.println(salary);
          john.salary();

    }
}
