package LOGIN;

import javax.swing.*;

public class loginpage {
    JFrame frame= new JFrame();
    JLabel lable= new JLabel("HELLO WORLD");
    JTextField userIDField =new JTextField();
    public loginpage(){
        lable.setBounds(100,80,200, 50);
        lable.setBounds(120,50, 200 ,20);
        frame.add(lable);
        frame.add(userIDField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480,480);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
