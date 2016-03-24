package nl.han.ica.breakout;
import java.util.ArrayList;
import processing.core.PApplet;

public class BrickMap{
	private Brick brick;
	private ArrayList<Brick> bricks;
	private int level;
	
	public BrickMap(int level) {
		this.level=level;
	}
	
	public ArrayList<Brick> getBricks(){
		if(level==1) {
			bricks = new ArrayList<>();
			for(int i=0; i<7; i++) {
				for(int j=0; j<4; j++) {
				bricks.add(new Brick(Brick.EEN, i*125, j*40, (i+1)*125, (j+1)*40));
				
				}
			}
		}
		return bricks;
	}
	
	

}
