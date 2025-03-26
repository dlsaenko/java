package javacore.l013.clicalculator;

import java.util.Scanner;

public class CliCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Введите арифметическое действие (+,-,*,/,%)");
        char d = scanner.nextLine().charAt(0);

        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();

        switch (d) {
            case '+':
                System.out.println("Результат сложения - " + (a + b));
                break;
            case '-':
                System.out.println("Результат вычитания - " + (a - b));
                break;
            case '*':
                System.out.println("Результат умножения - " + (a * b));
                break;
            case '/':
                System.out.println("Результат деления - " + (a / b));
                break;
            case '%':
                System.out.println("Результат остатка от деления - " + (a % b));
                break;
        }
        scanner.close();
    }
}