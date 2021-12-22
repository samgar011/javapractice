package com.learningJava.lamdas;

public class RunnableLamda {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("first runnable java 1");
            }
        };
        new Thread(runnable).start();
    }
}
