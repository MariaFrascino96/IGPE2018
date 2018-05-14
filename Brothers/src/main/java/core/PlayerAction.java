package core;

import gui.Images;

public interface PlayerAction {
	
		public boolean automatedMove();
		public void updateCoord(int key, Images s);
		public void salto();
		public boolean inserisciOggetto(int idMago);
		

	}

