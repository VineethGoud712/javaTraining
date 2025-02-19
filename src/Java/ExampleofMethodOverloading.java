package Java;

public class ExampleofMethodOverloading {
	
	// Method Overloading by changing the number of parameters
	int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method Overloading by changing the data type
    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
			 ExampleofMethodOverloading obj = new ExampleofMethodOverloading();
		        
		        // Calling overloaded methods
		        System.out.println("Sum of 2 integers: " + obj.add(10, 20)); 
		        System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30)); 
		        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 2.2)); 
		        System.out.println("Sum of 3 doubles: " + obj.add(1.1, 2.2, 3.3)); 
		    

	}

}
