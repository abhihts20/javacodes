package com.company;

public class Array2 {
    public static void main(String[] args) {
        //
       /* float[] marks ={98.5f , 89.0f, 89.9f,90.0f,99.0f};
        String[] students = {"harry" , "abhilasha","abhi","nishi","mansi"};
        System.out.println(students.length);
        System.out.println(students[1]);
        */
        int [] marks ={ 98, 90, 89,89, 90};
        System.out.println(marks.length);

        //displaying the array(naive way)
        System.out.println("printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

   // displaying array (for loops)
        System.out.println("printing using loop");
        for(int i = 0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        //displaying array using each loop
        System.out.println("printing using each loop");
        for(int element: marks)
        {
            System.out.println(element);
        }

        // quick quiz: displaying the array in reverse order(for loop)
        System.out.println("printing the array in reverse order");
        for(int i = marks.length-1;i>=0;i--) {
            System.out.println(marks[i]);

        }

    }
}

