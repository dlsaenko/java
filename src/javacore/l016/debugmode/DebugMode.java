// В рамках этого урока, изучался режим отладки (Debug Mode)
package javacore.l016.debugmode;

import java.util.Scanner;

public class DebugMode {
    public static void main(String[] args) {

        System.out.println("Введите 2 числа для сравнения:");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        if (a > b) {
            System.out.println(a + " больше " + b);
        } else if (a < b) {
            System.out.println(a + " меньше " + b);
        } else {
            System.out.println(a + " равно " + b);
        }
    }
}