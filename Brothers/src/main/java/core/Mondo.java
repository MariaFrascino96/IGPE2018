package core;

public class Mondo {
	
	//private Listener listenerClass;
	private int cont;
	private Mago mago;
	//private RidimensionaFinestre ridimensiona;
	private Matrice matrice;
	private GUI gui;
	private Timer timer;
	private Game game;
	
	public Mondo(Matrice m)
	{
		this.matrice = m;
		int id_shape = 1, id_immagine = 1;
		mago = new Mago(id_shape,id_immagine,matrice);
		gui = new GUI(this);
		timer = new Timer(this,gui.getMyframe().getMypanel());
		timer.start();
		game = new Game(this);
		
	}
	

	public Mago getMago() {
		return mago;
	}

	public void setMago(Mago mago) {
		this.mago = mago;
	}

	public GUI getGui() {
		return gui;
	}

	public void setGui(GUI gui) {
		this.gui = gui;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}
	
	
	
	

}
