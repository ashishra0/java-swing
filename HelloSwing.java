// Creating a JFrame component
import javax.swing.*;

public class HelloSwing {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Hello World");
        final JLabel label = new JLabel("Hello world"); // new label is instantiated.
        frame.getContentPane().add(label); // adding a body to the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program shuts down upon clicking of the cross.
        frame.pack();
        frame.setVisible(true); // set to false if you dont wish to see the component.
    }
}