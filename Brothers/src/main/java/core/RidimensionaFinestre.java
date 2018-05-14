package core;

public class RidimensionaFinestre {
	
	
	public RidimensionaFinestre() {}
	
	public int pixelsCella(String s, int l)
	{
		int valore = 0;
		switch(s)
		{
		case("width"): valore = StaticVariables.screen_width/l; break;
		case("height"): valore = StaticVariables.screen_width/l; break;
		default: break;
		}
	  return valore;
	}

}