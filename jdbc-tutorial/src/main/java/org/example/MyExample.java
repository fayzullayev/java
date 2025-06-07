package org.example;

public class MyExample implements AutoCloseable {


    public void greet() throws RuntimeException {
        System.out.println("Hello World");
        throw new RuntimeException("From greet");
    }

    @Override
    public void close() throws RuntimeException {
        System.out.println("Closing MyExample");
        throw new RuntimeException("From close");
    }
}
