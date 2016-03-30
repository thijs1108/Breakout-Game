package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public class LifeTextObject extends GameObject {
	private String text;

	public LifeTextObject(String text) {
		this.text = text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(PGraphics g) {
		g.textAlign(g.LEFT, g.TOP);
		g.textSize(50);
		g.text(text, getX(), getY());
	}
}
