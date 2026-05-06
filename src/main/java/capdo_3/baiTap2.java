package capdo_3;

import java.util.Scanner;

public class baiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = sc.nextLine();
        System.out.println("Output: " + longestPalindrome(s));
        sc.close();
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Trường hợp đối xứng lẻ (ví dụ: "aba")
            String p1 = expandAroundCenter(s, i, i);
            // Trường hợp đối xứng chẵn (ví dụ: "abba")
            String p2 = expandAroundCenter(s, i, i + 1);
            if (p1.length() > longest.length()) longest = p1;
            if (p2.length() > longest.length()) longest = p2;
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
