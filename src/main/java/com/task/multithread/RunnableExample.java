package com.task.multithread;

public class RunnableExample implements Runnable {
    private TestObject testObject;

    RunnableExample(TestObject testObject) {
        this.testObject = testObject;
    }

    @Override
    public void run() {
        while (testObject.getCounter() < 100) {
            System.out.println("Runnable :" + testObject.incrCounter());

        }
    }
}
