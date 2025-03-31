package javacore.l026.exitfrominfiniteloop;

import java.util.Random;
import java.util.Scanner;

public class ExitFromInfiniteLoop {
    public static void main(String[] args) {

        int x = new Random().nextInt(11);
        int y;

        while (true) {
            System.out.println("Введите число от 0 до 10: ");
            y = new Scanner(System.in).nextInt();

            if (x == y) {
                System.out.println("Вы угадали загаданное число - " + x);
                break; //Выход из бесконечного цикла
            } else if (y < x) {
                System.out.println("Загаданное число больше - " + y);
            } else {
                System.out.println("Загаданное число меньше - " + y);
            }
        }
    }
}