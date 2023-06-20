package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int size = removeDuplicates(nums);

        System.out.println(size);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static int removeDuplicates(int[] nums) {
        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[uniqueCount] = nums[i];
                uniqueCount += 1;
            }
        }

        return uniqueCount;
    }
}
