package javacore.l017.ternaryoperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        System.out.println("Введите 2 числа для сравнения:");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        /*
        if (a > b) {
            System.out.println(a + " больше " + b);
        } else {
            System.out.println(a + " меньше или равно " + b);
        }
        */

        System.out.println(a > b ? a + " больше " + b : a + " меньше или равно " + b);

    }
}