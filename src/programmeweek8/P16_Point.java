package programmeweek8;

/* You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 fields (instance variables) with name x and y of type int.
 The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 fields.
 Write the following methods (instance methods):
 * Method named getX without any parameters, it needs to return the value of x field.
 * Method named getY without any parameters, it needs to return the value of y field.
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * Method named distance without any parameters, it needs to return the distance between this
 Point and Point 0,0 as double.
 * Method named distance with two parameters x, y both of type int, it needs to return the distance
 between this Point and Point x,y as double.
 * Method named distance with parameter another of type Point, it needs to return the distance
 between this Point and another Point as double.
 How to find the distance between two points?
 To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 Where √ represents square root.
 TEST EXAMPLE
 → TEST CODE: Write the below code into the main method.
 Point first = new Point(6, 5);
 Point second = new Point(3, 1);
 System.out.println("distance(0,0)= " + first.distance());
 System.out.println("distance(second)= " + first.distance(second)); System.out.println("distance(2,2)= " + first.distance(2, 2));
 Point point = new Point();
 System.out.println("distance()= " + point.distance());
 OUTPUT
 distance(0,0)= 7.810249675906654
 distance(second)= 5.0
 distance(2,2)= 5.0
 distance()= 0.0
 NOTE: Use Math.sqrt to calculate the square root √.
 NOTE: Try to avoid duplicated code.
 NOTE: All methods should be defined as public NOT public static.
 NOTE: In total, you have to write 7 methods.
 */

import javafx.geometry.Point2D;

public class P16_Point {

    //Instance Variables
    int x, y;

    //Constructor 1 without parameters(no argument)
    public P16_Point() {
    }

    //Constructor 2 with 2 parameters
    public P16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Instance method 1 without parameters with return value of x.
    public int getX() {
        return x;
    }

    //Instance method 2 without parameters with return value of y.
    public int getY() {
        return y;
    }

    //Instance method 3 with 1 int parameter to set the value of x.
    public void setX(int x) {
        this.x = x;
    }

    //Instance method 4 with 1 parameter to set the value of y.
    public void setY(int y) {
        this.y = y;
    }

    //Instance method 5 without parameter and return distance between point & Point0,0 as double
    public double distance() {
        double dis = Math.sqrt((x*x)+(y*y));
        return dis;
    }

    //Instance method 6 with 2 parameters and return distance between point and Point x,y as double
    public double distance(int x, int y) {
        double dis = Math.sqrt((this.x - x)*(this.x-x)+(this.y-y)*(this.y - y));
        return dis;
    }

    //Instance method 7 with 1 parameter and return distance between point and another point as double
    public double distance(P16_Point second) {
        double dis = second.distance(this.x,this.y);
        return dis;
    }

    public static void main(String[] args) {
        P16_Point first = new P16_Point(6, 5);
        P16_Point second = new P16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        P16_Point point = new P16_Point();
        System.out.println("distance()= " + point.distance());
    }



}
