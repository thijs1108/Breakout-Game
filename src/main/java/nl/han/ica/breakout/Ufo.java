package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;

public class Ufo extends AchtergrondObject{

	private BreakoutWorld world;
	private int ySpeed=-1;
	
	public Ufo(BreakoutWorld world) {
		this(new Sprite("src/main/java/nl/han/ica/breakout/media/ufo.png"));
		this.world=world;
	}
	private Ufo(Sprite sprite) {
        super(sprite,50,50);
    }

	@Override
	public void update() {
		
	}
	
	public void setSpeed(){
		setySpeed(ySpeed);
	}
	
}
