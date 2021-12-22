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

        Runnable runnable1 = () ->{
            System.out.println("second runnable java 2 ");
        };

        new Thread(runnable1).start();


        new Thread(()-> System.out.println("third runnable 3") ).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnale new tread something");
            }
        });

        Runnable runnable2  = ()->{
            System.out.println("pring double 1 ");
            System.out.println("print double 2");

        };
    }
}