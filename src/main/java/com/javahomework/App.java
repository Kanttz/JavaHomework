package com.javahomework;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++++++++++++++++");
        System.out.println("multiplication table template");
        System.out.println("+++++++++++++++++++");
        System.out.print("Enter the desired multiplication template: ");
        int num = scanner.nextInt();

        System.out.println("+++++++++++++++++++");
        for (int i = 1; i <= 12; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
        System.out.println("+++++++++++++++++++");
    }
}
