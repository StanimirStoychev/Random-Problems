package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "car";
        String t = "rac";

        System.out.println(isAnagram(s, t));

        String a = "car";
        String b = "cac";

        System.out.println(isAnagram(a, b));

        String c = "";
        String d = "a";

        System.out.println(isAnagram(c, d));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sToArray = s.toCharArray();
        char[] tToArray = t.toCharArray();

        Arrays.sort(sToArray);
        Arrays.sort(tToArray);

        for (int i = 0; i < s.length(); i++) {
            if (sToArray[i] != tToArray[i]) {
                return false;
            }
        }

        return true;
    }
}
