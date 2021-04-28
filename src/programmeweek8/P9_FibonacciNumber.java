package programmeweek8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class P9_FibonacciNumber {

    public static void main(String[] args) {

        int count = 9, num1 = 0, num2 = 1;
        System.out.println(" ");
        System.out.print("Fibonacci Series of " + count + " numbers:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }


}
