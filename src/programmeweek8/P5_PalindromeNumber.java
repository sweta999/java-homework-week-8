package programmeweek8;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
 * Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
 * to the original number. For example: 121, 12321, and 1001 etc.
 * Tip: Logic to check a palindrome number
 * Find the reverse of the given number. Store it in some variable say reverse. Compare the number with
 * reverse.
 * If both are the same then the number is a palindrome otherwise it is not
 */

public class P5_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        int sum = 0;
        int temp = number;
        int reverse = 0;

        while (number > 0) {
            System.out.println("input number ;" + number);
            reverse = number % 10;  //getting remainder
            System.out.println("reverse " + reverse);
            System.out.println("Digits" + reverse + "was add to sum" + (sum * 10));
            sum = (sum * 10) + reverse;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("Number is palindrome");
            return true;
        } else {
            System.out.println("Number is not palindrome");
            return false;
        }


    }

}


