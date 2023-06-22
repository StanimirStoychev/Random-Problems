package Easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {0};
        int em = 0;
        int[] nums4 = {1};
        int en = 1;

        merge(nums3, em, nums4, en);
        System.out.println(Arrays.toString(nums3));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p2 >= 0 ) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }

    }

}
