package dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Observable;

public class DogFightModel extends Observable implements IDogFightModel {
	
	private Sky sky;
	
	public DogFightModel(){
		
	}
	
	public Sky getSky() {
		return sky;
	}

	public void setSky(Sky sky) {
		this.sky = sky;
	}

	public IArea getArea(){
		return null;
		
	}
	
	public void buildArea(Dimension dimension){
		
	}
	
	public void addModel(IMobile Mobile){
		
	}
	
	public void removeMobile(IMobile Mobile){
		
	}
	
	public ArrayList<IMobile> getMobile(){
		return null;
		
	}
	
	public IMobile getMobileByPlayer(int player){
		return null;
		
	}
	
	public void setMobilesHavesMoved(){
		
	}
	
}
