package com.javahomework;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++++++++++++++++++");
        System.out.println("โปรแกรมคำนวณองศา");
        System.out.println("+++++++++++++++++++");
        System.out.print("ป้อนองศา Fahrenheit : ");
        int fahrenheit = input.nextInt();
        System.out.println("+++++++++++++++++++");
        System.out.println("องศา Celsius : " + ((fahrenheit - 32) * 5 / 9));
        System.out.println("+++++++++++++++++++");
    }
}
