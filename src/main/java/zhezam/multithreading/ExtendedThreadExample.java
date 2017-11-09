package zhezam.multithreading;

import java.util.Scanner;

class MyThread extends Thread {
    public volatile boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println(this.getName() + " is running");
            mySleep();
        }
    }

    public void shutdown(){
        System.out.println(this.getName() + " shutdown");
        isRunning = false;
    }

    private void mySleep() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " " + e.toString());
        }
    }
}

public final class ExtendedThreadExample {
    public static void run() {
        MyThread thread1 = new MyThread();
        thread1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.hasNextLine();

        thread1.shutdown();
    }
}
