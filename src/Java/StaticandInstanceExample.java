package Java;

public class StaticandInstanceExample {
	
static int staticVar = 100;
    
    // Instance variable (separate for each object)
    int instanceVar = 200;

    // Static method (can be called without an object)
    static void staticMethod() {
        System.out.println("Inside Static Method");
        System.out.println("Static Variable: " + staticVar);
        // Cannot access instanceVar here
    }

    // Instance method (requires an object)
    void instanceMethod() {
        System.out.println("Inside Instance Method");
        System.out.println("Static Variable: " + staticVar); // Can access static variables
        System.out.println("Instance Variable: " + instanceVar); // Can access instance variables
    }

	

}
