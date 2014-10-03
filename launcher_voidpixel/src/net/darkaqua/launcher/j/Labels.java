package net.darkaqua.launcher.j;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import net.darkaqua.launcher.util.Basics;

public class Labels {
	
	public static JLabel lblNews = new JLabel(new ImageIcon(Basics.returnImage("http://www.darkaqua.net/assets/News.png")));	
	
	public static void principalFrame() throws Exception {
		
		lblNews.setBounds(10, 11, 760, 373);
		Panels.panelVersion.add(lblNews);
		
	}

}
