package risk.controller;

import risk.view.*;
import risk.model.*;
import risk.controller.*;
import java.util.Scanner;

public class RiskController
{
	private RiskDisplay display;
	private Risk risk;
	private RiskFrame appFrame;
	
	public RiskController()
	{
		display = new RiskDisplay();
		appFrame = new RiskFrame(this);
	}
	
	public void start()
	{
		display.displayText("Welcome Conqueror");
	}
	
	public void story()
	{
		System.out.println("Welcome to this faboulus adventure");
		int GameScene = 0;
		
		if (GameScene = 0)
		{
			System.out.println("You command a troop of 10 soldiers with 20 rations");
			
			
		}
		else if(GameScene = 1)
		{
			
		}
	}
	
	public Risk getRisk()
	{
		return risk;
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
	
	public RiskDisplay getDisplay()
	{
		return display;
	}
	
	public void handleErrors(Exception error)
	{
		display.displayText(error.getMessage());
	}
	

	
	
}
