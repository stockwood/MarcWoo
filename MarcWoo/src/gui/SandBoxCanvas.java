package gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SandBoxCanvas extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5671939261156891065L;
	
	SimFrame daddy;
	
	public SandBoxCanvas(SimFrame sm){
		super();
		daddy = sm;
		
	}
	
	@Override
    protected void paintComponent( Graphics g ){
      super.paintComponent( g );
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0,0,daddy.getCanvasSizeX(),daddy.getCanvasSizeY());
		
		g2d.setColor(Color.BLACK);
		g2d.drawRect(0,0,daddy.getCanvasSizeX(),daddy.getCanvasSizeY());
		
		Toolkit.getDefaultToolkit().sync();
		g2d.dispose();
	}
}
