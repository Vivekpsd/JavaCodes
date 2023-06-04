package RadioPack;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JRadioButton pizzaBtn;
    JRadioButton hamburgerBtn;
    JRadioButton hotdogBtn;
    
    public MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaBtn = new JRadioButton("Pizza");
        hamburgerBtn = new JRadioButton("Hamburger");
        hotdogBtn = new JRadioButton("Hotdog");

        // button group ----
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaBtn);
        group.add(hamburgerBtn);
        group.add(hotdogBtn);

        pizzaBtn.addActionListener(this);
        hamburgerBtn.addActionListener(this);
        hotdogBtn.addActionListener(this);

        this.add(pizzaBtn);
        this.add(hamburgerBtn);
        this.add(hotdogBtn);

        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaBtn) {
            System.out.println("Pizza Ordered");
        } else if (e.getSource() == hamburgerBtn) {
            System.out.println("Hamburger Ordered");
        } else {
            System.out.println("Hotdog Ordered");
        }
    }
}
