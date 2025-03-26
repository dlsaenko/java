package l022.cycledowhile;

import java.util.Scanner;

public class CycleDoWhile {
    public static void main(String[] args) {

        System.out.println("Введите число менее 50:");
        int myInt = new Scanner(System.in).nextInt();

        do { //Выполняется хотя бы один раз
            if (myInt % 2 == 0) {
                System.out.println(myInt);
            }
            myInt++;
        } while (myInt <= 50);
    }
}