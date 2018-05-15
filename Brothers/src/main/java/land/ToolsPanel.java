package land;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;
import java.util.ArrayList;

import javax.swing.JList;

public class ToolsPanel implements ActionListener{
		
		ArrayList<MyButton> buttons = new ArrayList<MyButton>();
		private MyButton b1 = new MyButton("Immagini/und_block_sheet.png");
		private MyButton b2 = new MyButton("Immagini/grass.gif");
		private MyButton b3 = new MyButton("Immagini/brown_block.png");
		private MyButton b4 = new MyButton("Immagini/right_block.png");
		private MyButton b5 = new MyButton("Immagini/spine.png");
		private MyButton b6 = new MyButton("Immagini/block.png");
		private MyButton b7 = new MyButton("Immagini/full_block.png");
		private MyButton b8 = new MyButton("Immagini/grassedge3.png");
		private MyButton b9 = new MyButton("Immagini/grass_left.png");
		private MyButton b10 = new MyButton("Immagini/grass_right.png");
		private MyButton b11 = new MyButton("Immagini/grassl.gif");
		private MyButton b12 = new MyButton("Immagini/grassr.gif");
		private MyButton b13 = new MyButton("Immagini/left_block.png");

		Image image = null;
		
		public ToolsPanel(){
			//super();
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b10.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b13.addActionListener(this);
			buttons.add(b1);
			buttons.add(b2);
			buttons.add(b3);
			buttons.add(b4);
			buttons.add(b5);
			buttons.add(b6);
			buttons.add(b7);
			buttons.add(b8);
			buttons.add(b9);
			buttons.add(b10);
			buttons.add(b11);
			buttons.add(b12);
			buttons.add(b13);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i=0;i<buttons.size();i++)
				if(e.getSource() == buttons.get(i))
					image = buttons.get(i).getImage(); //è la getImage() di MyButton
			
		}
		public ArrayList<MyButton> getButtons(){
			return buttons;
		}
		public Image getImage(){
			return image;
		}
}
