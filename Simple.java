import javax.swing.*;
public class Simple extends JFrame{
        JFrame frame;
        Simple(){
             JButton button = new JButton("Click");
             button.setBounds(130, 100,100,40);
             add(button);
             setSize(400, 500);
             setLayout(null);
             setVisible(true);
        }
       

    
    public static void main(String[] args) {
        // create a frame with object
        // JFrame frame = new JFrame();
        // JButton button = new JButton("Click");
        // button.setBounds(130, 100, 100, 40);
        // frame.add(button);
        // frame.setSize(400, 500);
        // frame.setLayout(null);
        // frame.setVisible(true);

        new Simple();
    }

}