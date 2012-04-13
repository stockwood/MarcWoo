package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Canvas;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

import app.SimLoop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	int x,y;
	int canvasSizeX,canvasSizeY;
	SimLoop simloop;
	Canvas canvas;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SimFrame2 frame = new SimFrame2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
	/**
	 * Create the frame.
	 */
	public SimFrame2(int width,int height,SimLoop sm) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		canvas = new Canvas();
		
		setVisible(true);
		simloop = sm;
		x = width;
		y = height;
		canvasSizeX = (int)(x-350);
		canvasSizeY = (int)(y-150);

		canvas.setSize(canvasSizeX,canvasSizeY);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar, BorderLayout.WEST);
		
		JButton start_B = new JButton("");
		start_B.setToolTipText("Simulation starten");
		start_B.setIcon(new ImageIcon(SimFrame2.class.getResource("/gui/graphics/run.png")));
		toolBar.add(start_B);
		ActionListener actionListenerStart = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				simloop.run();
			}
		};
		start_B.addActionListener(actionListenerStart);
	
		
		
		JButton pause_B = new JButton("");
		pause_B.setToolTipText("Simulation pausieren");
		toolBar.add(pause_B);
		pause_B.setVerticalAlignment(SwingConstants.TOP);
		pause_B.setIcon(new ImageIcon(SimFrame2.class.getResource("/gui/graphics/pause.png")));
		ActionListener actionListenerPause = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				simloop.pause();
			}
		};
		pause_B.addActionListener(actionListenerPause);
		
		
		
		JButton reset_b = new JButton("");
		reset_b.setToolTipText("Simulation zur\u00FCcksetzen");
		toolBar.add(reset_b);
		reset_b.setIcon(new ImageIcon(SimFrame2.class.getResource("/gui/graphics/reset.png")));
		reset_b.setVerticalAlignment(SwingConstants.TOP);
		ActionListener actionListenerReset = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
			}
		};
		reset_b.addActionListener(actionListenerReset);
		
		
		
		JPanel panel_12 = new JPanel();
		contentPane.add(panel_12, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		panel_12.add(panel);
		panel.setLayout(new GridLayout(9, 5, 5, 5));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 2, 5, 5));
		
		JLabel label_3 = new JLabel("");
		panel_5.add(label_3);
		
		JLabel label_4 = new JLabel("");
		panel_5.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("Position");
		panel_5.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		panel_5.add(label);
		
		textField_1 = new JTextField();
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_5.add(textField_3);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 2, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Speed");
		panel_6.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("");
		panel_6.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_6.add(textField_4);
		
		JLabel lblKmh = new JLabel("km/h");
		panel_6.add(lblKmh);
		
		textField_2 = new JTextField();
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_6.add(textField_5);
		
		JPanel objectSizePanel = new JPanel();
		panel.add(objectSizePanel);
		objectSizePanel.setLayout(new GridLayout(3, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Lenght/Height");
		objectSizePanel.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("");
		objectSizePanel.add(label_2);
		
		textField = new JTextField();
		objectSizePanel.add(textField);
		textField.setColumns(10);
		
		textField_6 = new JTextField();
		objectSizePanel.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton restore_B = new JButton("Restore");
		panel_7.add(restore_B);
		ActionListener actionListenerApply_B = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("restore");
			}
		};
		restore_B.addActionListener(actionListenerApply_B);
		
		
		JButton delete_B = new JButton("Delete ");
		panel_7.add(delete_B);
		ActionListener actionListenerDelete = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("delete");
			}
		};
		delete_B.addActionListener(actionListenerDelete);
		
		JPanel panel_11 = new JPanel();
		panel_11.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(panel_11);
		panel_11.setLayout(new GridLayout(3, 1, 0, 0));
		panel_11.setPreferredSize(new Dimension(50,50));
		
		JLabel lblGravity = new JLabel("Gravity");
		panel_11.add(lblGravity);
		
		textField_7 = new JTextField();
		panel_11.add(textField_7);
		textField_7.setColumns(5);
		textField_7.setPreferredSize(new Dimension(50,50));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton restoreGlobal_b = new JButton("Restore");
		panel_3.add(restoreGlobal_b);
		ActionListener actionListenerrestoreGlobal = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("restoreGlobal");
			}
		};
		restoreGlobal_b.addActionListener(actionListenerrestoreGlobal);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnDatei.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnDatei.add(mntmNewMenuItem_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		scrollPane.setViewportView(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnObj = new JTextPane();
		panel_4.add(txtpnObj, BorderLayout.NORTH);
		txtpnObj.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		
		JTextPane textPane = new JTextPane();
		panel_4.add(textPane, BorderLayout.SOUTH);
		textPane.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		panel_2.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane_3 = new JTextPane();
		panel_8.add(textPane_3, BorderLayout.NORTH);
		textPane_3.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		
		JTextPane textPane_2 = new JTextPane();
		panel_8.add(textPane_2, BorderLayout.SOUTH);
		textPane_2.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		panel_2.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		panel_9.add(textPane_1, BorderLayout.NORTH);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		panel_9.add(textPane_4, BorderLayout.SOUTH);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10, BorderLayout.CENTER);
		
		panel_10.add(canvas);
		canvas.setBackground(Color.BLACK);
		setBounds(100, 100, x, y);
	}

}
