package gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	
	public static void applyModelToGraphics(Graphics graphics, ImageObserver observer){
		
	}
	
	public static int getGlobalWidth(){
		return 0;
	}
	
	public static int getGlobalHeight(){
		return 0;	
	}
}
