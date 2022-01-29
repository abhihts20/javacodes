package com.company;

public class PracticeSet3 {
    public static void main(String[] args) {
        //write a java program to convert a string to lowercase
        String name = "Abhilasha Varshney";
        System.out.println(name.toLowerCase());
        // write a java program and replace the space by underscore
//        String text = "to Lower Case";
//        System.out.println(text.replace(" ","_"));
           String text = "to upper case;";
            text = text.replace(" ","_");
        System.out.println(text);


        // write a java program to fill a letter template which looks like below;
        String letter = "dear <|name|>, thanks a lot";
        System.out.println(letter.replace("<|name|>","abhilasha"));

        // write a java program to detect double and triple spaces in a string
        String detect = "this string contains  double and  triple spaces  ";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   "));

        // write a program to format the following letter using escape sequence character

        String myLetter = "dear abhilasha ,\n\t thanks a lot.\n\tbye";
        System.out.println(myLetter);

    }
}
