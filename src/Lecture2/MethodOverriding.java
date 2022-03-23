package Lecture2;

public class MethodOverriding {

        public static void main(String[] args)
        {

            Parent a ;
            a = new child1();
            a.print(); // output: this is child 1 class


            a = new child2();
            a.print();   // output: this is parent class

            a.print2();  // output : this is print 2 from the parent class




//            a.print2();
//
//            a = new child2();
//            a.print();


        }
    }

