package com.company;

public class SecondThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("SecondThread");
        }
    }
}
