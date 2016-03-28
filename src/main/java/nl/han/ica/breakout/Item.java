package nl.han.ica.breakout;

import java.util.ArrayList;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public class Item extends GameObject{

	private int type;
	private static ArrayList<Item> items = new ArrayList<Item>();
	
	public Item(int type,float x, float y, float width, float heigth){
		super(x,y,width,heigth);
		super.setDirection(180);
		super.setSpeed(5);
		this.type=type;
	}
	@Override
	public void update() {
		
	}

	@Override
	public void draw(PGraphics g) {
		g.fill(0xFFFFFF);
		g.ellipse(super.getX(),super.getY(), super.getWidth(),super.getHeight());
	}
	
	public static void addItem(Item item){
		items.add(item);
	}
	
	
}
