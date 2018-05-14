package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

public class Menu {
	
	private JButton play;
	private MyFrame myframe;
	
	public Menu(MyFrame myframe) 
	{
		this.myframe = myframe;
		myframe.getMypanel().setVisible(false);
		myframe.getMypanel().setLayout(new BorderLayout());
		play = new JButton("PLAY");
		myframe.getMypanel().add(play,1); //2: dovrebbe essere il centro
		myframe.getMypanel().setVisible(true);
		
		
	}

	
}
