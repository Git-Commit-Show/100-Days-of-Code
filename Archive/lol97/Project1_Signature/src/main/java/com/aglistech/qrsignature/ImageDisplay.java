package com.aglistech.qrsignature;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.aglistech.qrsignature.generators.ImageGenerator;

public class ImageDisplay {
	
//	public static void main(String[] args) {
//		String message = "Hallo";
//		try {
//			BufferedImage img = ImageGenerator.generateQRCodeImage(message);
//			ImageIcon icon = new ImageIcon(img);
//			JFrame frame = new JFrame();
//			frame.setLayout(new FlowLayout());
//			frame.setSize(200,300);
//			JLabel label = new JLabel();
//			label.setIcon(icon);
//			frame.add(label);
//			frame.setVisible(true);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public void showQR(String message) {
		try {
			BufferedImage img = ImageGenerator.generateQRCodeImage(message);
			ImageIcon icon = new ImageIcon(img);
			JFrame frame = new JFrame();
			frame.setLayout(new FlowLayout());
			frame.setSize(200,300);
			JLabel label = new JLabel();
			label.setIcon(icon);
			frame.add(label);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
