package javacore.l048.stringcomparison;

public class StringComparison {
    public static void main(String[] args) {

        String x = "12345";
        String y = "1" + x.substring(1);

        //Метод equals() - сравнивает содержимое строк (Совпадение символов)
        if (x.equals(y)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }
    }
}