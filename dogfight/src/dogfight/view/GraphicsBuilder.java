package dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import dogfight.model.IDogFightModel;
import dogfight.model.IMobile;
import gameframe.IGraphicsBuilder;

public abstract class GraphicsBuilder implements IGraphicsBuilder{
	
	private BufferedImage emptySky;
	private IDogFightModel dogfightModel;
	
	public BufferedImage getEmptySky() {
		return emptySky;
	}

	public void setEmptySky(BufferedImage emptySky) {
		this.emptySky = emptySky;
	}

	public IDogFightModel getDogfightModel() {
		return dogfightModel;
	}

	public void setDogfightModel(IDogFightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	public GraphicsBuilder(IDogFightModel dogfightModel){
		
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer){
		
	}
	
	private void buidlEmptySky(){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}
	
	public int getGlobalWidth(){
		return 0;
	}
	
	public int getGlobalHeight(){
		return 0;
	}
}
