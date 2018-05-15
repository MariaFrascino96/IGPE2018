package land;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{

		public static void main(String[] argv){
			JFrame f = new MyFrame();
			f.setVisible(true);
		}
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		MyPanel mypanel = new MyPanel();
		MyMenu menu = new MyMenu();
		
		
		public MyFrame(){
			super();
			this.setTitle("Level Editor");
			this.setSize(1000,708);
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension d = tk.getScreenSize();
			this.setLocation(d.width/2-500, d.height/2-370);
			panel1.setLayout(new BorderLayout());
			mypanel.setPreferredSize(new Dimension(800,608));
			panel2.setPreferredSize(new Dimension(195,608));
			panel2.setBackground(Color.BLUE);
			mypanel.aggiungi(panel2);
			panel1.add(mypanel,BorderLayout.WEST);
			panel1.add(panel2,BorderLayout.EAST);
			this.setContentPane(panel1);
			
			this.setJMenuBar(menu.getMb());
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
