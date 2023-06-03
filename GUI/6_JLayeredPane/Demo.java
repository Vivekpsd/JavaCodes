import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Demo {
    public static void main(String[] args) {
        // JLayeredPane = Swing Container that provides 3rd dimention for positioning components
        // ex- depth, z-index

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.red);
        label.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.yellow);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500); // x y width height

        // add labels to layeredpane (on diff layers)
        layeredPane.add(label, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(3));
        layeredPane.add(label3, Integer.valueOf(2));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.add(layeredPane);

        frame.setVisible(true);

    }
}
