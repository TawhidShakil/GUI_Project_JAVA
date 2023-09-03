import javax.swing.*;
public class Button {
    Button(){
        JFrame frame = new JFrame("Button");
        JButton button = new JButton(new ImageIcon("C:\\Users\\ACER i3 LAPTOP\\Pictures\\images"));
        button.setBounds(130,100,100, 40);
        frame.add(button);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // create a frame
        new Button();
    }
}
