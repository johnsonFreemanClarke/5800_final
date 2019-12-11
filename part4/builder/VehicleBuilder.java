package com.finalExam.part4.builder;

// This is the generic interface that accommodates
// the construction of different vehicle types.
public interface VehicleBuilder {
	void installEngine(String engineType);
	void assignTitle(String title);
	void assignColor(String color);
	Vehicle getVehicle();
}

// SedanBuilder serves as a concrete builder of
// sedan vehicles.
class SedanBuilder implements VehicleBuilder {
	
	private Sedan sedan;
	
	public SedanBuilder() {
		sedan = new Sedan();
	}
	public void installEngine(String engineType) {
		sedan.setEngine(engineType);
	}
	public void assignTitle(String title) {
		sedan.setTitle(title);
	}
	public void assignColor(String color) {
		sedan.setColor(color);
	}
	public Vehicle getVehicle() {
		return sedan;
	}
}

// MotorCycleBuilder conveniently serves as a 
// concrete builder of motorcycles.
class MotorcycleBuilder implements VehicleBuilder {

	private Motorcycle motorcycle;
	
	public MotorcycleBuilder() {
		motorcycle = new Motorcycle();
	}
	public void installEngine(String engineType) {
		motorcycle.setEngine(engineType);
	}
	public void assignTitle(String title) {
		motorcycle.setTitle(title);
	}
	public void assignColor(String color) {
		motorcycle.setColor(color);
	}
	public Vehicle getVehicle() {
		return motorcycle;
	}
}

// TruckBuilder behaves similarly to the above
// concrete builders and represents the construction
// of trucks.
class TruckBuilder implements VehicleBuilder {
	
	private Truck truck;
	
	public TruckBuilder() {
		truck = new Truck();
	}
	public void installEngine(String engineType) {
		truck.setEngine(engineType);
	}
	public void assignTitle(String title) {
		truck.setTitle(title);
	}
	public void assignColor(String color) {
		truck.setColor(color);
	}
	public Vehicle getVehicle() {
		return truck;
	}
}