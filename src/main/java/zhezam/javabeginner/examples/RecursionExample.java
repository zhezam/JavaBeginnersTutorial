package zhezam.javabeginner.examples;

/**
 * Created by Евгения on 02.11.2017.
 */
public final class RecursionExample {

    public static void run() {
        try {
            int result = fibonacciNumbers(0, 1, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int fibonacciNumbers(int x1, int x2, int limit) throws Exception {

        if (x1 > x2) {
            throw new Exception("fibonacciNumbers must have x1 <= x2");
        }

        int x3 = x1 + x2;

        if (limit < x3) {
            if (limit < x1) {
                return limit;
            }
            else if (limit < x2) {
                return x1;
            }
            else {
                return x2;
            }
        }
        else {
            System.out.printf(x3 + " ");

            if (limit == x3) {
                return x3;
            }
            else {
                return fibonacciNumbers(x2, x3, limit);
            }
        }
    }
}
