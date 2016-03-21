package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.TextObject;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class BreakoutWorld extends GameEngine{
	
	private Sound sound;
	private Sound popsound;
	private TextObject dashboardText;
	private int bricksPopped;
	private Board board;

	public static void main(String[] args) {
		PApplet.main(new String[]{"nl.han.ica.breakout.BreakoutWorld"});
	}

	@Override
	public void setupGame() {
		int worldWidth=1204;
        int worldHeight=903;
        //createViewWithoutViewport(worldWidth, worldHeight);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	/*private void createViewWithoutViewport(int screenWidth, int screenHeight) {
        View view = new View(screenWidth,screenHeight);
        view.setBackground(loadImage("src/main/java/nl/han/ica/breakout/media/background.jpg"));

        setView(view);
        size(screenWidth, screenHeight);
    }*/

}
