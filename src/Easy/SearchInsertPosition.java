package Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {


    }

    private static int searchInsert(int[] nums, int target) {

        int index = 0;
        boolean haveTarget = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                index = i;
                haveTarget = true;
                break;
            }
        }

        if (!haveTarget) {
            index = nums.length;
        }

        return index;
    }
}
