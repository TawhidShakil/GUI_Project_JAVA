import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Calculator {
    private static JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        return button;
    }

    private static JButton createButton(String text, int x, int y, Color bgColor, Color fgColor, Font customFont, int width, int height) {
        JButton button = createButton(text, x, y, width, height);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFont(customFont);
        return button;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setLocation(550, 150);
        JTextField field1 = new JTextField();
        field1.setBounds(50, 30, 305, 40);
        Font customFont = new Font("Arial", Font.BOLD, 16);
        Color orangeBrown = new Color(0xD8711A);

        JButton seven = createButton("7", 50, 150, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton eight = createButton("8", 135, 150, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton nine = createButton("9", 220, 150, Color.WHITE, Color.BLACK, customFont, 80, 40);

        JButton four = createButton("4", 50, 200, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton five = createButton("5", 135, 200, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton six = createButton("6", 220, 200, Color.WHITE, Color.BLACK, customFont, 80, 40);

        JButton one = createButton("1", 50, 250, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton two = createButton("2", 135, 250, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton three = createButton("3", 220, 250, Color.WHITE, Color.BLACK, customFont, 80, 40);

        JButton zero = createButton("0", 50, 300, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton dot = createButton(".", 135, 300, Color.WHITE, Color.BLACK, customFont, 80, 40);
        JButton equal = createButton("=", 220, 300, Color.GREEN, Color.BLACK, customFont, 80, 40);

        JButton ofb = createButton("(", 50, 100, Color.LIGHT_GRAY, Color.BLACK, customFont, 80, 40);
        JButton cfb = createButton(")", 135, 100, Color.LIGHT_GRAY, Color.BLACK, customFont, 80, 40);
        JButton percentage = createButton("%", 220, 100, Color.LIGHT_GRAY, Color.BLACK, customFont, 80, 40);
        JButton acbtn = createButton("AC", 305, 100, Color.RED, Color.BLACK, customFont, 60, 40);

        JButton division = createButton("/", 305, 150, Color.LIGHT_GRAY, Color.BLACK, customFont, 60, 40);
        JButton multiply = createButton("*", 305, 200, Color.LIGHT_GRAY, Color.BLACK, customFont, 60, 40);
        JButton substract = createButton("-", 305, 250, Color.LIGHT_GRAY, Color.BLACK, customFont, 60, 40);
        JButton addition = createButton("+", 305, 300, Color.LIGHT_GRAY, Color.BLACK, customFont, 60, 40);

        frame.add(field1);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(ofb);
        frame.add(cfb);
        frame.add(percentage);
        frame.add(acbtn);
        frame.add(zero);
        frame.add(dot);
        frame.add(equal);
        frame.add(division);
        frame.add(multiply);
        frame.add(substract);
        frame.add(addition);

        frame.setSize(450, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
