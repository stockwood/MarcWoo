package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Canvas;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JMenu;
import java.awt.FlowLayout;

public class SimFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimFrame2 frame = new SimFrame2();
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
	public SimFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar, BorderLayout.WEST);
		
		JButton start_B = new JButton("");
		start_B.setToolTipText("Simulation starten");
		start_B.setIcon(new ImageIcon(SimFrame2.class.getResource("/Icons/run.png")));
		toolBar.add(start_B);
		
		JButton pause_B = new JButton("");
		pause_B.setToolTipText("Simulation pausieren");
		toolBar.add(pause_B);
		pause_B.setVerticalAlignment(SwingConstants.TOP);
		pause_B.setIcon(new ImageIcon(SimFrame2.class.getResource("/Icons/pause.png")));
		
		JButton reset_b = new JButton("");
		reset_b.setToolTipText("Simulation zur\u00FCcksetzen");
		toolBar.add(reset_b);
		reset_b.setIcon(new ImageIcon(SimFrame2.class.getResource("/Icons/reset.png")));
		reset_b.setVerticalAlignment(SwingConstants.TOP);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(9, 5, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_3.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		textField_1 = new JTextField();
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		textField_2 = new JTextField();
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_2);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		
		JButton restore_B = new JButton("Restore");
		panel_7.add(restore_B);
		
		JButton delete_B = new JButton("Delete");
		panel_7.add(delete_B);
		
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
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.BLACK);
		canvas.setSize(500,350);
		panel_1.add(canvas, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		
		JTextPane txtpnObj = new JTextPane();
		panel_2.add(txtpnObj);
		txtpnObj.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		
		JTextPane textPane = new JTextPane();
		panel_2.add(textPane);
		textPane.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		
		JTextPane textPane_3 = new JTextPane();
		panel_2.add(textPane_3);
		textPane_3.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
		
		JTextPane textPane_2 = new JTextPane();
		panel_2.add(textPane_2);
		textPane_2.setText("fahgafgjdabkjkjadgdabfgbjdasgfkjdbasgjdasbgkdabsb");
	}

}
