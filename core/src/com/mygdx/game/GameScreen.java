package com.mygdx.game;

import org.usb4java.Device;

import com.badlogic.gdx.ScreenAdapter;

public class GameScreen extends ScreenAdapter{
	private PracticumGame practicumGame;
	public static McuWithPeriBoard peri;
	

	public GameScreen(PracticumGame practicumGame) {
	   this.practicumGame = practicumGame;	
	   McuBoard.initUsb();
	   Device[] devices = McuBoard.findBoards();
	   peri = new McuWithPeriBoard(devices[0]);
	}
	
	 @Override
	public void render(float delta) {
		 boolean sw = peri.getSwitch();
		 if(sw)
		 System.out.println("Hello " + delta);
	}
}

