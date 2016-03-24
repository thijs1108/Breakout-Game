package nl.han.ica.breakout;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PApplet;
import processing.core.PGraphics;

public class Brick extends GameObject{
	private PApplet app;
	private int kleur;
	
	public Brick(PApplet app, float x, float y, float breedte, float hoogte, int kleur) {
		super(x,y,breedte,hoogte);
		this.app=app;
		this.kleur=kleur;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(PGraphics g) {
		// TODO Auto-generated method stub
		
	}

}
