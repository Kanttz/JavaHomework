package com.javahomework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Javahomework02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=================================");
        System.out.println("โปรแกรมคิดคำนวณค่าไฟฟ้า");
        System.out.println("=================================");
        System.out.print("ใส่บ้านเลขที่: ");
        String homeNum = reader.readLine();
        System.out.print("ใส่ชื่อ: ");
        String homeName = reader.readLine();
        System.out.print("ใส่หน่วยไฟฟ้า: ");
        int unitElec = Integer.parseInt(reader.readLine());
        System.out.println("=================================");

        double elecRate;
        if (unitElec > 50) {
            elecRate = 8.50;
        } else if (unitElec > 30) {
            elecRate = 7.50;
        } else {
            elecRate = 6.50;
        }
        double payElectric = elecRate * unitElec;

        System.out.println("ค่าไฟฟ้าสำหรับคุณ " + homeName + " (บ้านเลขที่ " + homeNum + ")");
        System.out.println("หน่วยไฟฟ้าที่ใช้: " + unitElec);
        System.out.println("เรทค่าไฟฟ้า: " + elecRate + " บาท");
        System.out.println("ยอดรวมค่าไฟฟ้า: " + payElectric + " บาท");
        System.out.println("=================================");
    }
}
