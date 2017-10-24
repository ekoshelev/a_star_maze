

import java.awt.Graphics;
import java.awt.Image;

public class BadGuy {
	
	Image myImage;
	int x=0,y=0;
	boolean hasPath=false;

	public BadGuy( Image i ) {
		myImage=i;
		x = 30;
		y = 10;
	}
	
	public void hasPath(){
		hasPath=true;
	}
	
	public void reCalcPath(boolean map[][],int targx, int targy) {
		// TO DO: calculate A* path to targx,targy, taking account of walls defined in map[][]
		
	}
	
	public void move(boolean map[][],int targx, int targy) {
		if (hasPath) {
			// TO DO: follow A* path, if we have one defined
			x=targx;
			y=targy;
		}
		else {
			// no path known, so just do a dumb 'run towards' behaviour
			int newx=x, newy=y;
			if (targx<x)
				newx--;
			else if (targx>x)
				newx++;
			if (targy<y)
				newy--;
			else if (targy>y)
				newy++;
			if (!map[newx][newy]) {
				x=newx;
				y=newy;
			}
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(myImage, x*20, y*20, null);
	}
	
}
