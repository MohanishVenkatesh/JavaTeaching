package com.demo;

public class demo6 extends demoprivate{

    static demoprivate demoprivateobj = new demoprivate();
    static int b = 6 ; // this int b belongs to class demo6
    int c = demoprivateobj.b; //  this int b belongs to class demoprivate

    public static void main(String[] args) {
        System.out.println("this is the int b belonging to class demo6 " + b ); // demo6.b is same as b
        System.out.println("this is the int b belonging to class demoprivate " + demoprivateobj.b);

    }


}
