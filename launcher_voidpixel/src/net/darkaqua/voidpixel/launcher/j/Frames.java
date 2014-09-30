package net.darkaqua.voidpixel.launcher.j;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

import net.darkaqua.voidpixel.launcher.CreateLauncher;

public class Frames {
	
	public static int windowHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	public static int windowWidht = Toolkit.getDefaultToolkit().getScreenSize().width;
	
	public static int launcherHeight = 440;
	public static int launcherWidth = 800;
	
	public static void principalFrame() {
		
		CreateLauncher.frame.getContentPane().setBackground(new Color(250, 250, 250));
		
		CreateLauncher.frame.setUndecorated(true);
		
		CreateLauncher.frame.setBounds((windowWidht / 2) - (launcherWidth / 2), (windowHeight / 2) -  (launcherHeight / 2), launcherWidth , launcherHeight);
		CreateLauncher.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
