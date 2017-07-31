class Driver {
	String name;
	public static void main(String[] args) {
		Car car = new Car();
		car.accelerate(40);
		System.out.println("Speed after accelerating :" + car.speed);
		car.brake();
		System.out.println("Speed after applying brake:" + car.speed);
	}
}
