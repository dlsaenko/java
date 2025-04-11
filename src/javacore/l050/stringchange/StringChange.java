package javacore.l050.stringchange;

public class StringChange {
    public static void main(String[] args) {

        StringBuilder myStr = new StringBuilder();

        System.out.println(myStr);
        myStr.append("World!");               //Вставляет с конца строки

        System.out.println(myStr);
        myStr.insert(0, "Hello "); //Вставляет с любого место по указаному индексу
        System.out.println(myStr);

        myStr.setLength(9);                   //Выводит с 0 по указанный индекс-1
        System.out.println(myStr);

        //myStr.delete(0, myStr.length());    //Удаляет полность или частично
        //System.out.println(myStr);

        myStr.deleteCharAt(0);          //Удаляет элемент по указанному индексу
        System.out.println(myStr);
    }
}