package Java;


public class ExampleofMethodOverriding {

	public static void main(String[] args) {
		
		 // Parent class reference, pointing to parent object
        Animal a = new Animal();
        a.makeSound(); // Calls parent class method

        // Parent class reference, pointing to child object (Runtime Polymorphism)
        Animal dog = new Dog();
        dog.makeSound(); // Calls overridden method in Dog class

        Animal cat = new Cat();
        cat.makeSound(); // Calls overridden method in Cat class
		
	}

}
