package Java;

public class NormalVehicle {
	 void run() {
	        System.out.println("Vehicle is running");
	    }
	}

	// Interface
	interface ElectricVehicle {
	    void chargeBattery();
	}

	// Child Class (Hybrid Inheritance)
	class HybridCar extends Vehicle implements ElectricVehicle {
	    public void chargeBattery() {
	        System.out.println("Charging the electric car...");
	    }
	}
