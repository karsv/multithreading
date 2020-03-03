package com.task.multithread;

public class RunnableExample implements Runnable {
    private static final int INCREAMENT_BORDER = 100;
    private IncreamentedClass testObject;

    RunnableExample(IncreamentedClass testObject) {
        this.testObject = testObject;
    }

    @Override
    public void run() {
        while (testObject.getCounter() < INCREAMENT_BORDER) {
            System.out.println("Runnable :" + testObject.incrCounter());

        }
    }
}
