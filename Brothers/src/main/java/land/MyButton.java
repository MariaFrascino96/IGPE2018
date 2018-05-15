package land;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class MyButton extends JButton{
	
	private Image image = null;
	
	public MyButton(String st) { //gli passo il percorso dell'immagine
		
		super(new ImageIcon(st));
		Toolkit tk = Toolkit.getDefaultToolkit();
		image = tk.getImage(st);
		this.setContentAreaFilled(false);
		this.setBorderPainted(true);
		this.setFocusPainted(false);
		this.setBackground(Color.RED);
       // this.setBorder(new LineBorder(Color.YELLOW));
	}
	
	public Image getImage(){
		//System.out.println(image);
		return image;
	}
}
