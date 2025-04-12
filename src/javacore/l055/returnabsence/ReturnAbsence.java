package javacore.l055.returnabsence;

import java.util.Scanner;

public class ReturnAbsence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 любых числа для сравнения:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result;

        result = funcAdd(a, b);
        System.out.println(result);
    }

    private static String funcAdd(int a, int b) {
        if (a > b) {
            return a + " больше " + b;
        } else if (b > a) {
            return b + " больше " + a;
        }
        return "Числа равны";
    }
}