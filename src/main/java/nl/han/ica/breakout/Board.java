package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.UserInput.IMouseInput;
import processing.core.PApplet;

public class Board extends AnimatedSpriteObject implements IMouseInput{
	
	private PApplet game;

	public Board(PApplet game, Sprite sprite, int totalFrames) {
		super(sprite, totalFrames);
		this.game=game;
	}


	@Override
	public void update() {
		if(super.getX()<=0){
			super.setX(0);
		}
		if(super.getX()>=game.getWidth()-width){
			super.setX(game.getWidth()-width);
		}
		
	}
	
	@Override
	public void mouseMoved(int x, int y){
		super.setX(x-super.getWidth()/2);
	}
	
}
