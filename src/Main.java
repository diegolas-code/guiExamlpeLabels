import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel("Bro do u even code");

        ImageIcon image = new ImageIcon("grug.jpg");
        label.setIcon(image);

        Border border = BorderFactory.createLineBorder(Color.MAGENTA, 2);
        label.setBorder(border);
        // label.setBounds(20,20,350,350);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setIconTextGap(10);

        label.setForeground(new Color(0x900090));
        label.setBackground(Color.pink);
        label.setOpaque(true);
        label.setFont(new Font("Jetbrains Mono", Font.PLAIN,20));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        // frame.pack();
    }
}