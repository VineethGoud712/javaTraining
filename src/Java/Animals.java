package Java;

public class Animals {
	 void eat() {
	        System.out.println("Animal is eating");
	    }
	}

	// Intermediate Child Class
	class BigDog extends Animals {
	    void bark() {
	        System.out.println("Dog is barking");
	    }
	}

	// Subclass
	class BabyDog extends BigDog {
	    void weep() {
	        System.out.println("Baby Dog is weeping");
	    }
	}