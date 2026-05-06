package capdo_2;

import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        //Nhập thu nhập
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        double income = scanner.nextDouble();
        double tax = 0;

        // Tính thuế lũy tiến
        if (income > 80) {
            tax += (income - 80) * 0.35;
            income = 80;
        }
        if (income > 52) {
            tax += (income - 52) * 0.30;
            income = 52;
        }
        if (income > 32) {
            tax += (income - 32) * 0.25;
            income = 32;
        }
        if (income > 18) {
            tax += (income - 18) * 0.20;
            income = 18;
        }
        if (income > 10) {
            tax += (income - 10) * 0.15;
            income = 10;
        }
        if (income > 5) {
            tax += (income - 5) * 0.10;
            income = 5;
        }
        if (income > 0) {
            tax += income * 0.05;
        }

        //In thu nhập và đống scanner
        System.out.printf("Tổng số thuế phải trả là: %.2f triệu đồng%n", tax);
        scanner.close();
    }
}
