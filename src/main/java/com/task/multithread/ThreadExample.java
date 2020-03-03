package com.task.multithread;

public class ThreadExample extends Thread {
    private static final int INCREAMENT_BORDER = 100;
    private IncreamentedClass testObject;

    ThreadExample(IncreamentedClass testObject) {
        this.testObject = testObject;
    }

    @Override
    public void run() {
        while (testObject.getCounter() < INCREAMENT_BORDER) {
            System.out.println("Thread :" + testObject.incrCounter());
        }
    }
}
