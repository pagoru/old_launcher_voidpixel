package net.darkaqua.launcher.j;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import net.darkaqua.launcher.listenerButtons;

public class Buttons {
	
	public static JButton btnExit = new JButton("Exit");
	public static JButton btnPlay = new JButton("Play");
	public static JButton btnVisitUsWebpage = new JButton("Visit our webpage...");
	
	public static void btnPlay() {
		
		btnPlay.setBounds(688, 406, 102, 24);
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlay.setFocusPainted(false);
		Panels.panelLauncher.add(btnPlay);
		
		listenerButtons.listenerBtnPlay();
		
	}
	
	public static void btnExit() {
		
		btnExit.setBounds(10, 406, 102, 24);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExit.setFocusPainted(false);
		Panels.panelLauncher.add(btnExit);
		
		listenerButtons.listenerBtnExit();
		
	}
	
	public static void btnVisitUsWebpage() {
		
		btnVisitUsWebpage.setHorizontalAlignment(SwingConstants.RIGHT);
		btnVisitUsWebpage.setForeground(Color.WHITE);
		btnVisitUsWebpage.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVisitUsWebpage.setFocusPainted(false);
		btnVisitUsWebpage.setContentAreaFilled(false);
		btnVisitUsWebpage.setBorderPainted(false);
		btnVisitUsWebpage.setBounds(607, 360, 163, 24);
		
		Panels.panelVersion.add(btnVisitUsWebpage);
		
		listenerButtons.listenerBtnVisitUsWebpage();
		
	}

}
