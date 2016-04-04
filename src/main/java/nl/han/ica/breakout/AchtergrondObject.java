/**
* AchtergrondObject
* Deze abstracte klasse dient als superklasse voor de klasses Ufo en Rocket.
*/

package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;

public abstract class AchtergrondObject extends AnimatedSpriteObject {
	
	public AchtergrondObject(Sprite sprite, int width, int heigth) {
		super(sprite, 1);
		sprite.resize(width, heigth);

	}

	public abstract void setSpeed();
}
