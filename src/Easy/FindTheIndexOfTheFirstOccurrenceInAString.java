package Easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println("First test: " + strStr(haystack, needle));

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        System.out.println("Second test: " + strStr(haystack2, needle2));

        String a = "a";
        String b = "a";

        System.out.println("Third test: " + strStr(a, b));

        String c = "abc";
        String d = "c";

        System.out.println("Fourth test: " + strStr(c, d));
    }

    private static int strStr(String haystack, String needle) {

        if (haystack.equals(needle)) {
            return 0;
        } else if (haystack.length() > 1) {
            int length = haystack.length() - needle.length();

            for (int i = 0; i <= length; i++) {
                String currentWord = haystack.substring(i, i + needle.length());

                if (currentWord.equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
