package com.javahomework;

import java.util.Scanner;

public class Javahomework07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++++++++++++++++++");
        System.out.println("โปรแกรมแม่สูตรคูณ");
        System.out.println("+++++++++++++++++++");
        System.out.print("ป้อนแม่สูตรคูณที่ต้องการ : ");
        int num = input.nextInt();
        System.out.println("+++++++++++++++++++");
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("+++++++++++++++++++");
    }
}