import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Demo {
    public static void main(String[] args) {
        // Layout Manager: Defines natural layout for component within container

        // FlowLayout
        // places components in a row, sized at their preferred size.
        // if horizontal space is too small, the flow layout class uses next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // 10 10 horizontal and vertical spacing...

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout()); // panel by default uses flowlayout
        
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        frame.add(panel);
        frame.setVisible(true);
    }
}

