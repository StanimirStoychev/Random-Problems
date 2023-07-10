package Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "  Hello Java World  ";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] arr = str.split("\\s+");

        return arr[arr.length - 1].length();
    }
}
