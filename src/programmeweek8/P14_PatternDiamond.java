package programmeweek8;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */


public class P14_PatternDiamond {

    public static void main(String[] args) {
        P14_PatternDiamond diamond = new P14_PatternDiamond();
        diamond.pattern();

    }

    public void pattern() {
        int rows = 8;
        int space = rows - 1;
        int i = 1, j = 1;
        while (j <= rows) {//parent wile loop
            System.out.print("\n");//move to next line
            j = 1;
            while (j <= space) {//while loop for print space
                System.out.print(" ");//print space
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {//while loop for printing star
                System.out.print("*");//print star
                j++;
            }
            i++;
            space--;
        }
        i = rows - 1;
        space = 1;
        while (i >= 1) {//parent while loop
            System.out.print("\n");
            j = 1;
            while (j <= space) {
                System.out.print(" ");//print space
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");//print star
                j++;
            }
            i--;
            space++;
        }

    }


}


