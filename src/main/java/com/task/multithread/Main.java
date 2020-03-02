package com.task.multithread;

public class Main {
    public static void main(String[] args) {
        TestObject testObject = new TestObject();
        ThreadExample threadExample = new ThreadExample(testObject);
        RunnableExample runnableExample = new RunnableExample(testObject);
        threadExample.start();
        runnableExample.run();
    }
}
