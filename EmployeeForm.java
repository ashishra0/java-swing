// Employee form creation using GUI
import javax.swing.*; 

class EmployeeForm {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Employee form");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400,400);

        JLabel l1, l2, l3, l4, l5;
        l1 = new JLabel("Name");
        l2 = new JLabel("Age");
        l3 = new JLabel("Phone number");
        l4 = new JLabel("Email Id");
        l5 = new JLabel("Designation");
        l1.setBounds(50, 30, 100, 20);
        l2.setBounds(50, 80, 100, 20);
        l3.setBounds(50, 130, 100, 20);
        l4.setBounds(50, 180, 100, 20);
        l5.setBounds(50, 230, 100, 20);
        
        JButton button = new JButton("Submit");

        JTextField t1, t2, t3, t4, t5;
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t1.setBounds(50, 50, 100, 20);
        t2.setBounds(50, 100, 100, 20);
        t3.setBounds(50, 150, 100, 20);
        t4.setBounds(50, 200, 100, 20);
        t5.setBounds(50, 250, 100, 20);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);

        frame.add(button);

        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
    }
}