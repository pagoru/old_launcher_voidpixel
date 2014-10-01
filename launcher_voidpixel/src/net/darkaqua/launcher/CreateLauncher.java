package net.darkaqua.launcher;

import javax.swing.JFrame;

import net.darkaqua.launcher.j.Buttons;
import net.darkaqua.launcher.j.CheckBoxes;
import net.darkaqua.launcher.j.Fields;
import net.darkaqua.launcher.j.Frames;
import net.darkaqua.launcher.j.Panels;

public class CreateLauncher {

	public static JFrame frame  = new JFrame();
	
	public CreateLauncher() {
		
		Frames.principalFrame();
		
		Panels.panelLauncher();
		Panels.panelVersion();
		
		Fields.textFieldUser();
		Fields.textFieldPassword();
		CheckBoxes.chckbxRemember();
		
		Buttons.btnRemember();
		Buttons.btnPlay();
		Buttons.btnExit();
		
	}
}