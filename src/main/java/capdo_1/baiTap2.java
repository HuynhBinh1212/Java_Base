package capdo_1;

import java.util.Scanner;

public class baiTap2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số lượng phần tử của mảng
        System.out.print("Input ");
        int n = scanner.nextInt();

        // 2. Khởi tạo mảng với kích thước n
        int[] arr = new int[n];

        // 3. Sử dụng vòng lặp để nhập từng phần tử
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // 4. In ra mảng để kiểm tra (tùy chọn)
        System.out.print("Mảng bạn vừa nhập là: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int result = findSecondLargest(arr);

        if (result == Integer.MIN_VALUE) {
            System.out.println("\nInteger.MIN_VALUE");
        } else {
            System.out.println("\nGiá trị lớn thứ hai là: " + result);
        }
        // Đóng scanner để giải phóng tài nguyên
        scanner.close();
    }
    public static int findSecondLargest(int[] arr) {
        // Yêu cầu: Nếu mảng ít hơn 2 phần tử, trả về Integer.MIN_VALUE
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                // Nếu tìm thấy số lớn nhất mới, cập nhật cả first và second
                second = first;
                first = num;
            } else if (num > second && num != first) {
                // Nếu số hiện tại lớn hơn second nhưng không bằng first, cập nhật second
                second = num;
            }
        }

        return second;
    }
}
