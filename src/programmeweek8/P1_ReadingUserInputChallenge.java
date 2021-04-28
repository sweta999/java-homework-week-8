package programmeweek8;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * Use the nextInt() method to get the number and add it to the sum.
 * Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a (name : counter)as variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class P1_ReadingUserInputChallenge {

    public static void main(String[] args) {
        //int counter;  // variable for counting numbers
        //boolean value; // to check whether user entered int value

        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i = 0;
        int sum = 0;

        while (i < a.length) {
            System.out.print("Enter number #  " + (i + 1) + " : ");
            boolean isValid = sc.hasNextInt();
            if (isValid) {
                a[i] = sc.nextInt();
                sum = a[i] + sum;
            } else {
                System.out.println("Invalid Input");
            }
            i++;

        }
        System.out.println("Sum of array elements is : " + sum);
        sc.close();
    }
}


