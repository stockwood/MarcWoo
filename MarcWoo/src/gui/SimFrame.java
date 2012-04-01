package gui;


import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;

import Simulation.SimLoop;


public class SimFrame extends JFrame{

	JButton start_B;
	JButton pause_B;
	JButton reset_B;
	
	JButton restore_B;
	JButton delete_B;
	int x,y;
	int canvasSizeX,canvasSizeY;
	SimLoop simloop;
  public JToolBar toolBar;
	
	public SimFrame(int width,int height,SimLoop sm){
		super("Physik-Engine");
		
		simloop = sm;
		x = width;
		y = height;
		canvasSizeX = x-240;
		canvasSizeY = y-140;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(x,y);
		setVisible(true);

		
//		<BR>
//		start_B = new JButton("<HTML><font size=2><CENTER><BODY>Start</BODY></font></HTML>");
//		ActionListener actionListenerStart = new ActionListener() {
//			public void actionPerformed(ActionEvent actionEvent) {
//				simloop.run();
//			}
//		};
//		start_B.addActionListener(actionListenerStart);
//		start_B.setPreferredSize(new Dimension(100, 30));
//
//		pause_B = new JButton("<HTML><font size=2><CENTER><BODY>Pause</BODY></font></HTML>");
//		ActionListener actionListenerPause = new ActionListener() {
//			public void actionPerformed(ActionEvent actionEvent) {
//				simloop.pause();
//			}
//		};
//		pause_B.addActionListener(actionListenerPause);
//		pause_B.setPreferredSize(new Dimension(100, 30));
//		
//		reset_B = new JButton("<HTML><font size=2><CENTER><BODY>Reset</BODY></font></HTML>");
//		ActionListener actionListenerReset = new ActionListener() {
//			public void actionPerformed(ActionEvent actionEvent) {
//			}
//		};
//		reset_B.addActionListener(actionListenerReset);
//		reset_B.setPreferredSize(new Dimension(100, 30));
		
		// Rechts
		restore_B = new JButton("<HTML><font size=2><CENTER><BODY>Restore</BODY></font></HTML>");
		ActionListener actionListenerApply_B = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
			}
		};
		restore_B.addActionListener(actionListenerApply_B);
		restore_B.setPreferredSize(new Dimension(100, 30));
		
		delete_B = new JButton("<HTML><font size=2><CENTER><BODY>Loeschen</BODY></font></HTML>");
		ActionListener actionListenerDelete = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
			}
		};
		delete_B.addActionListener(actionListenerDelete);
		delete_B.setPreferredSize(new Dimension(100, 30));
		
		Container content = getContentPane();

		JPanel mainPanel = new JPanel();
//		mainPanel.setLayout(new GridLayout(2,3));

		JMenu menubar = new JMenu();
	    JMenuBar bar = new JMenuBar();
	    JMenu menu = new JMenu("Laden");
	    bar.add(menu);
		
		JPanel menuLeftSide = new JPanel();
		menuLeftSide.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		menuLeftSide.setPreferredSize(new Dimension(105, height));
		
		JPanel middle = new JPanel();
		middle.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		middle.setPreferredSize(new Dimension(canvasSizeX, y));
		
		JPanel canvas = new SandBoxCanvas(this);
		canvas.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		canvas.setPreferredSize(new Dimension(canvasSizeX, canvasSizeY));
		
		JPanel objects = new JPanel();
//		objects.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		objects.setPreferredSize(new Dimension(canvasSizeX-100, y-canvasSizeY-50));
		objects.setBackground(Color.BLACK);
		
		JPanel menuRightSide = new JPanel();
		menuRightSide.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		menuRightSide.setPreferredSize(new Dimension(105, height));
		
		JPanel objectParamField = new JPanel();
		objectParamField.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		objectParamField.setPreferredSize(new Dimension(100, height/2));
		
		JPanel engineParamField = new JPanel();
//		engineParamField.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		engineParamField.setPreferredSize(new Dimension(100, height/2));
		
		JPanel esfgd = new JPanel();
//		esfgd.setLayout(new BorderLayout(2,2));
		esfgd.setPreferredSize(new Dimension(1500, 400));
		
		ToolBar();
		
		menuLeftSide.add(toolBar, BorderLayout.NORTH);
		
	    esfgd.add(new JLabel("Dies idieses " +
                "kleine Fensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfensterntasfgsfdgsfgsdfgsfg."),BorderLayout.EAST);
	    esfgd.add(new JLabel("Diext für dieses " +
                "kleine Fenste horizontasfgsfg."),BorderLayout.NORTH);
	    esfgd.add(new JLabel("Dies ist  für dieses " +
                "kleine Fensteman horizontasfdg."),BorderLayout.WEST);
	    esfgd.add(new JLabel("Dieer Text für dieses " +
                "kleine Fenss man horizonta."),BorderLayout.SOUTH);
//		esfgd.setBounds(0, 0, 100, 100);
//		esfgd.add(restore_B);
//	    esfgd.add(new JLabel("Dies ist ein viel zu langer Text für dieses " +
//                "kleine Fenster, so dass man horizontal " +
//                "scrollen muss, um scrollen."));
//		objects.add(restore_B);
//		objects.add(restore_B);
//		objects.add(restore_B);
//		objects.setBounds(0, 0, 100, 50);

        JScrollPane scrollPane = new JScrollPane ();
        objects.add(scrollPane, BorderLayout.SOUTH);
        
        
        scrollPane.setViewportView(esfgd);
////        scrollPane.setBounds(0, 0, 200, 50);
//        scrollPane.setVisible(true);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
		middle.add(canvas);
		middle.add(objects);
		
		objectParamField.add(restore_B);
		objectParamField.add(delete_B);
		menuRightSide.add(objectParamField);
		menuRightSide.add(engineParamField);
		
		menu.add(new JMenuItem("Close"));
	    menu.add(new JSeparator()); // SEPARATOR
	    menu.add(new JMenuItem("Exit"));

	    setJMenuBar(bar);
		mainPanel.add(menuLeftSide,BorderLayout.EAST);
		mainPanel.add(middle);
		mainPanel.add(menuRightSide,BorderLayout.WEST);
		
		content.add(mainPanel);
//		content.add(scrollPane);
		setVisible(true);
	}
	
	
	
	public int getCanvasSizeX(){
		return canvasSizeX-2;
	}
	
	public int getCanvasSizeY(){
		return canvasSizeY-1;
	}
	
	 public void ToolBar() {


		    toolBar = new JToolBar(JToolBar.VERTICAL);
		    toolBar.add(new DemoAction("Run", new ImageIcon(this.getClass().getResource("/icons/run.png")), "Start Simulation", 'R'){
		    	/**
				 * 
				 */
				private static final long serialVersionUID = -3813591346920567018L;

				@Override
		        public void actionPerformed(ActionEvent e) {
		          try {
//		        	  System.out.println("Start");
						simloop.run();
		          } catch (Exception ex) {
		            ex.printStackTrace();
		          }
		        }
		    });
		    toolBar.add(new DemoAction("Pause", new ImageIcon(this.getClass().getResource("/icons/pause.png")), "Pausiere Simulation", 'P'){
		    	/**
				 * 
				 */
				private static final long serialVersionUID = 5720242747673986382L;

				@Override
		        public void actionPerformed(ActionEvent e) {
		          try {
//		        	  System.out.println("Pause");
						simloop.pause();
		          } catch (Exception ex) {
		            ex.printStackTrace();
		          }
		        }
		    });
		    toolBar.add(new DemoAction("Reset", new ImageIcon(this.getClass().getResource("/icons/reset.png")), "Reset Simulation", 'S'){
		    	/**
				 * 
				 */
				private static final long serialVersionUID = 547478408528668602L;

				@Override
		        public void actionPerformed(ActionEvent e) {
		          try {
		        	  System.out.println("Reset");
		          } catch (Exception ex) {
		            ex.printStackTrace();
		          }
		        }
		    });

		    //  Disable one of the Actions
//		    fullJustifyAction.setEnabled(false);
		  }
	
}



class DemoAction extends AbstractAction {
    public DemoAction(String text, Icon icon, String description,char accelerator) {
      super(text, icon);
      putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accelerator,Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
      putValue(SHORT_DESCRIPTION, description);
    }
    public void actionPerformed(ActionEvent e) {}
  }
