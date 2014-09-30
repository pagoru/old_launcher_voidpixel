package net.darkaqua.voidpixel.launcher.j;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Fields {
	
	public static JTextField textFieldUser = new JTextField();
	public static JPasswordField textFieldPassword = new JPasswordField();

	public static void textFieldUser() {
		
		textFieldUser.setColumns(10);
		textFieldUser.setBounds(360, 406, 102, 24);
		Panels.panelLauncher.add(textFieldUser);
		
	}
	
	public static void textFieldPassword() {
		
		textFieldPassword.setBounds(472, 406, 102, 23);
		Panels.panelLauncher.add(textFieldPassword);
		
	}

}
