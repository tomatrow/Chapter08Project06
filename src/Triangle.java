public class Triangle extends Figure {
	private Screen _screen;
	private Frame _frame;

	Triangle(Screen screen) {
		this(screen,new Frame());
	}
	Triangle(Screen screen, Frame frame) {
		setScreen(screen);
		setFrame(frame);
	}
	@Override 
	void draw() {
		getScreen().addLine(upperMiddle(),lowerRight());
		getScreen().addLine(lowerRight(),lowerLeft());
		getScreen().addLine(lowerLeft(),upperMiddle());
	}

	@Override
	void erase() {
		getScreen().removeLine(upperMiddle(),lowerRight());
		getScreen().removeLine(lowerRight(),lowerLeft());
		getScreen().removeLine(lowerLeft(),upperMiddle());
	}

	@Override
	void center() {
		erase();

		Point center = new Point(getScreen().getFrame().getWidth()/2,getScreen().getFrame().getHeight()/2);
		int xOffset = getFrame().getWidth()/2;
		int yOffset = getFrame().getHeight()/2;
		Point offsetOrigin = new Point(center.getX() - xOffset, center.getY() - yOffset);
		Frame centeredFrame = new Frame(getFrame().getWidth(),getFrame().getHeight(),offsetOrigin);
		setFrame(centeredFrame);

		draw();
	}

	public Point upperMiddle() {
		return new Point(getFrame().getOrigin().getX() + getFrame().getWidth()/2, getFrame().getOrigin().getY());
	}
	public Point lowerLeft() {
		return new Point(getFrame().getOrigin().getX(), getFrame().getOrigin().getY() + getFrame().getHeight());	
	}
	public Point lowerRight() {
		return new Point(getFrame().getOrigin().getX()+getFrame().getWidth(),lowerLeft().getY());	
	}



	// boiler
	public void setFrame(Frame frame) {
		_frame = frame;
	}
	public Frame getFrame() {
		return _frame;
	}
	public void setScreen(Screen screen) {
		_screen = screen;
	}
	public Screen getScreen() {
		return _screen;
	}

}