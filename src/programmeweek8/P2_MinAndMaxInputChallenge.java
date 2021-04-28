package programmeweek8;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

//Note : When I enter highest number, it is not taking the number (lying in #1) as highest number.

import java.util.Scanner;

public class P2_MinAndMaxInputChallenge {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        // Minimum And Maximum
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while (true) {
            int cnt = count++;
            System.out.print("Enter Number #" + (cnt + 1) + ": ");
            boolean isValid = input.hasNextInt();
            if (isValid) {
                int num = input.nextInt();
               /* if (bugSolved){
                   bugSolved = false;
                   min = num;
                   max = num;
               }  # Just remove this condition and
               	boolean (bugSolved) at the top, if you use
               	int min = Integer.MAX_VALUE and int max =
                Integer.MIN_VALUE */
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid input..");
                break;
            }
            input.nextLine();
        }
        System.out.println("Min Number : " + min);
        System.out.println("Max Number : " + max);


    }
}