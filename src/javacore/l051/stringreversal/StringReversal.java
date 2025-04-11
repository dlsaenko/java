package javacore.l051.stringreversal;

public class StringReversal {
    public static void main(String[] args) {

        String myString = "Hello World!";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            sb.insert(0, myString.charAt(i));
        }
        System.out.println(sb);

        //Альтернативный способ
        //for (int i = myString.length() - 1; i >= 0; i--) {
        //    sb.append(myString.charAt(i));
        //}
    }
}