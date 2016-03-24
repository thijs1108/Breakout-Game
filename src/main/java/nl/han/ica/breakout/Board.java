package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.UserInput.IMouseInput;

public class Board extends AnimatedSpriteObject{

	public Board(Sprite sprite, int totalFrames) {
		super(sprite, totalFrames);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseClicked(){
		System.out.print("hallo");
	}

}
