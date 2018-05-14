package core;

public class Matrice {
	
	private int [][]matrix;
	
	public Matrice()
	{
		matrix = new int[StaticVariables.dimMatrice][StaticVariables.dimMatrice];
		init();
		//print();
	}
	
	private void init()
	{
		for(int i = 0; i < StaticVariables.dimMatrice; i++)
		{
				matrix[0][i] = 9;
				matrix[StaticVariables.dimMatrice-1][i] = 9;
				matrix[i][StaticVariables.dimMatrice-1] = 9;
				matrix[i][0] = 9;

		}
	}
	
	
	
	public int getValoreMatrice(int i, int j)
	{
		return matrix[i][j];
	}
	
	public void setValoreMatrice(int i, int j, int x)
	{
		matrix[i][j] = x;
	}
	
	
	public void print()
	{
		for(int i = 0; i < StaticVariables.dimMatrice; i++)
		{
			System.out.println();
			for(int j = 0; j < StaticVariables.dimMatrice; j++)
				System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
	
	public Matrice getMatrice() { return this;}
	

}
