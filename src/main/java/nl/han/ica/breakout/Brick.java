package nl.han.ica.breakout;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PApplet;
import processing.core.PGraphics;

public class Brick extends GameObject{
	private int type;
	public static final int VERDWENEN = -1;
	public static final int EEN = 0;
	
	
	public Brick(int type,float x, float y, float breedte, float hoogte) {
		super(x,y,breedte,hoogte);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(PGraphics g) {
		g.fill(0xFFFFFFFF);
		g.stroke(2);
		g.rect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	public int getType(){
		return type;
	}
	public void minType(){
		type=type-1;
	}

}
