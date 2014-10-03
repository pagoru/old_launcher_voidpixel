package net.darkaqua.launcher;

import javax.swing.JFrame;

import net.darkaqua.launcher.j.Buttons;
import net.darkaqua.launcher.j.CheckBoxes;
import net.darkaqua.launcher.j.Fields;
import net.darkaqua.launcher.j.Frames;
import net.darkaqua.launcher.j.Labels;
import net.darkaqua.launcher.j.Panels;

public class CreateLauncher {

	public static JFrame frame  = new JFrame();
	
	public CreateLauncher() throws Exception {
		
		Frames.principalFrame();
		
		Panels.panelLauncher();
		Panels.panelVersion();
		
		Labels.principalFrame();
		
		Fields.textFieldUser();
		Fields.textFieldPassword();
		CheckBoxes.chckbxRemember();
		
		Buttons.btnPlay();
		Buttons.btnExit();
		Buttons.btnVisitUsWebpage();
		
	}
}