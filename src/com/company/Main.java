package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        long age= 3_345_245_456l; // number too large
        float agr = 23.02f; // primitve data type for storing simple values
        Date now= new Date(); //refrence type for storing complex objects
        Point point= new Point(1,1);
        Point point2= point;
        point.x =3;
   System.out.println(point2);

   String x="!:"; // string comes from java.util which is already imported dont need to import
   String message= "c:\\windows\\";
        System.out.println(x.replace("!","blah"));
        System.out.println(message);


        String[] mans= {"haha", "blh"}; // Array is reference type thats why new keyword used
        Arrays.sort(mans);
        System.out.println(Arrays.toString(mans));

        int [][] name= {{1,2,3} , {2,3,4}};
        System.out.println(Arrays.deepToString(name));

        // CONSTANTS
        final int hair= 23; // final used as const in java

        // implicit casting
        // byte> short > int > long > float > double
        short v = 1;
        int z = v+2;
        System.out.println(z);

        // Explicit casting
        double hey = 2.2;
        int blah = (int)hey + 2;
        System.out.println(blah);
    }
}
