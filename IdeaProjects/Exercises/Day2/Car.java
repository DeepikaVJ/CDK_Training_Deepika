class Car extends Automobile {
	int numberofSeats;
	String type;
	double average;
	boolean issoundSystem;
	Car(String name, int price, String modelNumber, String colour, int registrationNumber, int speed, int numberofSeats, String type, double average, boolean issoundSystem) {
		super(name, price, modelNumber, colour, registrationNumber, speed);
		this.numberofSeats = numberofSeats;
		this.type = type;
		this.average = average;
		this.issoundSystem = issoundSystem;
	}

	void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}
	int getNumberofSeats() {
		return numberofSeats;
	}

	void setType(String type) {
		this.type = type;
	}
	String getType() {
		return type;
	}

	boolean getSoundSystem() {
		return issoundSystem;
	}

	void display() {
		super.display();
		System.out.println(" Number of Seats : " + this.numberofSeats);
		System.out.println(" Type : " + this.type);
		System.out.println(" Average: " + this.average);
		System.out.println(" Sound System: " + this.issoundSystem);
	}
	void accelerate(int speed) {
		this.speed += 20;
		System.out.println("Speed of car : " + this.speed);
	}
}
