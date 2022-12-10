package com.onurhaktan.thread2;

public class Main {
    public static void main(String[] args) {
        /*Printer printer1 = new Printer("Printer 1 ");
        Printer printer2 = new Printer("Printer 2");
        printer1.start();
        printer2.start();*/
        System.out.println("Main thread çalışıyor.");

        Thread printer1 = new Thread(new Printer("Printer1"));
        Thread printer2 = new Thread(new Printer("Printer2"));

        printer1.start();
        printer2.start();
    }
}
