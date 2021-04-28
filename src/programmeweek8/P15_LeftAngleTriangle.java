package programmeweek8;

/**
 * Display left angle triangle of * using nested for loops
 */


public class P15_LeftAngleTriangle {

    public static void main(String[] args) {
        P15_LeftAngleTriangle leftangle = new P15_LeftAngleTriangle();
        leftangle.leftangletriangle();
    }

    public void leftangletriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}




