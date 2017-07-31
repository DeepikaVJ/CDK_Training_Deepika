class Car {
	String name;
	int price;
	String modelNumber;
	String colour;
	int registrationNumber;
	int seats;
	boolean brake;
	double speed;
	
	void accelerate(int speed) {
		this.speed += 10;
	}
	void brake() {
		brake = true;
		speed -= 10;
	}
	void updatePrice(int price) {
		this.price = price;
	}

}
