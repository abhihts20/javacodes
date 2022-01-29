package com.company;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Abhilasha";
        //System.out.println(name);
        int value= name.length();
//        System.out.println(value);
//
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//
//         String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmedString = "   abhilasha  ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);
//        System.out.println(name.substring(4));
//        System.out.println(name.substring(1,4));
//        System.out.println(name.replace('a','p'));
//        System.out.println(name.replace("sha","ier"));
        System.out.println(name.startsWith("ab"));
        System.out.println(name.startsWith("Ab"));

        System.out.println(name.endsWith("ha"));
        System.out.println(name.endsWith("hj"));

        System.out.println(name.charAt(2));
        System.out.println(name.charAt(8));

        System.out.println(name.indexOf("abhi"));
        System.out.println(name.indexOf("a"));

        String modifiedname = "harryrry";
        System.out.println(modifiedname.indexOf("rry",4));

        System.out.println(name.lastIndexOf("ry"));
        System.out.println(modifiedname.indexOf("rry",4));

        System.out.println(name.equals("Abhilasha"));
        System.out.println(name.equalsIgnoreCase("abhilasha"));

        System.out.println("i am abhilasha \n double quote ");
        System.out.println("i am abhilasha  double quote");





    }
}
