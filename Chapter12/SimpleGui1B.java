package Chapter12;

import java.awt.event.*;
import javax.swing.*;

public class SimpleGui1B implements ActionListener{
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui1 = new SimpleGui1B();
        gui1.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}