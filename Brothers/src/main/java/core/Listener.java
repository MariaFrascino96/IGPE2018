package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listener implements KeyListener , MouseListener, MouseMotionListener{
	
	private int tasto;
	
	public Listener()
	{
		tasto = 0;
	}
	
	
	
 /*	public int getTasti()
	{
		if(Gdx.input.isKeyPressed(Keys.UP))
		{
			System.out.println("Ho premuto il tasto UP");
			tasto = 1;
			
			
		}
		
		else if(Gdx.input.isKeyPressed(Keys.DOWN))
		{
			System.out.println("Ho premuto il tasto DOWN");
			tasto = 2;
			
		}
		
		else if(Gdx.input.isKeyPressed(Keys.RIGHT))
		{
			System.out.println("Ho premuto il tasto RIGHT");
			tasto = 3;
			
		}	
		else if(Gdx.input.isKeyPressed(Keys.LEFT))
		{
			System.out.println("Ho premuto il tasto LEFT");
			tasto = 4;
			
		}
		else 
		{
			tasto = 0;
		}
		
		return tasto;
		
	}*/
	
	

	public int getTasto() {
		return tasto;
	}

	public void setTasto(int tasto) {
		this.tasto = tasto;
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== e.VK_UP){
			System.out.println("Ho premuto il tasto UP");
			tasto = 1;
			
		}
		
		else if(e.getKeyCode()== e.VK_DOWN){
			System.out.println("Ho premuto il tasto DOWN");
			tasto = 2;
		}
		
		else if(e.getKeyCode()== e.VK_RIGHT){
			System.out.println("Ho premuto il tasto RIGHT");
			tasto = 3;
		}	
		else if(e.getKeyCode()== e.VK_LEFT)
		{
			System.out.println("Ho premuto il tasto LEFT");
			tasto = 4;
			
		}
		else 
		{
			tasto = 0;
		}
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
