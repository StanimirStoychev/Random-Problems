package Easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {

        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int m = 2;
        System.out.println(canPlaceFlowers(flowerbed2, m));

        int[] flowerbed3 = {1, 0, 0, 0, 0, 1};
        int a = 2;
        System.out.println(canPlaceFlowers(flowerbed3, a));

        int[] flowerbed4 = {0};
        int b = 1;
        System.out.println(canPlaceFlowers(flowerbed4, b));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1 && flowerbed[0] == 1) {
            return false;
        } else if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {

            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }

            if (n == 0) {
                return true;
            }
        }

        return false;
    }
}
