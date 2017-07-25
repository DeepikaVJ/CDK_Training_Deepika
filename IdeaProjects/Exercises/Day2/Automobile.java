class Automobile {
	String name;
	int price;
	String modelNumber;
	String colour;
	static int registrationNumber;
	int speed;
	Automobile(String name, int price, String modelNumber, String colour, int registrationNumber, int speed) {
		this.name = name;
		this.price = price;
		this.modelNumber = modelNumber;
		this.colour = colour;
		this.speed = speed;
	}

	void setName(String name) {
		this.name = name;
	}
	String getName () {
		return name;
	}

	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}

	void setModelNumber(String ModelNumber) {
		this.modelNumber = modelNumber;
	}
	String getModelNumber() {
		return modelNumber;
	}

	void setColour(String colour) {
		this.colour = colour;
	}
	String getColour() {
		return colour;
	}

	int getRegistrationNumber() {
		return registrationNumber;
	}

	void start() {
		System.out.println("Automobile started");
	} 
	void stop() {
		System.out.println("Automobile stopped");
	} 

	void display() {
		System.out.println(" Name : " + this.name);
		System.out.println(" Price : " + this.price);
		System.out.println(" modelNumber: " + this.modelNumber);
		System.out.println(" Colour: " + this.colour);
		System.out.println(" registrationNumber : " + this.registrationNumber);
		System.out.println(" Speed : " + this.speed);
	}
	
	void brake() {
		speed -= 10;
	}
	void updatePrice(int price) {
		this.price = price;
	}

}
