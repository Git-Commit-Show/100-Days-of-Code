package chapter2.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class DokumenCharPlotter {
	private final JFileChooser openFileChooser;

	private JFrame frame;
	private JTextField textFieldFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DokumenCharPlotter window = new DokumenCharPlotter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DokumenCharPlotter() {
		initialize();

		openFileChooser = new JFileChooser();
		openFileChooser.setCurrentDirectory(new File("C:\\Users\\SufyanSaori\\Documents"));
		openFileChooser.setFileFilter(new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel fileLabel = new JLabel("File Name");
		fileLabel.setBounds(10, 11, 62, 14);
		frame.getContentPane().add(fileLabel);

		textFieldFileName = new JTextField();
		textFieldFileName.setEditable(false);
		textFieldFileName.setBounds(78, 8, 244, 20);
		frame.getContentPane().add(textFieldFileName);
		textFieldFileName.setColumns(10);

		JButton openFile = new JButton("Open File");
		openFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnValue = openFileChooser.showOpenDialog(frame);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File file = openFileChooser.getSelectedFile();
					try {
						BufferedReader in = new BufferedReader(new FileReader(file));
						String line;
						HashMap<Character, Integer> dataMap = new HashMap<Character, Integer>();
						while ((line = in.readLine()) != null) {
							dataMap = countCharEachByString(line, dataMap);
						}
						in.close();
						System.out.println(dataMap);
					} catch (IOException ex) {
						// TODO: handle exception
					}
				} else {
					textFieldFileName.setText("No File Choosen!");
				}
			}
		});
		
		openFile.setBounds(332, 7, 89, 23);
		frame.getContentPane().add(openFile);
	}

	public static HashMap<Character, Integer> countCharEachByString(String text, HashMap<Character, Integer> dataMap) {
		for (int i = 0; i < text.length(); i++) {
			char data = text.charAt(i);
			Integer counter = dataMap.get(data);
			if (counter == null) {
				dataMap.put(data, 1);
			} else {
				dataMap.put(data, counter.intValue() + 1);
			}

		}
		return dataMap;
	}
}
