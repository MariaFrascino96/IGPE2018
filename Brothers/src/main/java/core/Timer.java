package core;

import javax.swing.JPanel;

public class Timer extends Thread{
	
	private Mondo mondo;
	private JPanel jpanel;
	
	public Timer(Mondo m, JPanel p)
	{
		this.mondo = m;
		this.jpanel = p;
	}
	
	public void run()
	{
		while(!mondo.getMago().deadShape)
		{
			mondo.getMago().automatedMove();
			
			if(!mondo.getMago().automatedMove())
				System.out.println("coord fuori norma");
		}
	}
	

}
