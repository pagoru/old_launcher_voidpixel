package net.darkaqua.voidpixel.launcher;

import javax.swing.JFrame;

import net.darkaqua.voidpixel.launcher.j.Buttons;
import net.darkaqua.voidpixel.launcher.j.CheckBoxes;
import net.darkaqua.voidpixel.launcher.j.Fields;
import net.darkaqua.voidpixel.launcher.j.Frames;
import net.darkaqua.voidpixel.launcher.j.Panels;

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