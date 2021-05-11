package com.company;

import java.util.List;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("FirstThread");
        }
    }
}
