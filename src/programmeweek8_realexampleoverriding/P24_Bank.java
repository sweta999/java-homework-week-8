package programmeweek8_realexampleoverriding;

/* PARENT CLASS
Java Program to demonstrate the real scenario of Java Method Overriding

//where three classes are overriding the method of a parent class.
//Creating a parent class.
class Bank{
public int getRateOfInterest(){return 0;}
}
//Creating child classes.
class SBI extends Bank{
public int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
public int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
public int getRateOfInterest(){return 9;}
}
//Test class to create objects and call the methods
class Test2{
public static void main(String args[]){
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
}
}
Output:
SBI Rate of Interest: 8
ICICI Rate of Interest: 7
AXIS Rate of Interest: 9
*/

//PARENT CLASS
public class P24_Bank {
    public int getRateOFInterest() {
        {
            return 0;
        }
    }


}
