package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLengthOfCoordinatesRows = Integer.parseInt(scanner.nextLine());

        int[][] coordinates = new int[inputLengthOfCoordinatesRows][2];

        for (int row = 0; row < coordinates.length; row++) {
            int[] currentArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < currentArr.length; i++) {
                coordinates[row][i] = currentArr[i];
            }
        }

        System.out.println(checkStraightLine(coordinates));
    }

    private static boolean checkStraightLine(int[][] coordinates) {

        if(coordinates.length == 2)
            return true;
        int x0 = coordinates[0][0] , x1 = coordinates[1][0];
        int y0 = coordinates[0][1] , y1 = coordinates[1][1];
        int dx = x1 - x0 , dy = y1 - y0;
        for(int i = 2 ; i < coordinates.length ; i++)
        {
            int x = coordinates[i][0] , y = coordinates[i][1];
            if(dy * (x - x0) != dx * (y - y0))
                return false;
        }
        return true;
    }
}
