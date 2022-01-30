package com.aglistech.qrsignature;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.aglistech.qrsignature.generators.ImageGenerator;
import com.aglistech.qrsignature.model.User;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class MessageFrame {

	private JFrame frame;
	private JTextField messageField;
	private User user;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MessageFrame window = new MessageFrame();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public MessageFrame(User user) {
		this.user = user;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel messageLabel = new JLabel("Message");
		messageLabel.setBounds(12, 13, 56, 16);
		frame.getContentPane().add(messageLabel);
		
		messageField = new JTextField();
		messageField.setBounds(70, 10, 350, 22);
		frame.getContentPane().add(messageField);
		messageField.setColumns(10);
		
		JLabel lblDisplay = new JLabel("");
		lblDisplay.setBackground(Color.GRAY);
		lblDisplay.setBounds(22, 57, 398, 183);
		frame.getContentPane().add(lblDisplay);
		
		JButton btnGenerate = new JButton("GENERATE");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BufferedImage img;
				try {
					img = ImageGenerator.generateQRCodeImage(messageField.getText().toString());
					ImageIcon icon = new ImageIcon(img);
					lblDisplay.setIcon(icon);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGenerate.setBounds(158, 272, 97, 25);
		frame.getContentPane().add(btnGenerate);
	}
	
	public void showWindow(User user) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageFrame window = new MessageFrame(user);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
