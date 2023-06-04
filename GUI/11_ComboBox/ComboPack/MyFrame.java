package ComboPack;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox combobox;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};

        combobox = new JComboBox(animals);

        combobox.addActionListener(this);
        combobox.insertItemAt("rat", 1);
        combobox.setSelectedIndex(1);
        combobox.removeItem("cat");

        this.add(combobox);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == combobox) {
            System.out.println(combobox.getSelectedItem());
        }
    }
}
