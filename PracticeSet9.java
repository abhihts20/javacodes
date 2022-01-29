package com.company;

import java.awt.*;
class Rectange{
    int breadth,height;

    public Rectange(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

//class cylinder {
//    private int height;
//    private int radius;
//
//    public cylinder() {
//        height = 12;
//        radius = 24;
//    }
//
//    public double surfaceArea() {
//        return 2 * 3.142 * radius * radius + 2 * 3.14 * radius * height;
//    }
//
//    public double volume() {
//        return 3.142 * radius * radius * height;
//    }
//}

//class Rectangle {
//     int length;
//    int breadth;
//
////    public Rectangle() {
////        this.length = 4;
////        this.breadth = 5;
////    }
//
//    public Rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getBreadth() {
//        return breadth;
//    }
//
//
////     public int getHeight() {return height;}
////     public void setHeight(int height) {this.height = height;}
////     public int getRadius() {return radius;}
////     public void setRadius(int radius) {this.radius = radius;}
//}

public class PracticeSet9 {
    // create a class cylinder and use getters and setters to set the its radius and height.
    public static void main(String[] args) {
//        Rectangle ra = new Rectangle()
        //  cylinder myCylinder = new cylinder();
        // System.out.println(myCylinder.getHeight());
        // System.out.println(myCylinder.getRadius());
        //System.out.println(myCylinder.surfaceArea());
        //System.out.println(myCylinder.volume());
//        Rectangle r = new Rectangle(5,6);
//        System.out.println(r.getBreadth());
        Rectange r = new Rectange(5,6);
        System.out.println(r.getBreadth());
    }


}

