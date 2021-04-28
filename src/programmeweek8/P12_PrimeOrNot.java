package programmeweek8;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class P12_PrimeOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number :  ");
        int num = sc.nextInt();  //input to be taken from user
        P12_PrimeOrNot even = new P12_PrimeOrNot();  // object created for method calling
        even.prime(num);  // value taken from the user/scanner

    }

    public void prime(int number) {
        int i = 2;
        boolean isPrime = true;

        if (number <= 1)
            isPrime = false;

        while (i <= number / 2) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }

}
