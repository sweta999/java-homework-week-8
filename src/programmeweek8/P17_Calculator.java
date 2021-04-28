package programmeweek8;

/* PART- 3
3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
 floor of type Floor and carpet of type Carpet.
 The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
 and it needs to initialize the fields.
 Write the following methods (instance methods):
 ● Method named getTotalCost without any parameters, it needs to return the calculated total
 cost to cover the floor with a carpet.
 */

public class P17_Calculator {
    //Instance Variables
    P17_Floor floor;   // how to write this instance variable
    P17_Carpet carpet; // how to write this instance variable

    //1 Constructor with  parameters and initialising the parameters.
    public P17_Calculator(P17_Floor floor, P17_Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //Instance methods
    public double getTotalCost() {
        double totalcost;
        totalcost = floor.getArea() * carpet.getCost();
        return totalcost;
    }

}
