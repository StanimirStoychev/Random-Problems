package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int startIndex = i + 1;
            for (int j = startIndex; j < prices.length; j++) {
                int subtract = prices[i] - prices[j];
                if (subtract < 0 && subtract < profit) {
                    profit = subtract;
                }
            }
        }

        return Math.abs(profit);
    }
}
