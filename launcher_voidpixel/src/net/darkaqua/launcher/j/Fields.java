package net.darkaqua.launcher.j;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Fields {
	
	public static JTextField textFieldUser = new JTextField();
	public static JPasswordField textFieldPassword = new JPasswordField();

	public static void textFieldUser() {
		
		textFieldUser.setColumns(10);
		textFieldUser.setBounds(288, 406, 102, 24);
		Panels.panelLauncher.add(textFieldUser);
		
	}
	
	public static void textFieldPassword() {
		
		textFieldPassword.setBounds(400, 406, 102, 24);
		Panels.panelLauncher.add(textFieldPassword);
		
	}

}
