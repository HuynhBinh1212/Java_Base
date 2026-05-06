package capdo_1;

import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số nguyên dương
        System.out.print("Vui lòng nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int result = calculateSum(n);
        System.out.println("Tổng số chẵn nguyên dương "+ n+ " là : " + result);
    }

    // Hàm tính tổng các số nguyen duong
    public static int calculateSum(int n) {
        int sum = 0;
        // Bắt đầu từ 0, mỗi bước tăng thêm 2 đơn vị
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

}
