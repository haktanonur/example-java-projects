package com.onurhaktan.thread3;

public class Main {
    public static void main(String[] args) {
        // ANONİM THREAD OLUŞTURMA.
        Thread printer1 = new Thread(new Runnable() {
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
        });
        System.out.println("Main thread çalışıyor.");
        printer1.start();
    }
}
