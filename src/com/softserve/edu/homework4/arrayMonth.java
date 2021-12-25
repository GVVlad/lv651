package com.softserve.edu.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayMonth {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the month number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Days this month: " + daysMonth(num));
    }
    public static int daysMonth(int num) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[--num];
    }
}