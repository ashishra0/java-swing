import javax.swing.*;

class SwingButton {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Title");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me");

        panel.add(button); // add button to the panel
        frame.setContentPane(panel); // add panel to the frame
        frame.setVisible(true); // show the frame.
    }
}