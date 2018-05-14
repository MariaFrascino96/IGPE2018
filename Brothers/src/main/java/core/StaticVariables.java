package core;

import java.awt.Dimension;
import java.awt.Toolkit;

public interface StaticVariables {
	
	final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	final int screen_width = (int) screenSize.getWidth();
	final int screen_height = (int) screenSize.getHeight();
	int finestra_width = screen_width/2;
	int finestra_height = screen_height/2;
	final int dimMatrice = 20; 
	

}
