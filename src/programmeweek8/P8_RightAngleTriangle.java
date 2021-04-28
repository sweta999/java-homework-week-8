package programmeweek8;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class P8_RightAngleTriangle {

    public static void main(String args[]) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@5");
            }
            System.out.println("");
        }


    }
}