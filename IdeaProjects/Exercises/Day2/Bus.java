class Bus extends Automobile {
	int numberofSeats;
	String type;
	double mileage;
	int numberofTrips;
	Bus(String name, int price, String modelNumber, String colour, int registrationNumber, int speed, int numberofSeats, String type, double mileage, int numberofTrips) {
		super(name, price, modelNumber, colour, registrationNumber, speed);
		this.numberofSeats = numberofSeats;
		this.type = type;
		this.mileage = mileage;
		this.numberofTrips = numberofTrips;
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
	
	void setNumberofTrips() {
		this.numberofTrips = numberofTrips;
	}
	
	int getNumberofTrips() {
		return numberofTrips;
	}

	void display() {
		super.display();
		System.out.println(" Number of Seats : " + this.numberofSeats);
		System.out.println(" Type : " + this.type);
		System.out.println(" Mileage: " + this.mileage);
		System.out.println(" Number of Trips: " + this.numberofTrips);
	}
	void accelerate(int speed) {
		this.speed += 30;
		System.out.println("Speed of car : " + this.speed);
	}

}
