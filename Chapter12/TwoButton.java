package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButton {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButton gui = new TwoButton();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }

    public class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}