package javacore.l049.stringcompareto;

public class StringCompareTo {
    public static void main(String[] args) {

        String x = "5";
        String y = "B5";

        //Метод compareTo() - Сравнение первых символов по тому, как они расположены в таблице символов ASCII
        if (x.compareTo(y) > 0) {
            System.out.println("Первое значение больше");
        } else {
            System.out.println("Второе значение больше");
        }
    }
}