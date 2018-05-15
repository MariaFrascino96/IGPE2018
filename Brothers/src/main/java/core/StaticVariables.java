package core;

import java.awt.Dimension;
import java.awt.Toolkit;

public interface StaticVariables {
	
	final static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	final static int screen_width = (int) screenSize.getWidth();
	final static int screen_height = (int) screenSize.getHeight();
	final static int finestra_width = screen_width/2;
	final static int finestra_height = screen_height/2;
	final static int dimMatrice = 20; 
	
}
