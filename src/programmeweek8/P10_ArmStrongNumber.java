package programmeweek8;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class P10_ArmStrongNumber {

    public static void main(String[] args) {
        P10_ArmStrongNumber sequence = new P10_ArmStrongNumber();
        sequence.Sequence();

    }

    public void Sequence() {

        int num = 153, number, temp, total = 0;

        number = num;
        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }

        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");


    }


}