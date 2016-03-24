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
			bricks.add(new Brick(Brick.EEN, 200, 200, 500, 500));
		}
		return bricks;
	}
	
	

}
