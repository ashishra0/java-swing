import javax.swing.*;

class SwingForm {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Contact Form");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400, 400);

        JLabel l1, l2, l3, l4;
        l1 = new JLabel("Name");
        l2 = new JLabel("Age");
        l3 = new JLabel("Number");
        l4 = new JLabel("Email ID");
        l1.setBounds(50,30,100, 20);
        l2.setBounds(50,80,100, 20);
        l3.setBounds(50,130,100, 20);
        l4.setBounds(50,180,100, 20);

        JTextField t1, t2, t3, t4;
        t1 = new JTextField("Enter Name");
        t2 = new JTextField("Enter age");
        t3 = new JTextField("Enter phone number");
        t4 = new JTextField("Enter email id");
        t1.setBounds(50,50,100,20);
        t2.setBounds(50,100,100,20);
        t3.setBounds(50,150,100,20);
        t4.setBounds(50,200,100,20);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);

        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);

    }
}