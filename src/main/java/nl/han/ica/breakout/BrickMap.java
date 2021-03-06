package nl.han.ica.breakout;
import java.util.ArrayList;

public class BrickMap{
	private ArrayList<Brick> bricks;
	private int level;
	
	public BrickMap(int level) {
		this.level=level;
	}
	
	public ArrayList<Brick> getBricks(){
		if(level==1) {
			bricks = new ArrayList<>();
			for(int i=1; i<7; i++) {
				for(int j=1; j<8; j++) {
					bricks.add(new Brick(Brick.EEN, Brick.NOITEM,i*125+100, j*40+45, 75, 30));
				}
			}
		}
		int i = 0;
		for(Brick b: bricks){
			if(i==20 || i == 25 || i == 30){
				b.setItem(Brick.FASTERBALL);
			}
			i++;
		}
		return bricks;
	}
	
	

}
