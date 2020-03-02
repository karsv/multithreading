package com.task.multithread;

public class ThreadExample extends Thread {
    private TestObject testObject;

    ThreadExample(TestObject testObject){
        this.testObject = testObject;
    }

    @Override
    public void run() {
        while(testObject.getCounter() < 100)
        System.out.println("Thread :" + testObject.incrCounter());
    }
}
