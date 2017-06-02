package dogfight.model;

public class Plane extends Mobile{
	
	private int SPEED = 2;
	private int WIDTH = 100;
	private int HEIGHT = 30;
	private int player;
	
	public Plane(int player, DIrection direction, Position position, String image){
		super(direction, position, null, player, image);
	}
	
	public boolean isPlayer(int player){
		return false;
	}
	
	public boolean hit(){
		return false;
	}
}
