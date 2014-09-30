package net.darkaqua.voidpixel.launcher;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import net.darkaqua.voidpixel.launcher.j.Buttons;

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
						
						Runtime.getRuntime().exec("java -jar C:\\Users\\Pablo\\Desktop\\pxl.jar -Djava.library.path=C:/");
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
