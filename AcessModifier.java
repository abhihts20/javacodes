package com.company;
class MyEmployee{
  private    int id;
   private   String name;

      public String getName(){
          return name;
      }
      public  void setName(String n){
         this. name =n;
      }
      public void setId(int i){
         this. id = i;
      }
      public int getId(){
          return id;
      }
}
public class AcessModifier {
    public static void main(String[] args) {
MyEmployee abhi = new MyEmployee();
abhi.setId(9);
abhi.setName("abhiiii");
        System.out.println(abhi.getName());
        System.out.println(abhi.getId());
    }
}
