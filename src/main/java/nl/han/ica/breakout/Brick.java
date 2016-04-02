package nl.han.ica.breakout;
import java.util.Random;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public class Brick extends GameObject{
	private int type;
	private int item;
	private int brickKleurNr;  
	private int brickKleur;

	public static final int VERDWENEN = -1;
	public static final int EEN = 0;
	public static final int NOITEM = 0;
	public static final int FASTERBALL = 1;
	public static final int SLOWERBALL = 2;
	
	
	public Brick(int type,int item, float x, float y, float breedte, float hoogte) {
		super(x,y,breedte,hoogte);
		this.type = type;
		this.item = item;
		Random random = new Random();
		brickKleurNr=random.nextInt(3);
		if(brickKleurNr==0) {
			brickKleur= 25;
		}
		else if(brickKleurNr==1) {
			brickKleur= 150;
		}
		else if(brickKleurNr==2) {
			brickKleur= 75;
		}
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(PGraphics g) {
		g.fill(brickKleur);
		g.stroke(2);
		g.rect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	
	public int getType(){
		return type;
	}
	
	public void minType(){
		type=type-1;
	}
	
	public int getItem() {
		return item;
	}
	
	public void setItem(int item) {
		this.item = item;
	}

}
