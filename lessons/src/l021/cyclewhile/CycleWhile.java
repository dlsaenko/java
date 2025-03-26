package l021.cyclewhile;

import java.util.Scanner;

public class CycleWhile {
    public static void main(String[] args) {

        System.out.println("Введите число менее 50:");
        int myInt = new Scanner(System.in).nextInt();

        while (myInt <= 50) {
            if (myInt % 2 == 0) {
                System.out.println(myInt);
            }
            myInt++;
        }
    }
}