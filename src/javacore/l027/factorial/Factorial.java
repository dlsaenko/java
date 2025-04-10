package javacore.l027.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int i = new Scanner(System.in).nextInt();
        int x = 1;

        for (int j = 1; j <= i; j++) {
            x *= j;
        }
        System.out.println("Факториал числа: " + i + " - " + x);
    }
}