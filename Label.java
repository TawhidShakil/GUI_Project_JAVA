import javax.swing.*;

public class Label {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        JLabel label1 = new JLabel("First Level");
        label1.setBounds(50,0,100,30);
        JLabel label2 = new JLabel("Second Level");
        label2.setBounds(160,0,100,30);
        frame.add(label1);
        frame.add(label2);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
