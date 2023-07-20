package Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] arr = {8, 9, 9, 9};

        int[] arr2 = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
                1, 1, 7, 4, 0, 0, 6};

        int[] arr3 = {9};

        System.out.println(Arrays.toString(plusOne(arr)));
    }

    private static int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0) {
            if (digits[i] == 9) {
                if (i >= 1) {
                    digits[i--] = 0;
                    if (digits[i] != 9) {
                        digits[i] += 1;
                        break;
                    }
                } else {
                    digits = new int[digits.length + 1];
                    digits[0] = 1;
                    break;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }

        return digits;
    }
}
