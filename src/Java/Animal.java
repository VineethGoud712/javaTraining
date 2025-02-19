package Java;

public class Animal {
	
	// Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
// Child Class (Overriding the method)
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
//Another Child Class
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }
}


