package programmeweek8_realexampleoverriding;

/*
Test class to create objects and call the methods
class Test2{
public static void main(String args[]){
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
 */

//Test class to create objects and call the methods
public class P24_Test2 {
    
    public static void main(String[] args) {
        P24_SBI s = new P24_SBI();
        P24_ICICI i = new P24_ICICI();
        P24_AXIS a = new P24_AXIS();
        System.out.println("SBI Rate of Interest : " + s.getRateOFInterest());
        System.out.println(("ICICI Rate of Interest : " + i.getRateOfInterest()));
        System.out.println("AXIS Rate of Interest : " + a.getRateOfInterest());

    }

}
