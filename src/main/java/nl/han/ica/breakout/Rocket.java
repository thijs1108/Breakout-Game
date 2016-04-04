/**
* Rocket
* De rocket is een gameObject. Deze beweegt op de achtergrond van het spel. Deze heeft geen collusion met andere gameObjecten. Deze rocket 
* beweegt van onderaan het scherm naar boven. Deze y speed wordt in deze klasse geregeld. 
*/

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
