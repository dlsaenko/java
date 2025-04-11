package javacore.l044.stringmethods;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String myStr = "Hello";

        System.out.println(myStr.length());                         //Метод length()
        System.out.println(myStr.charAt(0));                        //Метод charAt(<индекс>)
        System.out.println(Arrays.toString(myStr.toCharArray()));   //Методы: Array.toString + toCharArray()
    }
}