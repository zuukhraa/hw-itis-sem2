package com.company;

public class ThirdThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThirdThread");
        }
    }
}
