package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;

public class Rocket extends AchtergrondObject{

	private BreakoutWorld world;
	
	public Rocket(BreakoutWorld world) {
		this(new Sprite("src/main/java/nl/han/ica/breakout/media/rocket.png"),-1);
		this.world=world;
	}
	private Rocket(Sprite sprite,int ySpeed) {
        super(sprite,50,50);
        setySpeed(ySpeed);
    }

	@Override
	public void update() {
		
	}
	
}
