package l024.infiniteloop;

public class InfiniteLoop {
    public static void main(String[] args) {

        int i = 0;
        for (; ; ) {
            System.out.println("Hello - " + i++);
        }
    }
}