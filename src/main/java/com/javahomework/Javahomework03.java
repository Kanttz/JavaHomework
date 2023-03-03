package com.javahomework;

import java.util.Scanner;

public class Javahomework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("โปรแกรมสอบถามข้อมูลสายรถเมล์");
        System.out.println("================================");
        System.out.print("กรุณาป้อนสายรถเมล์ : ");
        int busNum = scanner.nextInt();

        System.out.println("================================");
        if (busNum == 57) {
            System.out.println("ไปสะพานปิ่นเกล้า");
        } else if (busNum == 3) {
            System.out.println("ไปสนามหลวง");
        } else if (busNum == 71) {
            System.out.println("ไปหัวลำโพง");
        } else if (busNum == 56) {
            System.out.println("ไปบางลำพู");
        } else if (busNum == 539) {
            System.out.println("ไปอนุสวรีย์ชัยฯ");
        } else {
            System.out.println("ไม่มีข้อมูล");
        }
        System.out.println("================================");
    }
}