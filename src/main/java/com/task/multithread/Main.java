package com.task.multithread;

public class Main {
    public static void main(String[] args) {
        IncreamentedClass testObject = new IncreamentedClass();
        Thread threadExample = new ThreadExample(testObject);
        Thread runnableExample = new Thread(new RunnableExample(testObject));
        threadExample.start();
        runnableExample.start();
    }
}
