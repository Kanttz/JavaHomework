package com.javahomework;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++++++++++++++++++");
        System.out.println("โปรแกรมเช่ารถแท็กซี่");
        System.out.println("+++++++++++++++++++");
        System.out.print("ป้อนชื่อ : ");
        String name = input.nextLine();
        System.out.print("ป้อนทะเบียนรถ : ");
        String car = input.nextLine();
        System.out.print("ป้อนจำนวนชั่วโมงที่เช่า : ");
        int hour = input.nextInt();
        System.out.println("+++++++++++++++++++");
        System.out.println("ชื่อ : " + name);
        System.out.println("ทะเบียนรถ : " + car);
        System.out.println("จำนวนชั่วโมงที่เช่า : " + hour);
        System.out.println("ค่าเช่าคิดเป็น : " + (hour <= 24 ? hour * 25.50 : hour * 23.50) + " บาท");
        System.out.println("+++++++++++++++++++");
    }
}