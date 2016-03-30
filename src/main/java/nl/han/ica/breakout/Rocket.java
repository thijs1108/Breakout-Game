package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;

public class Rocket extends AchtergrondObject{

	private BreakoutWorld world;
	int ySpeed=-1;
	
	public Rocket(BreakoutWorld world) {
		this(new Sprite("src/main/java/nl/han/ica/breakout/media/rocket.png"));
		this.world=world;
	}
	private Rocket(Sprite sprite) {
        super(sprite,50,50);
    }

	@Override
	public void update() {
		
	}
	public void setSpeed(){
		setySpeed(ySpeed);
	}
	
}
