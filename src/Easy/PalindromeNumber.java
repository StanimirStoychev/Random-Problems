package Easy;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        String xAsString = String.valueOf(x);

        int secondHalfIndex = xAsString.length() / 2;
        int middle = secondHalfIndex;
        if (xAsString.length() % 2 == 0) {
            middle--;
        }


        for (int i = middle; i >= 0; i--) {
            if (xAsString.charAt(i) != xAsString.charAt(secondHalfIndex)) {
                return false;
            }
            secondHalfIndex++;
        }

        return true;
    }
}
