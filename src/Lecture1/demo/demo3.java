package Lecture1.demo;


import Lecture1.company.demo;


public class demo3 extends demo{ // demo3 is in demo package ; demo is in company

    demo newdemo = new demo();
    String d = newdemo.str; // in case of protected access modifier the variable in the demo class has to be static also .


}
