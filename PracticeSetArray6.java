package com.company;

public class PracticeSetArray6 {
    public static void main(String[] args) {
        // create an array of 5 floats and calculate their sum
        float [] number= { 89.7f, 99.6f , 89.9f , 90.8f , 90.8f};
        float sum =0;
        for(float element:number){
            sum += element;
        }
        System.out.println(sum);
    }
}
