package structure;

import javax.swing.*;

public class PongFrame {

    public void pongFrameInitializer(){
        String windowName = "Pong";
        JFrame myFrame = new JFrame(windowName);
        myFrame.setSize(1366,1024);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.setVisible(true);
    }

}
