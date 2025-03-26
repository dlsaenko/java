package javacore.l011.typeconverter;

public class TypeConverter {
    public static void main(String[] args) {
        int i = 1;
        String s = "123";
        System.out.println(i + s); //Конкатенация 1 + "1" = "11"

        int myInt = Integer.parseInt(s); //Преобразование String в int
        System.out.println(i + myInt);

        String myString = String.valueOf(i);
        System.out.println(s + " " + myString); //Преобразование int в String | Явное преобразование

        boolean myBoolean = true;
        System.out.println(myBoolean + myString); //boolean + String = String

        char myChar = s.charAt(2); //Преобразование String в char с индексом
        System.out.println(myChar);

        double myDouble = 1.25;
        String strDouble = String.valueOf(myDouble); //Явное преобразование double в String
        System.out.println(strDouble);

        String x = "1.525";
        double d = Double.parseDouble(x); //Преобразование String в double
        System.out.println(1 + d);
    }
}