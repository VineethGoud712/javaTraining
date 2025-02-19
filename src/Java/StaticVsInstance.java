package Java;

public class StaticVsInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accessing static method and variable without creating an object
		StaticandInstanceExample.staticMethod();
        
        // Creating first object
		StaticandInstanceExample obj1 = new StaticandInstanceExample();
        obj1.instanceMethod();
        
        // Modifying instance and static variables
        obj1.instanceVar = 500; // Changes for obj1 only
        StaticandInstanceExample.staticVar = 300; // Changes for all objects

        // Creating second object
        StaticandInstanceExample obj2 = new StaticandInstanceExample();
        obj2.instanceMethod(); // New object has default instanceVar but updated staticVar

	}

}
