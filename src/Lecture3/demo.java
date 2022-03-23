package Lecture3;

import java.util.Scanner;

import static javafx.application.Platform.exit;

public class demo {
    public static void main(String [] args) {
        /*

           Primitive Datatype .
         */
        boolean a = true; // true or false
        char b = '$';//for a single character
        //8 bits -> 1 byte. // byte here refers to computer memory .
        byte c = 24;// 8 bits integer
        short k = 2234;// 16 bits integer
        int e = 2343; //32 bits integer
        long i = 2234234234234233423L; // 64 bits integer . we have to specific L in the end
        float q = 23.3f; // 32 bits for float we have to specific f in the end of the decimal .
        double p = 234.3d;// 64 bits . for double we have to specific d in the end of the decimal.


        Scanner scanner = new Scanner(System.in);

//
        // for , while , do while

        String end;
        do {
            System.out.println("Enter a number :  ");
            int input = scanner.nextInt(); // we can input int datatype
            if (input == 100)  // == is equal , != is not equal to
            {
                System.out.println(input + " this is running inside the if  condition  ");

            } else {
                System.out.println(input + " this is running in the else condition");
            }
            System.out.println("Do you want to continue?");
            end = scanner.next();

        } while (end.equals("yes")); // continue the do loop until end String is equal to "yes"

//        scanner.nextLong();// we can input long datatype;
//        scanner.nextFloat();// we can input float datatype;
//        scanner.next(); // This is to input string . this will take input until a escape sequence character .example . this
//        scanner.nextLine();// This is to input string. example .{ this is  a system . }


    }
}
