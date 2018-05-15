package land;

import java.awt.Image;
import java.awt.Point;

public class CellType {
		private Point p;
		private Image image = null;
		
		public CellType(Point _p,Image img){
			p=_p;
			image = img;
		}
		
		public Point getPoint(){
			return p;
		}
		public int getX(){
			return p.x;
		}
		public int getY(){
			return p.y;
		}
		public Image getImage(){
			return image;
		}
		
		@Override
		public boolean equals(Object obj) {
			CellType c = (CellType)obj;
			return ((p.x==c.p.x)&&(p.y==c.p.y));
		}
}
