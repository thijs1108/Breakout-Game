package nl.han.ica.breakout;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
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
	private Ball ball;
	private BrickMap brickmap;

	public static void main(String[] args) {
		PApplet.main(new String[]{"nl.han.ica.breakout.BreakoutWorld"});
	}

	@Override
	public void setupGame() {
		int worldWidth=1200;
        int worldHeight=900;
        int boardWidth=150;
        int boardHeight=20;
        
        createViewWithoutViewport(worldWidth, worldHeight);
        
        Sprite boardSprite = new Sprite("src/main/java/nl/han/ica/breakout/media/board.png");
        boardSprite.resize(boardWidth, boardHeight);
        board = new Board(this,boardSprite,1);
        addGameObject(board,worldWidth/2-boardWidth/2,worldHeight/8*7);
        ball = new Ball(this,0xFFFFFFFF);
        ball.setWidth(25);
        ball.setHeight(25);
        addGameObject(ball,worldWidth/2,worldHeight/8*7-50);
        brickmap=new BrickMap(this, 1);
        
      
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	private void createViewWithoutViewport(int screenWidth, int screenHeight) {
        View view = new View(screenWidth,screenHeight);
        view.setBackground(loadImage("src/main/java/nl/han/ica/breakout/media/background.jpg"));

        setView(view);
        size(screenWidth, screenHeight);
    }

}
