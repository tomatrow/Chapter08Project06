import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Chapter08Project06 {
	public static Frame DEFAULT_FRAME = new Frame(10,10,new Point(10,10));

	public static void main(String[] args) {
		Screen s = new Screen(getTerminalFrame());
		Figure r = new Rectangle(s,DEFAULT_FRAME);
		Figure t = new Triangle(s,DEFAULT_FRAME);

		r.draw();
		r.center();
		t.draw();
		
		s.print();
	}

	public static Frame getTerminalFrame() {
		Frame terminalFrame = new Frame();

		BufferedReader input;
		Process process;
	    String line;

	    try {
	    	// get height
	    	String[] tputLines = {"/bin/bash","-c","tput lines"};
			process = Runtime.getRuntime().exec(tputLines);
		    input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    
		    if ((line = input.readLine()) != null) {
		    	terminalFrame.setHeight(Integer.parseInt(line));
		    } else {
		    	throw new IOException();
		    }
		    input.close();

		    // get width
		    String[] tputCols = {"/bin/bash","-c","tput cols"};
		    process = Runtime.getRuntime().exec(tputCols);
		    input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    
		    if ((line = input.readLine()) != null) {
		    	terminalFrame.setWidth(Integer.parseInt(line));
		    } else {
		    	throw new IOException();
		    }
		    input.close();

		} catch (IOException e) {
			// 80,25
			terminalFrame.setWidth(80);
			terminalFrame.setHeight(25);
		}

		return terminalFrame;
	}
}