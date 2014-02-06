public class Frame {
	private int _width;
	private int _height;
	
	Frame() {
		this(0,0);
	}
	Frame(int width, int height) {
		setWidth(width);
		setHeight(height);
	}

	public boolean inBounds(Point point) {
		boolean xInBounds = (point.getX() < getWidth());
		boolean yInBounds = (point.getY() < getHeight());
		return xInBounds && yInBounds;
	}

	// Boiler
	public int getWidth() {
		return _width;
	}
	public int getHeight() {
		return _height;
	}
	public void setWidth(int width) {
		if (width < 0)
			throw new IllegalArgumentException("Negative " + width + "width.");
		_width = width;
	}
	public void setHeight(int height) {
		if (height < 0)
			throw new IllegalArgumentException("Negative " + height + "height.");
		_height = height;
	}

}