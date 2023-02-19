import javax.swing.*;
import java.awt.*;

public class GameFrame {

    JFrame frame;

    GamePanel panel;
    GameFrame()
    {
        frame=new JFrame("Pong Game");

        panel=new GamePanel();
        frame.add(panel);
        frame.setBackground(Color.black);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}