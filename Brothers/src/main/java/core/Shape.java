package core;

import java.util.Random;

public abstract class Shape extends Thread implements PlayerAction{
	
	protected int id_shape; // il valore della shape(Es moto 1, moto 2[multiplaying])
	protected Random random;
	protected int i_iniziale, j_iniziale; // valori iniziali della moto
	protected int immagine; // è l'intero che rappresenta l'immagine della moto presa in considerazione.
							// Quest'intero servirà alla classe adibita a caricare tutte le immagini del
							// gioco.
	boolean deadShape;
	//protected Matrice matrice;
	//protected Timer timer;

	public Shape()
	{
		this.i_iniziale = 0;
		this.j_iniziale = 0;
		this.id_shape = 0;
		this.immagine = 0;
		this.deadShape = false;
		//this.timer = new Timer();
	}
	
	
	public boolean isDeadShape() {
		return deadShape;
	}



	public void setDeadShape(boolean deadShape) {
		this.deadShape = deadShape;
	}



	public int getId_shape() {
		return id_shape;
	}

	public void setId_shape(int id_shape) {
		this.id_shape = id_shape;
	}

	public int getI_iniziale() {
		return i_iniziale;
	}

	public void setI_iniziale(int i_iniziale) {
		this.i_iniziale = i_iniziale;
	}

	public int getJ_iniziale() {
		return j_iniziale;
	}

	public void setJ_iniziale(int j_iniziale) {
		this.j_iniziale = j_iniziale;
	}

	public int getImmagine() {
		return immagine;
	}

	public void setImmagine(int immagine) {
		this.immagine = immagine;
	}
	
    
	
}
