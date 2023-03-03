package com.javahomework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++++++++++++++++++");
        System.out.println("โปรแกรมคำนวณค่า BMI");
        System.out.println("+++++++++++++++++++");
        for (int i = 1; i <= 3; i++) {
            System.out.println("ครั้งที่ " + i);
            System.out.print("ป้อนน้ำหนัก (กก.) : ");
            double weight = input.nextDouble();
            System.out.print("ป้อนส่วนสูง (เซนติเมตร) : ");
            double height = input.nextDouble();
            System.out.println("+++++++++++++++++++");
            double bmi = weight / (height * height / 10000);
            System.out.println("ค่า BMI คือ : " + bmi);
            System.out.println("คำแนะนำ : " + getRecommendation(bmi));
            System.out.println("+++++++++++++++++++");
        }
    }

    static String getRecommendation(double bmi) {
        if (bmi < 18.5) {
            return "น้ำหนักน้อย / ผอม";
        } else if (bmi < 25) {
            return "ปกติ (สุขภาพดี)";
        } else if (bmi < 30) {
            return "ท้วม / โรคอ้วนระดับ 1";
        } else if (bmi < 35) {
            return "อ้วน / โรคอ้วนระดับ 2";
        } else if (bmi < 40) {
            return "อ้วนมาก / โรคอ้วนระดับ 3";
        } else {
            return "อ้วนมาก / โรคอ้วนระดับ 4";
        }
    }
}
