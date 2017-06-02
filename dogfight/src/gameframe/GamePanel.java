package gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public abstract class GamePanel extends JPanel implements Observer{
	
	public GamePanel(IGraphicsBuilder graphicsBuilder){
		
	}
	
	public update(Observable observable){
		
	}
	
	public void paintComponent(Graphics graphic){
		
	}
}
