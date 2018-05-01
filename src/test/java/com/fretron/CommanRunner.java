package com.fretron;


public class CommanRunner {

    public static void main(String[] args)
    {
        System.out.println("ON CommanRunner");

        TestCase1 testCase1 = new TestCase1();
        if (testCase1.start())
        {
            System.out.print("Test case is passed");
        }
        else  System.out.print("Test case is faild");


    }
}
