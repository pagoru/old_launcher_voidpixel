package net.darkaqua.launcher;

import java.awt.EventQueue;

import net.darkaqua.voidpixel.launcher.CreateLauncher;

public class Launcher {
	
	public static void main(String[] args) throws Exception {
		
		EventQueue.invokeLater(new Runnable() {
			
			@SuppressWarnings("static-access")
			public void run() {

				CreateLauncher window = new CreateLauncher();
				window.frame.setVisible(true);
				
			}
		});
		
	}
	
}
