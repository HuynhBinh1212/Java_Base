package capdo_1;

import java.util.Scanner;

public class baiTap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi bất kỳ: ");
        String userInput = scanner.nextLine();

        int count = countWords(userInput);

        System.out.println("Số từ trong chuỗi là: " + count);

        scanner.close();
    }

    // Hàm đếm số từ trong chuỗi
    public static int countWords(String input) {
        // Kiểm tra trường hợp chuỗi rỗng hoặc null
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        // 1. input.trim(): loại bỏ các khoảng trắng thừa ở đầu và cuối chuỗi
        // 2. split("\\s+"): chia chuỗi thành mảng dựa trên 1 hoặc nhiều dấu cách
        String[] words = input.trim().split("\\s+");

        return words.length;
    }
}
