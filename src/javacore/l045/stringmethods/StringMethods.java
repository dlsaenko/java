package javacore.l045.stringmethods;

public class StringMethods {
    public static void main(String[] args) {

        String myStr = "Hello";
        String myStr2 = "";
        String myStr3 = " \n\t";

        //Метод contains
        System.out.println(myStr.contains("e")); //Проверка на содержание элемента
        System.out.println(myStr.contains("E")); //Строгая чувствительность к регистру
        System.out.println(myStr.contains("е")); //Символ 'е' кириллицой

        //Метод indexOf()
        System.out.println(myStr.indexOf('o')); //Проверка индекса определенного элемета
        System.out.println(myStr.indexOf('l')); //2 элемента 'l' - выводит первый по счету
        System.out.println(myStr.lastIndexOf('l')); //Метод lastIndexOf() - начинает поиск с конца
        System.out.println(myStr.indexOf("Hello"));
        System.out.println(myStr.lastIndexOf("Hello"));

        //Метод startsWith()
        System.out.println(myStr.startsWith("He")); //С чего начинается строка
        System.out.println(myStr.endsWith("o"));    //На что заканчивается строка

        //Метод isEmpty()
        System.out.println(myStr.isEmpty()); //Является ли строка пустой
        System.out.println(myStr2.isEmpty());
        System.out.println(myStr3.isBlank()); //Проверка на наличие пустой строки и пробельных символов
    }
}