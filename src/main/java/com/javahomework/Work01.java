package com.javahomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ป้อนชื่อสินค้า : ");
        String name = reader.readLine();
        System.out.print("ป้อนราคาสินค้า : ");
        int price = Integer.parseInt(reader.readLine());
        System.out.println("+++++++++++++++++++");
        System.out.println("ชื่อสินค้า : " + name);
        System.out.println("ราคาสินค้า : " + price);
        System.out.println("ภาษี ณ ที่จ่าย : " + (price * 7 / 100));
        System.out.println("+++++++++++++++++++");
    }
}
