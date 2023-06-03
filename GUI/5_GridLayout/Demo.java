import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo {
    public static void main(String[] args) {
        // Grid Layout
        // places components in a grid of cells
        // each component takes all the space within the cell, and each cell is of same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 10, 10)); // amount of rows and cols then hori and verti spacing

        frame.add(new JButton("Button1"));
        frame.add(new JButton("Button2"));
        frame.add(new JButton("Button3"));
        frame.add(new JButton("Button4"));
        frame.add(new JButton("Button5"));
        frame.add(new JButton("Button6"));
        frame.add(new JButton("Button7"));
        frame.add(new JButton("Button8"));

        frame.setVisible(true);

    }
}
