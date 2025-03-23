package l010.reader;

import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свое имя");
        String myString = scanner.nextLine();
        System.out.println("Привет " + myString + "!");

        System.out.println("Введите любое число:");
        int myInt = scanner.nextInt();
        System.out.println("Вы ввели число: " + myInt);

        scanner.nextLine();

        System.out.println("Введите любое слово");
        char myChar = scanner.nextLine().charAt(0);
        System.out.println("Первая буква Вашего слова: " + myChar);

        scanner.close();
    }
}