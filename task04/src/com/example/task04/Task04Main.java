package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("test");
        Logger logger2 = Logger.getLogger("test");
        System.out.println(logger1 == logger2);
    }
}
