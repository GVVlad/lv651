package com.software.edu.hw13.homeWork1;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Working Second Thread");

        }
    }
}
