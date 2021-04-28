package programmeweek8;

/* 2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
*  variable) with name height of type double.
*  The class needs to have one constructor with two parameters radius and height both of type double.
*  It needs to call the parent constructor and initialize a height field.
*  In case the height parameter is less than 0 it needs to set the height field value to 0.
*  Write the following methods (instance methods):
● Method named getHeight without any parameters, it needs to return the value of height
  field. ● Method named getVolume without any parameters, it needs to return the calculated volume.
  To calculate volume multiply the area with height.
*/

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class P19_Cylinder extends P19_Circle {
    //Instance Variable
    double height;
    P19_Circle circle;

    // P19_Cylinder cylinder = new P19_Cylinder();

    //Constructor with 2 parameters with double type and initialising height field.
    public P19_Cylinder(double radius, double height) {
        super(radius);               //Parent Constructor is called here
        this.height = height;        // Initialising height field
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Instance method 1
    public double getHeight() {
        return this.height;
    }

    //Instance method 2
    public double getVolume() {
        return (getArea() * height);
    }


}
