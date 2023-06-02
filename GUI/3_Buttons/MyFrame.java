import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

// Task...
// 1. implement ActionListener
// 2. in main listen for action through button.addActionListener(this);
// 3. create a function with arg ActionEvent and check event.getSource(), perform action...

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JButton button2;
    
    MyFrame() {

        button = new JButton("Click Me");
        button.setBounds(200, 100, 100, 50);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.addActionListener(this);
        //button.setEnabled(false);

        // lambda expression...
        button2 = new JButton("Lambda Exp..");
        button2.setBounds(200, 170, 100, 50);
        button2.addActionListener(e -> System.out.println("Triggered through lambda exp.."));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
        this.add(button2);
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("OK");
        }
    }
}
