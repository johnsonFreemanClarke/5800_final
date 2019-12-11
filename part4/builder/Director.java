package com.finalExam.part4.builder;

// A Director initializes the building process of a vehicle type.
public class Director {
	private VehicleBuilder vehicleBuilder;
	
	// The director constructs a specific sedan vehicle for a
	// mid-sized family.
	public Sedan makeFamilySedan() {
		vehicleBuilder = new SedanBuilder();
		vehicleBuilder.assignTitle("Family Sedan");
		return (Sedan) vehicleBuilder.getVehicle();
	}
	
	// The director can also make a specialized motocross-motorcycle
	// for the motocross enthusiast.
	public Motorcycle makeMotocrossBike() {
		vehicleBuilder = new MotorcycleBuilder();
		vehicleBuilder.assignTitle("Motocross Beast");
		return (Motorcycle) vehicleBuilder.getVehicle();
	}
	
	// Similarly, the possible variations of the different types of
	// vehicles that can get built are endless. We will construct
	// a truck for completion sake.
	public Truck makeOffRoadTruck() {
		vehicleBuilder = new TruckBuilder();
		vehicleBuilder.assignTitle("Off-Roading Truck");
		return (Truck) vehicleBuilder.getVehicle();
	}
}
