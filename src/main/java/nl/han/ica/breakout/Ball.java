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
		for (GameObject g:collidedGameObjects) {
			if(g instanceof Board){				
				if(super.getDirection()==225){
					super.setDirection(315);
				}
				if(super.getDirection()==135){
					super.setDirection(45);
				}
			}
			if(g instanceof Brick){
				if(((Brick) g).getType()==0){
					((Brick) g).minType();
					g.setVisible(false);
					System.out.println("geraakt");
				}
			}
		}
		
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
		//rechterwand
		if(super.getX()>=app.getWidth()-super.getWidth()){
			if(super.getDirection()==45){
				super.setDirection(315);
			}
			if(super.getDirection()==135){
				super.setDirection(225);
			}
		}
		//bovenwand
		if(super.getY()<=0+super.getHeight()){
			if(super.getDirection()==315){
				super.setDirection(225);
			}
			if(super.getDirection()==45){
				super.setDirection(135);
			}
		}
		
		//linkerwand
		if(super.getX()<=0+super.getWidth()){
			if(super.getDirection()==315){
				super.setDirection(45);
			}
			if(super.getDirection()==225){
				super.setDirection(135);
			}
		}
		
	}
	
	@Override
	public void keyPressed(int keycode, char key){
		if(keycode==32){
			if(!isMoving){
				super.setDirection(45   );
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
