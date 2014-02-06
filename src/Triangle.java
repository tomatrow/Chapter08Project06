public class Triangle extends Figure {
	Triangle(Screen screen) {
		this(screen,new Frame());
	}
	Triangle(Screen screen,Frame frame) {
		this(screen,frame,new Point(),new Point(),new Point());	
	}
	Triangle(Screen screen,Point pointA, Point pointB, Point pointC) {
		this(screen,new Frame(),pointA,pointB,pointC);
	}
	Triangle(Screen screen, Frame frame, Point pointA, Point pointB, Point pointC) {
		
	}

}