package net.darkaqua.launcher.j;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;

public class CheckBoxes {
	
	public static JCheckBox chckbxRemember = new JCheckBox("Remember");

	public static void chckbxRemember() {
		
		chckbxRemember.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxRemember.setBackground(new Color(250, 250, 250));
		chckbxRemember.setBounds(580, 406, 102, 24);
		Panels.panelLauncher.add(chckbxRemember);
		
	}

}
