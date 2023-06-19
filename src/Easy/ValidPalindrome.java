package Easy;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

        String a = "a bab a cab";
        System.out.println(isPalindrome(a));
    }

    private static boolean isPalindrome(String s) {

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            while (low < high && !isValid(s.charAt(low))) {
                low++;
            }

            while (low < high && !isValid(s.charAt(high))) {
                high--;
            }

            if (low < high) {
                if (isCharDiff(s.charAt(low), s.charAt(high))) {
                    return false;
                }

                low++;
                high--;
            }
        }

        return true;
    }

    private static boolean isValid(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    private static boolean isCharDiff(char ch1, char ch2) {
        return Character.toLowerCase(ch1) != Character.toLowerCase(ch2);
    }
}
