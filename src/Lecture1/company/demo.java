package Lecture1.company;
// java is case sensitive .

public   class demo {
     public demo() // default constructor
    {
        a = 10;
        abc = "this is intialized by default constructor";

        System.out.println("demo object is created ");
        System.out.println(a + abc );

    }

    demo(int a , String abc ) // parameterized constructor  // a = 23 b = 23
    {
        System.out.println("demo object is created using parameterized constructor " + a + abc);
         // demo object is created using parameterized constructor 2323

    }
    int a ; // default access modifier .
    String abc ;


    protected  static String str; // we are declaring it as static so that the demo3 class in package demo can access
                                    // in case of protected access modifier .
}
