package Easy;

public class IsSubsequence {
    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

        String a = "b";
        String b = "abc";
        System.out.println(isSubsequence(a, b));
    }

    private static boolean isSubsequence(String s, String t) {
        int index = 0;

        for (int i = 0; i < t.length(); i++) {
            if (index == s.length()) {
                return true;
            }
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
        }

        return index == s.length();
    }
}
