package nl.han.ica.breakout;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.UserInput.IKeyInput;
import processing.core.PApplet;
import processing.core.PGraphics;
import java.util.List;
import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithGameObjects;

public class Ball extends GameObject implements ICollidableWithGameObjects, IKeyInput{
	
	private PApplet app;
	private int color;
	private boolean isMoving = false;
	
	public Ball(PApplet app, int color) {
		this.app=app;
		this.color=color;
	}
	

	@Override
	public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(PGraphics g) {
		g.fill(color);
		g.noStroke();
		g.smooth();
		g.ellipse(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(int keycode, char key){
		if(keycode==32){
			if(!isMoving){
				super.setDirection(45);
				super.setSpeed(5);
				isMoving = true;
			}
			else{
				super.setSpeed(0);
				isMoving = false;
			}
			
		}
	}

}
