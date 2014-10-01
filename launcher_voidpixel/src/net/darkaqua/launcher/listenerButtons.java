package net.darkaqua.launcher;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import net.darkaqua.launcher.j.Buttons;

public class listenerButtons {
	
	public static void listenerBtnExit() {
		
		Buttons.btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(Buttons.btnExit.getModel().isEnabled()){
					
					CreateLauncher.frame.dispose();
					
				}
				
			}
			
		});
		
	}
	
	public static void listenerBtnPlay() {
		
		Buttons.btnPlay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(Buttons.btnPlay.getModel().isEnabled()){
					
					try {
						
						CreateLauncher.frame.dispose();
						
						File  f = new File(System.getProperty("user.home") + "\\Documents\\VoidPixel\\bin");
						f.mkdirs();
						
						Runtime.getRuntime().exec("java -Djava.library.path=" + System.getProperty("user.home") 
								+ "\\Documents\\VoidPixel\\libs\\natives\\win; -jar " 
								+ System.getProperty("user.home") + "\\Documents\\VoidPixel\\voidpixel.jar");
						
//						new Game();
						
					} catch (Exception e) {
						
						e.printStackTrace();
						
					}
					
				}
				
			}
			
		});
		
	}
	
	public static void listenerBtnRemember() {
		
		Buttons.btnRemember.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Desktop.getDesktop().browse(new URL("http://www.darkaqua.net/").toURI());
					
				} catch (IOException | URISyntaxException e1) {
					
					e1.printStackTrace();
					
				}
				
			}
		});
		
	}

}
