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
	
	private static final int RECHTSBOVEN = 45;
	private static final int RECHTSONDER = 135;
	private static final int LINKSONDER = 225;
	private static final int LINKSBOVEN = 315;
	
	public Ball(PApplet app, int color) {
		this.app=app;
		this.color=color;
	}
	

	@Override
	public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
		for (GameObject g:collidedGameObjects) {
			if(g instanceof Board){				
				if(super.getDirection()==LINKSONDER){
					super.setDirection(LINKSBOVEN);
				}
				if(super.getDirection()==RECHTSONDER){
					super.setDirection(RECHTSBOVEN);
				}
			}
			if(g instanceof Brick){
				if(((Brick) g).getType()==Brick.EEN){
					((Brick) g).minType();
					System.out.println(((Brick) g).getType());
					g.setVisible(false);
					super.setDirection(calculateNewDirection(this,g));
				}
			}
		}
		
	}

	private int calculateNewDirection(Ball ball, GameObject g) {
		if(ball.getDirection()==RECHTSBOVEN){
			if(ball.getX()>=g.getX() && ball.getY()<=g.getY()+g.getHeight()){
				return RECHTSONDER;
			}
			else{
				return RECHTSONDER;
			}
		}
		return 180;
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
			if(super.getDirection()==RECHTSBOVEN){
				super.setDirection(LINKSBOVEN);
			}
			if(super.getDirection()==RECHTSONDER){
				super.setDirection(LINKSONDER);
			}
		}
		//bovenwand
		if(super.getY()<=0+super.getHeight()){
			if(super.getDirection()==LINKSBOVEN){
				super.setDirection(LINKSONDER);
			}
			if(super.getDirection()==RECHTSBOVEN){
				super.setDirection(RECHTSONDER);
			}
		}
		
		//linkerwand
		if(super.getX()<=0+super.getWidth()){
			if(super.getDirection()==LINKSBOVEN){
				super.setDirection(RECHTSBOVEN);
			}
			if(super.getDirection()==LINKSONDER){
				super.setDirection(RECHTSONDER);
			}
		}
		
	}
	
	@Override
	public void keyPressed(int keycode, char key){
		if(keycode==32){
			if(!isMoving){
				super.setDirection(RECHTSBOVEN);
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
