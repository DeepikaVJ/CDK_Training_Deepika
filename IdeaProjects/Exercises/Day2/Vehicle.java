class Vehicle {
	public static void main(String []args) {
		SportsCar sportscar = new SportsCar("F1", 1000000, "x58", "red", 145, 120, 2, "AC" , 70.00 , true, 6, 120);
		FlyingCar flyingcar = new FlyingCar("A23", 900000, "x78", "blue", 125, 60,4, "AC" , 60.00 ,true, 900000, 5);
		flyingcar.display();
		sportscar.display();
		sportscar.start();
		sportscar.accelerate(10);
		sportscar.accelerate(20);
		sportscar.accelerate(10);
		sportscar.stop();
		flyingcar.start();
		flyingcar.accelerate(10);
		flyingcar.accelerate(15);
		flyingcar.accelerate(10);
		flyingcar.stop();
	}
	
}

