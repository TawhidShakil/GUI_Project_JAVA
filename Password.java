import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Password {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("UserName:");
        label.setBounds(50, 100, 80, 30);
        JTextField field = new JTextField();
        field.setBounds(120, 100, 200, 30);
        JLabel label2 = new JLabel("Password:");
        label2.setBounds(50, 150, 80, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(120,150 , 200, 30);
        JButton button = new JButton("Login");
        button.setBounds(240, 200, 80, 30);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        JButton button1 = new JButton("Register");
        button1.setBounds(120, 200, 100, 30);
        button1.setBackground(Color.GREEN);

        frame.add(label); 
        frame.add(field);
        frame.add(label2);
        frame.add(button);
        frame.add(button1);
        frame.add(passwordField); 
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
