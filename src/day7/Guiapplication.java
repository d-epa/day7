package day7;

import javax.swing.*;
import java.awt.*;

public class Guiapplication {
    public static void main(String []args ) {
        JFrame frame = new JFrame("SD");
        JButton button= new JButton("Click me");
        JPanel panel =new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label= new JLabel("JFrame by example");
        button.setSize(100,50);
        button.setText("click here");
        panel.add(button);
        frame.add(panel);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
