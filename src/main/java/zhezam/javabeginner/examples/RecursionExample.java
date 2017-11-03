package zhezam.javabeginner.examples;

/**
 * Created by Евгения on 02.11.2017.
 */
public class RecursionExample {

    public static void run() {

        fibonacciNumbers(0, 1, 100);
    }

    public static void fibonacciNumbers(int x1, int x2, int limit) {
        int x3 = x1 + x2;
        System.out.printf(x3 + " ");

        if (limit <= x3) {
            return;
        }
        else {
            fibonacciNumbers(x2, x3, limit);
        }
    }
}
