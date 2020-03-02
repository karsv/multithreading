package com.task.multithread;

public class TestObject {
    private int counter;

    public TestObject() {
        this.counter = 0;
    }

    public String incrCounter() {
        counter++;
        return "" + counter;
    }

    public int getCounter() {
        return counter;
    }
}
