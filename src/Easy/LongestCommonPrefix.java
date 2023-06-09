package Easy;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input: strs = ["flower","flow","flight"]
        String[] input = scanner.nextLine().split("\\s+");

        System.out.println(longestCommonPrefix(input));
    }

    private static String longestCommonPrefix(String... input) {

        int size = input.length;

        if (size == 0)
            return "";

        if (size == 1)
            return input[0];

        Arrays.sort(input);

        int end = Math.min(input[0].length(), input[size-1].length());

        int i = 0;
        while (i < end && input[0].charAt(i) == input[size-1].charAt(i) )
            i++;

        return input[0].substring(0, i);
    }
}
