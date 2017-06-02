package dogfight.model;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

public interface IMobile {
	
	public static DIrection getDirection(){
		return null;
	}
	
	public static void setDirection(Dimension Dimension){
		
	}
	
	public static Point getPosition(){
		return null;
		
	}
	
	public static Dimension getDimension(){
		return null;
		
	}
	
	public static int getWidth(){
		return 0;
		
	}
	
	public static int getHeight(){
		return 0;
		
	}
	
	public static int getSpeed(){
		return 0;
		
	}
	
	public static Image getImage(){
		return null;
		
	}
	
	public static void move(){
		
	}
	
	public static void placeInArea(IArea area){
		
	}
	
	public static boolean isPlayer(int player){
		return false;
		
	}
	
	public static void setDogfightModel(DogFightModel degfightMode){
		
	}
	
	public static boolean hit(){
		return false;
	}
	
	public static boolean isWeapon(){
		return false;
	}
	
	
}
