package land;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel implements MouseListener, MouseMotionListener{
	
	private int width;
	private Vector<CellType> point; //vector che salva il numero di click del mouse
	private int cell_size;
	Image image;
	ToolsPanel tp;
	
	public MyPanel(){
		super();
		
		image = null;
		width = 800;
		point = new Vector<CellType>(); 
		cell_size = 32;
		tp = new ToolsPanel();
		
		this.setBackground(Color.WHITE);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		
		//JSplitPane s = new JSplitPane();
		//s.setRightComponent();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect(0, 0, width, 700);
		
		for(int i = 0; i < width; i+=cell_size){
			g.setColor(Color.black);
			g.fillRect(i, 0, 1, width); //disegna le colonne della griglia
			g.fillRect(0, i, width, 1); //disegna le righe della griglia
		}
		for(int i = 0; i < point.size();i++){
			CellType tmp = point.get(i);
			g.drawImage(tmp.getImage(), tmp.getX()*32, tmp.getY()*32, 32, 32, null);
		}
	}
	private Point clickToGrid(int x, int y){
		int px = x ;
		int py = y ;
		px = px / cell_size;
		py = py / cell_size;
		//System.out.println("Grid coord --- x: "+px+" y: "+py);
		return new Point(px,py);
	}
	private void removeDuplicate(CellType p){			
		for(int i = 0; i < point.size();i++){
			CellType tmp = point.get(i);
			if (tmp.equals(p)){
				point.remove(i);
				return;
			}
		}
	}
	public void mouseDragged(MouseEvent e) {
		mousePressed(e);
	}
	
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Point p = clickToGrid(x,y); //predo il punto del click
		image = tp.getImage(); //l immagine cliccata
		CellType c = new CellType(p,image);
		removeDuplicate(c);
		point.add(c);
		repaint();
		System.out.println("Size: "+point.size());
	}
	public ToolsPanel getTool(){
		return tp;
	}

	public void aggiungi(JPanel p2) {
		for(int i=0;i<tp.getButtons().size();i++)
			p2.add(tp.getButtons().get(i));		
	}
	
	public void clearEditor()
	{
		this.setBackground(Color.WHITE);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}
	

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}