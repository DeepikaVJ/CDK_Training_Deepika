abstract class Vehicle {
	String name;
	int vin;
	int speed;
	Vehicle(String name, int vin, int speed) {
		this.name = name;
		this.vin = vin;
		this.speed = speed;
	}
	void details() {
		System.out.println("Name : " + name);
		System.out.println(" Vin :" + vin);
		System.out.println("Speed :" + speed);
	}
	abstract void inspect();	
	abstract void drive();
}

class Bike extends Vehicle{
	int wheels;
	Bike(String name, int vin, int speed, int wheels) {
		super(name, vin, speed);
		this.wheels = wheels;
	}
	void drive() {
		System.out.println("In bike drive() method");
	}
	void inspect() {
		System.out.println("In bike inspect() method");
	}
}

class Car extends Vehicle{
	Car(String name, int vin, int speed) {
		super(name, vin, speed);
	}
	void drive() {
		System.out.println("In Car drive() method");
	}
	void inspect() {
		System.out.println("In Car inspect() method");
	}
}
class Mechanic {
	public static void main(String[] args) {
		Car car = new Car("Abc",12,60);
		Bike bike = new Bike("Abc",12,60,2);
		car.drive();
		bike.drive();
		bike.inspect();
		car.inspect();
	}
}