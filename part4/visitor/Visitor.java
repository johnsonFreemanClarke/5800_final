package com.finalExam.part4.visitor;

import com.finalExam.part4.builder.Motorcycle;
import com.finalExam.part4.builder.Sedan;
import com.finalExam.part4.builder.Truck;

// The visitor design pattern ideally simplifies the
// process of  performing operations (algorithms) on
// objects without holding the objects accountable for
// modification.
public interface Visitor {
	double visit(Sedan sedan);
	double visit(Truck truck);
	double visit(Motorcycle motorcycle);
}

// The ParkingFeeVisitor will apply its separate algorithms
// to calculate the amount needed for each vehicle type.
// Method overloading is relied upon for the purposes of
// being able to apply the right algorithm corresponding to 
// the right kind of objects.
class ParkingFeeVisitor implements Visitor {
	
	private double standardFee;
	
	public ParkingFeeVisitor(double parkingFee) {
		standardFee = parkingFee;
	}
	
	// This will be considered the standard rate since sedans
	// are treated as a "normal" type of vehicle, therefore,
	// no additional taxes will be applied to such vehicles.
	public double visit(Sedan sedan) {
		return standardFee;
	}

	// Lets assume that in the future, truck owners are 
	// taxed by the environmental protection agency; this
	// simulation demonstrates such a dystopian world.
	public double visit(Truck truck) {
		return standardFee + (standardFee* 0.25);
	}

	// since motorcycles take up less space, the parking rate
	// is reduced by 10% of the standard fee.
	public double visit(Motorcycle motorcycle) {
		return standardFee - (standardFee * 0.10);
	}
}

// Pertains to the annual registration fee brought upon by
// the Department of Motor Vehicles (DMV). 
class RegistrationFeeVisitor implements Visitor {
	
	private double registrationFee;
	
	public RegistrationFeeVisitor() {
		registrationFee = 100;
	}

	// Lets assume that the EPA have enforced a tax rate 
	// policy for all types of vehicles; the rates will 
	// vary as we introduce new types of vehicles.
	public double visit(Sedan sedan) {
		return registrationFee + (registrationFee * 0.45);
	}

	public double visit(Truck truck) {
		return registrationFee + (registrationFee * 0.75);
	}

	public double visit(Motorcycle motorcycle) {
		return registrationFee + (registrationFee * 0.10);
	}
}
