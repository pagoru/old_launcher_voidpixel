package net.darkaqua.voidpixel.launcher.j;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import net.darkaqua.voidpixel.launcher.listenerButtons;

public class Buttons {
	
	public static JButton btnExit = new JButton("Exit");
	public static JButton btnPlay = new JButton("Play");
	public static JButton btnRemember = new JButton("Forgot password?");

	public static void btnRemember() {
		
		btnRemember.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRemember.setForeground(new Color(0, 102, 204));
		
		btnRemember.setBorderPainted(false);
		btnRemember.setFocusPainted(false);
		btnRemember.setContentAreaFilled(false);
		
		btnRemember.setBounds(220, 406, 130, 24);
		Panels.panelLauncher.add(btnRemember);
		
		listenerButtons.listenerBtnRemember();
		
	}
	
	public static void btnPlay() {
		
		btnPlay.setBounds(688, 406, 102, 24);
		Panels.panelLauncher.add(btnPlay);
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlay.setFocusPainted(false);
		
		listenerButtons.listenerBtnPlay();
		
	}
	
	public static void btnExit() {
		
		btnExit.setBounds(10, 406, 102, 24);
		Panels.panelLauncher.add(btnExit);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExit.setFocusPainted(false);
		
		listenerButtons.listenerBtnExit();
		
	}

}
