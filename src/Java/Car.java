package Java;

public class Car {
	
	
	String name,colour;
	int model;
	
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "Toyato";
		c.colour = "Red";
		c.model = 2024;
		
		System.out.println(c.name);
		System.out.println(c.colour);
		System.out.println(c.model);

	}

}
