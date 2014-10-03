package net.darkaqua.launcher.util;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Basics {

	public static Image returnImage(String url){
		
		URL urlPng;
		try {
			urlPng = new URL(url);
			Image image = ImageIO.read(urlPng);
			return image;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
