package com.javahomework;

import java.util.Scanner;

public class Javahomework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("โปรแกรม Multiple 800");
        System.out.println("================================");

        int num1, num2, result;
        do {
            System.out.print("ป้อนตัวเลข 1 : ");
            num1 = scanner.nextInt();
            System.out.print("ป้อนตัวเลข 2 : ");
            num2 = scanner.nextInt();
            result = num1 * num2;
            System.out.println("-------------------------------------------------");
            System.out.println("ผลคูณเป็น : " + result);
            System.out.println("-------------------------------------------------");
        } while (result < 800);
    }
}
