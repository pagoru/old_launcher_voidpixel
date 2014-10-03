package net.darkaqua.launcher;

import java.awt.EventQueue;

public class Launcher {
	
	public static void main(String[] args) throws Exception {
		
		EventQueue.invokeLater(new Runnable() {
			
			@SuppressWarnings("static-access")
			public void run() {

				CreateLauncher window;
				try {
					window = new CreateLauncher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
	}
	
}
