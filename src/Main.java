import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(10,10,200,200);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(10,210,200,200);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(greenPanel);
    }
}