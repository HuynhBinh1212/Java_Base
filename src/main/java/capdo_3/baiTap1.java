package capdo_3;

import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Nhập mảng đã sắp xếp tăng dần:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Nhập target: ");
        int target = sc.nextInt();

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                // Đề bài yêu cầu index bắt đầu từ 1
                System.out.println("Output: [" + (left + 1) + "," + (right + 1) + "]");
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Không tìm thấy cặp số.");
        sc.close();
    }
}
