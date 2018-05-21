package com.fretron;

/**
 * Created by anurag on 23-Apr-18.
 */
public class TestManager {

    public static void main(String ... args) throws InterruptedException {
        System.out.println("Hello kube!! I am from jenkins with thread");
        Thread.currentThread().join();
        System.out.println("Now done!!");
    }

    public static String reverse(String word)
    {
        String[] arr = word.split(" ");
        String result="";
        for (String w :arr)
        {
             result = w +" "+result;
        }
        System.out.println(result);
        return result;

    }
}
