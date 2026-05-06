package capdo_1;

import java.util.Scanner;

public class baiTap5 {
    public static void main(String[] args) {
        //Nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String userInput = scanner.nextLine();

        //Hàm xử lý lấy ký tự đầu tiên
        String output = getFirstLetters(userInput);

        //In output và đóng scanner
        System.out.println("Output: " + output);
        scanner.close();
    }
    // Hàm lấy chữ cái đầu của mỗi từ
    public static String getFirstLetters(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // Tách chuỗi thành mảng các từ, dùng regex "\\s+" để xử lý trường hợp có nhiều dấu cách
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Lấy ký tự đầu tiên, chuyển sang chữ hoa và thêm vào kết quả
            char firstChar = Character.toUpperCase(word.charAt(0));
            result.append(firstChar).append(" ");
        }

        // Trả về kết quả sau khi loại bỏ dấu cách thừa ở cuối
        return result.toString().trim();
    }
}
