public abstract class Figure {
	void draw() {
		printClassAndCallingMethod();
	}
	void erase() {
		printClassAndCallingMethod();
	}
	void center() {
		printClassAndCallingMethod();
		erase();
		draw();
	}
	public void printClassAndCallingMethod() {
		Exception e = new Exception();
		e.fillInStackTrace();
		System.out.println(getClass().getName() + ": " + e.getStackTrace()[1].getMethodName());
	}
}