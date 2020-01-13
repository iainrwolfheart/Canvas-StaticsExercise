package Starter.Vehicle;

import Starter.FactoryStuff.RegistrationPlate;
import Starter.FactoryStuff.RegistrationPlateFactory;

public class Vehicle {
	private int speed, lane;
	private static int count;
	private RegistrationPlate registration;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}

	public Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
		this.registration = RegistrationPlateFactory.createPlate();
		Vehicle.count++;
	}

	public void accelerate(int amt) {
		speed += amt;
		if (speed > 70) {
			speed = 70;
		}
	}

	public void brake(int amt) {
		speed -= amt;
		if (speed < 0) {
			speed = 0;
		}
	}

	public String getDetails() {
		return String.format("%d, %d, %s", speed, lane, registration.getRegistrationNo());
	}
}
