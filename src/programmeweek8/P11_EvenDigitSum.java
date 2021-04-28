package programmeweek8;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative NOTE: The method getEvenDigitSum should be defined as public static
 */


public class P11_EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }


    public static int getEvenDigitSum(int number) {
        int lastDigit = 0;
        int evenDigitSum = 0;

        if (number < 0) {
            return -1;
        }

        while (number != 0) {
            lastDigit = number % 10;  // find last digit
            if (lastDigit % 2 == 0) {  //check last digit even?
                evenDigitSum += lastDigit;  //add it to sum
            }
            number = number / 10; //remove last digit of number
        }
        return evenDigitSum;  //return sum value
    }


}




