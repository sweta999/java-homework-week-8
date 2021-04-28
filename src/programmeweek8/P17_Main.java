package programmeweek8;

/* PART- 4
4. Write a class with the name Main. The class needs to have a main method.
 TEST EXAMPLE
 → TEST CODE: Write below code in main method
 Carpet carpet = new Carpet(3.5);
 Floor floor = new Floor(2.75, 4.0);
 Calculator calculator = new Calculator(floor, carpet);
 System.out.println("total= " + calculator.getTotalCost());
 carpet = new Carpet(1.5);
 floor = new Floor(5.4, 4.5);
 calculator = new Calculator(floor, carpet);
 System.out.println("total= " + calculator.getTotalCost());
 → OUTPUT
 total= 38.5
 total= 36.45
 NOTE: All methods should be defined as public NOT public static.
 NOTE: In total, you have to write 4 classes.
 */

import java.lang.Math;

public class P17_Main {

    public static void main(String[] args) {
        P17_Carpet carpet = new P17_Carpet(3.5);
        P17_Floor floor = new P17_Floor(2.75, 4.0);
        P17_Calculator calculator = new P17_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new P17_Carpet(1.5);
        floor = new P17_Floor(5.4, 4.5);
        calculator = new P17_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());


    }


}
