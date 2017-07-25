class SportsCar extends Car {
	int numberofGears;
	long range;
	SportsCar(String name, int price, String modelNumber, String colour, int registrationNumber, int speed, int numberofSeats, String type, double average, boolean issoundSystem, int numberofGears, long range) {	
	super(name, price, modelNumber, colour, registrationNumber, speed, numberofSeats, type, average, issoundSystem);
		this.numberofGears = numberofGears;
		this.range = range;
	}

	void display(String name, int price, String modelNumber, String colour, int registrationNumber, int speed, int numberofSeats, String type, double average, boolean issoundSystem, int numberofGears, long range) {
		super.display();
		System.out.println("Number of Gears : " + numberofGears);
		System.out.println("Range : " + range);
	}
}
