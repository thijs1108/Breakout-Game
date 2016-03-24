package nl.han.ica.breakout;
import java.util.ArrayList;
import processing.core.PApplet;

public class BrickMap extends BreakoutWorld {
	private Brick brick;
	private PApplet app;
	private ArrayList<Brick> bricks;
	
	public BrickMap(PApplet app,int level) {
		this.app=app;
		if(level==1) {
			bricks = new ArrayList<>();
			bricks.add(new Brick(app, 600, 450, 50, 100, 0xFFFFFFFF));
		}
		for(Brick b: bricks) {
			addGameObject(b);
			
		}
	}
	
	
	
	
	

}
