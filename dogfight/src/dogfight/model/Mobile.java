package dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public abstract class Mobile extends Image implements IMobile{
	
	private int SPEED;
	private DIrection direction;
	private Image images;
	
	public int getSPEED() {
		return SPEED;
	}

	public void setSPEED(int sPEED) {
		SPEED = sPEED;
	}

	public Image getImages() {
		return images;
	}

	public void setImages(Image images) {
		this.images = images;
	}

	public Mobile(DIrection direction, Position position, Dimension dimension, int speed, String image){
		
	}
	
	public DIrection getDirection(){
		return direction;
	}
	
	public void setDirection(DIrection direction){
		this.direction = direction;
	}
	
	public Point getPosition(){
		return null;
	}
	
	public Dimension getDimension(){
		return null;
	}
	
	public int getSpeed(){
		return SPEED;	
	}
	
	public int getWidth(){
		return 0;
	}
	
	public int getHeight(){
		return 0;
	}
	
	public void move(){
		
	}
	
	public void PlaceInArea(IArea Area){
		
	}
	
	public boolean isPlayer(int player){
		return false;
		
	}
	
	private void moveUp(){
		
	}
	
	private void moveRight(){
		
	}
	
	private void moveDown(){
		
	}
	
	private void moveLeft(){
		
	}
	
	public Color getColor(){
		return null;
	}
	
	public IDogFightModel getDogFightModel(){
		return null;
	}
	
	public void setDogFightModel(IDogFightModel dogFightModel){
		
	}
	
	public boolean hit(){
		return false;
		
	}
	
	public boolean isWeapon(){
		return false;
	}
	
	public Image getImage(){
		return null;
	}
}
