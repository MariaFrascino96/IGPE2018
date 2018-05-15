package gui;

import core.Mondo;
import gui.Menu;
import gui.MyFrame;
import gui.MyPanel;

public class GUI{
	private Mondo mondo;
	private Menu menu;
	private MyFrame myframe;
	
	public GUI(Mondo m)
	{
		this.mondo = m;
		this.myframe = new MyFrame();
	}
	
	public void createMenu()
	{
		menu = new Menu(myframe);
	}

	public MyFrame getMyframe() {
		return myframe;
	}

	public void setMyframe(MyFrame myframe) {
		this.myframe = myframe;
	}
	
	

	
	

}
