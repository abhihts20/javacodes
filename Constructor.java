package com.company;
class MyMainemployee{
    private int id;
    private String name;
    public MyMainemployee(){
       id= 45;
        name= "abhilasha";
    }
    public MyMainemployee(String myName , int myId){
        id = myId;
        name= myName;
    }
    public String getName(){return name;}
    public void setName(String n){name =n;}
    public void setId(int i){id =i;}
    public int getId(){return id;}

}
public class Constructor {
    public static void main(String[] args) {
        MyMainemployee abhi = new MyMainemployee();
       // MyMainemployee abhi = new MyMainemployee("aalu",99);
     //    System.out.println(abhi.getId());
        System.out.println(abhi.getId());
        System.out.println(abhi.getName());

    }
}
