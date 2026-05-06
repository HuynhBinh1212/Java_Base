package capdo_1;

import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
            // Nhập chuỗi từ bàn phím
            Scanner sc = new Scanner(System.in);
            System.out.println("Input: ");
            String input = sc.nextLine();
            // Tìm và thay thế các ký tự nguyên âm trong chuỗi
            String result = input.replaceAll("[aeiouAEIOU]", "");
            //In chuỗi
            System.out.println("Chuỗi gốc: " + input);
            System.out.println("Output: " + result);

            // Đóng scanner để giải phóng tài nguyên
            sc.close();
    }
}
