class FlyingCar extends Car {
	long maxHeight;
	int airbags;
	
	FlyingCar(String name, int price, String modelNumber, String colour, int registrationNumber, int speed, int numberofSeats, String type, double average, boolean issoundSystem, long maxHeight, int airbags) {
		super(name, price, modelNumber, colour, registrationNumber, speed, numberofSeats, type, average, issoundSystem);
		this.maxHeight = maxHeight;
		this.airbags = airbags; 
	}

	void display(String name, int price, String modelNumber, String colour, int registrationNumber, int speed, int numberofSeats, String type, double average, boolean soundSystem, int numberofGears, long range) {
		super.display();
		System.out.println("Max Height : " + maxHeight);
		System.out.println("Airbags : " + airbags);
	}

}
