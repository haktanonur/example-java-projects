package com.onurhaktan.thread4;

public class Main { // tek seferlik thread.
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor.");
                for (int i = 1; i<=10 ; i++){
                    System.out.println("Yazıyor : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        System.out.println("Main thread çalışıyor.");

    }
}
