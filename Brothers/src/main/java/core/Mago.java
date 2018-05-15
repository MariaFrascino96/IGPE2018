package core;

import java.util.Random;

import gui.Images;

public class Mago extends Shape implements PlayerAction {

	private Matrice matrice;

	public Mago(int i, int immagine, Matrice m) {

		super();
		this.matrice = m;
		this.id_shape = i;
		random = new Random();
		this.inserisciOggetto(id_shape);
		// this.timer.start();

	}

	public void run() {
		System.out.println("eccomi");
		while (!this.deadShape) {
			this.automatedMove();

			if (!this.automatedMove())
				System.out.println("coord fuori norma");
		}
	}

	public void updateCoord(int key) {
		switch (key) {
		case (0): {
			break;
		}
		case (1): {
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale, 0);
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale + 1, 1);
			this.j_iniziale++;
			break;
		}
		case (2): {
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale, 0);
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale - 1, 1);
			this.j_iniziale--;
			break;
		}
		case (3): {
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale, 0);
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale + 1, this.j_iniziale, 1);
			this.i_iniziale++;
			break;
		}
		case (4): {
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale, 0);
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale - 1, this.j_iniziale, 1);
			this.i_iniziale--;
			break;
		}
		}
	}
	/*
	 * public void updateCoord(int key, Images shapes) {
	 * 
	 * switch (key) { case (0): { break; } case (1): // sopra { if
	 * (shapes.immagini.get(1).getY() > -39 && shapes.immagini.get(1).getY() < 108)
	 * { if (this.i_iniziale > 0 && this.i_iniziale <= StaticVariables.dimMatrice -
	 * 2) { this.matrice.getMatrice().setValoreMatrice(this.i_iniziale,
	 * this.j_iniziale, 0); this.i_iniziale -= 1;
	 * this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale,
	 * this.id_shape); shapes.immagini.get(1).setY(Math.abs(this.i_iniziale - 18) *
	 * this.ridimensiona.pixelsCella("height", StaticVariables.dimMatrice));
	 * System.out.println("y dell'immagine: " + this.i_iniziale *
	 * this.ridimensiona.pixelsCella("height", StaticVariables.dimMatrice));
	 * 
	 * System.out.println("i: " + this.i_iniziale + " j: " + this.j_iniziale);
	 * 
	 * } } else System.out.println("l < 0"); break; } case (2): // sotto { if
	 * (shapes.immagini.get(1).getY() > -39 && shapes.immagini.get(1).getY() < 121)
	 * { if (this.i_iniziale > 0 && this.i_iniziale < StaticVariables.dimMatrice -
	 * 2) { this.matrice.getMatrice().setValoreMatrice(this.i_iniziale,
	 * this.j_iniziale, 0); this.i_iniziale += 1;
	 * this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale,
	 * this.id_shape);
	 * 
	 * shapes.immagini.get(1).setY(Math.abs(this.i_iniziale - 18) *
	 * this.ridimensiona.pixelsCella("height", StaticVariables.dimMatrice));
	 * System.out.println("y dell'immagine: " + this.i_iniziale *
	 * this.ridimensiona.pixelsCella("height",StaticVariables.dimMatrice));
	 * 
	 * System.out.println("i: " + this.i_iniziale + " j: " + this.j_iniziale);
	 * 
	 * } } else System.out.println("l > 18: " + shapes.immagini.get(1).getY());
	 * 
	 * break; } case (3): // destra { if (shapes.immagini.get(1).getX() >= 0 &&
	 * shapes.immagini.get(1).getX() < 850) { if (this.j_iniziale <=
	 * StaticVariables.dimMatrice - 2 && this.j_iniziale >= 0) // sistemare il //
	 * rapporto tra // celle matrice e // ixels // dell'immagine {
	 * 
	 * this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale,
	 * 0); this.j_iniziale += 1;
	 * this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale,
	 * this.id_shape));
	 * 
	 * // shapes.immagini.get(1).setX(shapes.immagini.get(1).getX()+1);
	 * shapes.immagini.get(1).setX(this.j_iniziale *
	 * this.ridimensiona.pixelsCella("width", StaticVariables.dimMatrice)); //
	 * immagini.get(1).getSprite().setRotation(45);
	 * 
	 * System.out.println("x dell'immagine: " + this.j_iniziale *
	 * this.ridimensiona.pixelsCella("width", StaticVariables.dimMatrice));
	 * 
	 * System.out.println("i: " + this.i_iniziale + " j: " + this.j_iniziale); }
	 * 
	 * } else System.out.println("l > 18 or l < 0"); break; }
	 * 
	 * case (4): // sinistra {
	 * 
	 * if (shapes.immagini.get(1).getX() >= 0 && shapes.immagini.get(1).getX() <
	 * 889) { if (this.j_iniziale <= StaticVariables.dimMatrice - 2 &&
	 * this.j_iniziale > 0) // sistemare il // rapporto tra // celle matrice e //
	 * ixels // dell'immagine {
	 * 
	 * this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale,
	 * 0); this.j_iniziale -= 1;
	 * this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale,
	 * this.id_shape); shapes.immagini.get(1).setX(this.j_iniziale *
	 * this.ridimensiona.pixelsCella("width", StaticVariables.dimMatrice)); //
	 * immagini.get(1).getSprite().setRotation(45);
	 * 
	 * System.out.println("x dell'immagine: " + this.j_iniziale *
	 * this.ridimensiona.pixelsCella("width", StaticVariables.dimMatrice));
	 * 
	 * System.out.println("i: " + this.i_iniziale + " j: " + this.j_iniziale); } }
	 * 
	 * else System.out.println("l > 18 or l < 0");
	 * 
	 * break; } default: break; }
	 * 
	 * }
	 */

	@Override
	public boolean inserisciOggetto(int idMago) {
		// random_i = random.nextInt(matrix.getL())+1;
		// random_j = random.nextInt(matrix.getL())+1;
		this.i_iniziale = StaticVariables.dimMatrice - 2;
		this.j_iniziale = 1;
		if (this.j_iniziale < StaticVariables.dimMatrice - 2
				&& this.matrice.getValoreMatrice(this.i_iniziale, this.j_iniziale) == 0) {
			this.matrice.setValoreMatrice(this.i_iniziale, this.j_iniziale, idMago);
			System.out.println("random_i: " + this.i_iniziale + " random_j: " + this.j_iniziale + "\n");
			return true;
		} else
			System.out.println("Posto occupato\n");

		return false;

	}

	@Override
	public boolean automatedMove() {
		if (this.j_iniziale < StaticVariables.dimMatrice - 2) // se la j del mago è minore di 18
		{
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale, 0);
			this.matrice.getMatrice().setValoreMatrice(this.i_iniziale, this.j_iniziale + 1, 1);
			this.j_iniziale += 1;
			this.matrice.getMatrice().print();
			return true;
		}
		this.deadShape = true;
		return false;

	}

	public int getImmagine() {
		return immagine;
	}

	public void setImmagine(int immagine) {
		this.immagine = immagine;
	}

	@Override
	public void salto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCoord(int key, Images s) {
		// TODO Auto-generated method stub

	}

}
