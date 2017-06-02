package dogfight.model;

public class Missile extends Mobile{
	
	private int SPEED = 4;
	private int WIDTH = 30;
	private static int HEIGHT = 10;
	private int MAX_DISTANCE_TRAVELED=1400;
	private static String Image="missile";
	private int distanceTraveled = 0;
	
	public Missile(DIrection direction, Dimension dimension){
		super(direction, null, dimension, HEIGHT, Image);
	}
	
	public int getWidthWithADirection(DIrection direction){
		return WIDTH;
	}
	
	public int getHeightWithADirection(DIrection direction){
		return HEIGHT;
	}
	
	public void move(){
		
	}
	
	public boolean isWeapon(){
		return false;
	}
	
}
