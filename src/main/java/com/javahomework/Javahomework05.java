package com.javahomework;

import java.util.Scanner;

public class Javahomework05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("โปรแกรม Food Fat");
        System.out.println("================================");

        System.out.print("ป้อนจำนวนอาหารที่จะตรวจสอบ : ");
        int num = scanner.nextInt();

        System.out.println("================================");
        for (int i = 1; i <= num; i++) {
            System.out.println("ลำดับที่ " + i);
            System.out.print("ป้อนชื่ออาหาร : ");
            String food = scanner.next();
            System.out.print("ป้อนแคลอรี่ : ");
            double cal = scanner.nextDouble();
            if (cal > 1000.57) {
                System.out.println("อาหาร" + food + "ทำให้อ้วน");
            } else {
                System.out.println("อาหาร" + food + "ไม่ทำให้อ้วน");
            }
        }
        System.out.println("================================");
    }
}
