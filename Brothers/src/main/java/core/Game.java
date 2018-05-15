package core;

public class Game {
	
	private Mondo mondo;
	
	public Game(Mondo m)
	{
		this.mondo = m;
		this.mondo.getGui().createMenu();
	}
	
	public void play()
	{
		mondo.getMago().start();
	}

}
