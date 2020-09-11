import javax.swing.*;
import java.awt.*;


public class Afvinkopdracht1_3 extends JFrame {

    private JLabel label;
    private JTextField textField;

    public static void main(String[] args){
        Afvinkopdracht1_3 frame = new Afvinkopdracht1_3();
        frame.setSize(500, 500);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        label = new JLabel("INPUT1");
        window.add(label);
        textField = new JTextField("Enter input here");
        window.add(textField);
    }
}
