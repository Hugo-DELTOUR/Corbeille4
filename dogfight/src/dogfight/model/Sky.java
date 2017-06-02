package dogfight.model;

import java.awt.Image;

public abstract class Sky extends Image implements IArea {
	
	private Image images;
	
	public Image getImages() {
		return images;
	}

	public void setImages(Image images) {
		this.images = images;
	}

	public Sky(Dimension dimension){
		
	}

	@Override
	public java.awt.Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getIamge() {
		// TODO Auto-generated method stub
		return null;
	}
}
