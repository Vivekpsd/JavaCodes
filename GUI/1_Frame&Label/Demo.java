import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo {
    public static void main(String[] args) {
        // // instance of MyFrame
        // MyFrame frame = new MyFrame();

        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setText("Hello World Label..."); // set text for label

        // set x and  y position within frame and dimentions.
        label.setBounds(100, 100, 250, 30);

        // label position
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        // label color, font, bg
        label.setForeground(Color.red);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        // NOTE - Label takes as much space as they want to.... coz of default layout manager

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // default is border layout, but if null, need to set the bounds for the label
        frame.setVisible(true);
        frame.add(label);

        // frame.pack() // will resize and fit all the component into the window, no need to define the size of the window, use pack in last
    }
}