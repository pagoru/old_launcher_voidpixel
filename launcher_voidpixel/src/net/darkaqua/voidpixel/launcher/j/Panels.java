package net.darkaqua.voidpixel.launcher.j;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JPanel;

import net.darkaqua.voidpixel.launcher.CreateLauncher;

public class Panels {
	
	public static Panel panelLauncher = new Panel();
	public static JPanel panelVersion = new JPanel();

	public static void panelLauncher() {
		
		CreateLauncher.frame.getContentPane().add(panelLauncher, BorderLayout.CENTER);
		panelLauncher.setLayout(null);
		
	}
	
	public static void panelVersion() {
		
		panelVersion.setBorder(null);
		panelVersion.setForeground(Color.WHITE);
		panelVersion.setBackground(new Color(49, 127, 187));
		panelVersion.setBounds(10, 0, 780, 395);
		Panels.panelLauncher.add(panelVersion);
		panelVersion.setLayout(null);
		
	}

}
