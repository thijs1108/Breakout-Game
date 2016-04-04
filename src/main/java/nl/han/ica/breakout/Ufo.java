/**
* Ufo
* De ufo is een gameObject. Deze beweegt op de achtergrond van het spel. Deze heeft geen collusion met andere gameObjecten. Deze ufo 
* beweegt van onderaan het scherm naar boven. Deze y speed wordt in deze klasse geregeld. 
*/

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
