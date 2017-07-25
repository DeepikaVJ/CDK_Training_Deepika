class Circle {
	void paint(double thickness) {
		System.out.println("Pencil Painting");
	}
	void paint(int fingers) {
		System.out.println("Fingers Painting");
	}
	void paint(String colour) {
		System.out.println("Pencil Painting");
	}
	public static void main(String []args) {
		Circle circle = new Circle();		
		circle.paint(1.2);
		circle.paint(5);
		circle.paint("Black");
	} 
}