package capdo_2;

import java.util.Scanner;

public class baiTap2 {
    public static void main(String[] args) {
        //Nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Gọi hàm và in kết quả
        boolean result = isPalindrome(input);
        System.out.println("Output: " + result);

        scanner.close();
    }

    // Hàm kiểm tra chuỗi đối xứng
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // So sánh ký tự tại hai đầu
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Nếu khác nhau thì không phải đối xứng
            }
            left++;
            right--;
        }
        return true; // Nếu duyệt hết mà không sai biệt
    }

}
