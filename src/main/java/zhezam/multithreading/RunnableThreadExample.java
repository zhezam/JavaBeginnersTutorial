package zhezam.multithreading;

/**
 * Created by Евгения on 09.11.2017.
 */
public final class RunnableThreadExample {

    private static int increment;

    private static synchronized void increment(String threadName) {
        increment++;
        System.out.println(threadName + " increments " + increment);
    }

    private static class MyRunnable implements Runnable {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                increment(this.getName());
            }
        }
    }

    public static void run() {

        MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(runnable1);
        runnable1.setName(thread1.getName());

        MyRunnable runnable2 = new MyRunnable();
        Thread thread2 = new Thread(runnable2);
        runnable2.setName(thread2.getName());


        thread1.start();
        thread2.start();
    }
}
