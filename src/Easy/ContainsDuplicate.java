package Easy;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (numbers.contains(num)) {
                return false;
            } else {
                numbers.add(num);
            }
        }

        return true;
    }
}