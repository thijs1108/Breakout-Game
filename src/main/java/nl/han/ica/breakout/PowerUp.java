/**
* Powerup
* In deze klasse wordt de powerup getekend. Deze kan vrij komen op het moment dat de Ball een Brick raakt.
*/

package nl.han.ica.breakout;

import java.util.ArrayList;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public class PowerUp extends GameObject{

	private int type;
	
	public PowerUp(int type,float x, float y, float width, float heigth){
		super(x,y,width,heigth);
		super.setDirection(180);
		super.setSpeed(5);
		this.type=type;
	}
	@Override
	public void update() {
		
	}

	@Override
	public void draw(PGraphics g) {
		g.fill(0xFFFFFFFF);
		g.ellipse(super.getX(),super.getY(), super.getWidth(),super.getHeight());
	}
	
	
}
