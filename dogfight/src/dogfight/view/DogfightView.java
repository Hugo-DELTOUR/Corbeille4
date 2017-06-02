package dogfight.view;

import java.util.Observable;

import dogfight.controller.IOrderPerformer;
import gameframe.GameFrame;

public abstract class DogfightView implements IViewSystem, Runnable{
	
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;
	
	public GameFrame getGameFrame() {
		return gameFrame;
	}

	public void setGameFrame(GameFrame gameFrame) {
		this.gameFrame = gameFrame;
	}

	public EventPerformer getEventPerformer() {
		return eventPerformer;
	}

	public void setEventPerformer(EventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}

	public GraphicsBuilder getGraphicsBuilder() {
		return graphicsBuilder;
	}

	public void setGraphicsBuilder(GraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}

	public DogfightView(IOrderPerformer orderPerformer, IDofightModel dogfightModel, Observable observable){
		
	}
	
	public void run(){
		
	}
	
	public displayMessage(String Message){
		
	}
	
	public void closeAll(){
		
	}
	
}
