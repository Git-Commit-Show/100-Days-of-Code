package com.aglistech.qrsignature;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.aglistech.qrsignature.daoImp.UserDaoImp;
import com.aglistech.qrsignature.model.User;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userIdTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					UserDaoImp userDaoImp = new UserDaoImp();
					int id = Integer.valueOf(userIdTextField.getText().toString());
					String key = passwordField.getText();
					
					User user = userDaoImp.getUser(id);
					if (userDaoImp.checkPassword(user, key)) {						
						MessageFrame messageFrame = new MessageFrame(user);
						messageFrame.showWindow(user);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnLogin.setBounds(74, 190, 151, 31);
		contentPane.add(btnLogin);
		
		JLabel userIdLabel = new JLabel("User Id");
		userIdLabel.setBounds(10, 11, 46, 14);
		contentPane.add(userIdLabel);
		
		userIdTextField = new JTextField();
		userIdTextField.setBounds(10, 36, 286, 36);
		contentPane.add(userIdTextField);
		userIdTextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 83, 46, 14);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 100, 286, 31);
		contentPane.add(passwordField);
	}
}
