package com.task.multithread;

public class IncreamentedClass {
    private int counter;

    public String incrCounter() {
        counter++;
        return "" + counter;
    }

    public int getCounter() {
        return counter;
    }
}
