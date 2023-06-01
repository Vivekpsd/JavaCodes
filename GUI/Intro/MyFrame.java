import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame() {

        //set title
        this.setTitle("Hello World");

        // set x and y dimentions
        this.setSize(400, 400); 

        // prevent this from being resize
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make this visible
        this.setVisible(true);

        this.getContentPane().setBackground(Color.yellow);
    }
}
