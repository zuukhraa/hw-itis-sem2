package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        long r;
        r = (long)(100 + Math.random()*1001);


        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        firstThread.start();
        try {
            firstThread.join();
            firstThread.sleep(r);

        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        secondThread.start();
        try {
            secondThread.join();
            secondThread.sleep(r);

        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        thirdThread.start();
        try {
            thirdThread.join();
            thirdThread.sleep(r);

        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
