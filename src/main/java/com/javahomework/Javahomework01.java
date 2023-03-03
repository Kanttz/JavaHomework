package com.javahomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Javahomework01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double sumSquare = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = Double.parseDouble(br.readLine());
            sum += num;
            sumSquare += num * num;
        }

        double mean = sum / 5;
        double variance = (sumSquare / 5) - (mean * mean);
        double stdDev = Math.sqrt(variance);

        System.out.println("ค่าเฉลี่ย: " + mean);
        System.out.println("ค่าเบี่ยงเบนมาตรฐาน: " + stdDev);
    }
}
