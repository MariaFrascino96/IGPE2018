package land;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu extends MyPanel implements ActionListener{
	
	private JMenuBar mb;
	private JMenu filem;
	private JMenuItem mi;
	private JMenuItem clear;
	
	

   public MyMenu(){
		
		mb = new JMenuBar();
		filem = new JMenu("File");
		mi = new JMenuItem("Salva");
		clear = new JMenuItem("Clear");
		
		filem.add(mi);
		mb.add(filem);
		filem.addActionListener(this);
		filem.add(clear);
		clear.addActionListener(this);
		
	}
	
    public JMenuBar getMb() {
		return mb;
	}

	public void setMb(JMenuBar mb) {
		this.mb = mb;
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
				if(e.getSource() == clear)
					clearEditor();
					
			
		}
		
	
	
}
