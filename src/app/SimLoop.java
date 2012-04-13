package app;

import javax.swing.JFrame;

import gui.GuiFrame;

/**
 *
 * @author Felix Schmidt
 */
public class SimLoop {
    //0 = Pause;1 = Run

    int zustand = 0;

    public SimLoop() {
        JFrame frame = new GuiFrame(800, 600, this);


        while (true) {
            switch (zustand) {
                case 0: {
                    frame.repaint();
                    break;
                }
                case 1: {//engine.Update;
                    frame.repaint();
                    break;
                }
            }
        }
    }

    public void pause() {
        zustand = 0;
        System.out.println("pause");
    }

    public void run() {
        zustand = 1;
        System.out.println("run");
    }

    public void reset() {
        //engine.reset;
        System.out.println("reset");
    }

    public int getState() {
        return zustand;
    }
}
