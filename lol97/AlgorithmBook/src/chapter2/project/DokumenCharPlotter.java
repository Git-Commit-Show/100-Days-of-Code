package chapter2.project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BorderFactory;
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
		
		XYDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        ChartFrame chartFrame = new ChartFrame("heheh", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(300, 400);

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
	
	private XYDataset createDataset() {

        XYSeries series1 = new XYSeries("2014");
        series1.add(18, 530);
        series1.add(20, 580);
        series1.add(25, 740);
        series1.add(30, 901);
        series1.add(40, 1300);
        series1.add(50, 2219);

        XYSeries series2 = new XYSeries("2016");
        series2.add(18, 567);
        series2.add(20, 612);
        series2.add(25, 800);
        series2.add(30, 980);
        series2.add(40, 1210);
        series2.add(50, 2350);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);

        return dataset;
    }

    private JFreeChart createChart(final XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Average salary per age",
                "Age",
                "Salary (€)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Average Salary per Age",
                        new Font("Serif", Font.BOLD, 18)
                )
        );

        return chart;
    }
}
