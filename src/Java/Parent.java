package Java;

public class Parent {
	
	void run() {
        System.out.println("Vehicle is running");
    }

}
class  child1 extends Parent{
	
	 void carFeature() {
	        System.out.println("Car has four wheels");
	    }
	
}
class child2 extends Parent{
	void bikeFeature() {
        System.out.println("Bike has two wheels");
    }
}
