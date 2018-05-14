package gui;

import java.awt.Dimension;
import java.awt.Label;

import javax.swing.JFrame;

import core.StaticVariables;

public class MyFrame extends JFrame{
	
	private MyPanel mypanel;
	//private Label label1;
	
	public MyFrame()
	{
	 super();
	 this.setTitle("My Frame");
	 this.setSize(StaticVariables.finestra_width,StaticVariables.finestra_height);
	 this.setLocationRelativeTo(null); //mostra il frame al centro dello schermo
	 mypanel = new MyPanel();
	 mypanel.setPreferredSize(new Dimension(StaticVariables.finestra_width,StaticVariables.finestra_height));
	 //label1 = new Label("Sto cavolfiore");
	 //mypanel.add(label1);
	 this.setVisible(true);
	 this.add(mypanel);
	}
	
	public MyFrame getMyFrame() { return this; }

	public MyPanel getMypanel() {
		return mypanel;
	}

	public void setMypanel(MyPanel mypanel) {
		this.mypanel = mypanel;
	}
	
	
	

}
