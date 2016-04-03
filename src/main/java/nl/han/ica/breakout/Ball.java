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
	private BreakoutWorld world;
	
	private static final int RECHTSBOVEN = 45;
	private static final int RECHTSONDER = 135;
	private static final int LINKSONDER = 225;
	private static final int LINKSBOVEN = 315;
	
	public Ball(BreakoutWorld world,PApplet app, int color) {
		this.world=world;
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
					world.deleteGameObject(g);
					super.setDirection(calculateNewDirection(this,g));
					world.increaseBricksPopped();
					if(((Brick) g).getItem()==Brick.FASTERBALL){
						world.addPowerup(new PowerUp(Brick.FASTERBALL, this.getX()+this.getWidth()/2, this.getY(), 10, 10));
					}
				}
			}
		}
		
	}

	private int calculateNewDirection(Ball ball, GameObject g) {
		
		if(ball.getDirection()==RECHTSBOVEN){
			if(ball.getX()>=g.getX() && ball.getY()<=g.getY()+g.getHeight())return RECHTSONDER;
			else return LINKSBOVEN;
		}
		if(ball.getDirection()==LINKSBOVEN)
			if(ball.getX()>=g.getX() && ball.getY()>=g.getY()+g.getHeight()) return RECHTSONDER;
			else return LINKSONDER;
		
		if(ball.getDirection()==RECHTSONDER)
			if(ball.getX()<=g.getX() && ball.getY()<=g.getY()+g.getHeight()) return LINKSONDER;
			else return RECHTSBOVEN;
		
		if(ball.getDirection()==LINKSONDER)
			if(ball.getX()>=g.getX()+g.getWidth()+1) return RECHTSONDER;
			else return LINKSBOVEN;
		return RECHTSBOVEN;
	}


	@Override
	public void draw(PGraphics g) {
		g.fill(color);
		g.noStroke();
		g.smooth();
		g.ellipseMode(g.CORNER);
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
		if(super.getY()>=world.displayHeight){
			world.decreaseLevens();
			super.setSpeed(0);
			isMoving=false;
			super.setX(world.getWidth()/2);
			super.setY(world.getHeight()/8*6-50);
			
		}
		
	}
	
	@Override
	public void keyPressed(int keycode, char key){
		if(keycode==32){
			if(!isMoving && world.dead==false){
				super.setSpeed(7);
				isMoving = true;
				super.setDirection(RECHTSBOVEN);
			}
			else{
				super.setSpeed(0);
				isMoving = false;
			}
			
		}
	}

}
