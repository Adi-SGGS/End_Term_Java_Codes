import java.awt.*;
//swing the GUI library
import javax.swing.*;
//For event action and listning
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jmath extends JFrame implements ActionListener {

    static JFrame frame;
    static JTextField ta1, ta2, ta_re;

    public static void main(String args[]) {
        jmath pe = new jmath();
        // setting the frame
        frame = new JFrame();
        frame.setSize(400, 500);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(14, 200, 300, 230);
        // panel.setSize(300,400);
        frame.add(panel, BorderLayout.CENTER);
        panel.setBackground(Color.gray); // adding colour to panel
        // setting layout for the pannel
        panel.setLayout(null);
        // Font f1 = new Font(Font.MONOSPACED, Font.PLAIN, 20); // we will use this next
        // time

        // Creating Buttons
        JButton Add = new JButton("Addition");
        JButton sub = new JButton("Substraction");
        JButton mul = new JButton("Multiplication");
        JButton div = new JButton("Division");

        Add.setBounds(15, 30, 100, 50);
        sub.setBounds(130, 30, 100, 50);
        mul.setBounds(15, 100, 100, 50);
        div.setBounds(130, 100, 100, 50);

        // adding action listner
        Add.addActionListener((ActionListener) pe);
        sub.addActionListener(pe);
        mul.addActionListener(pe);
        div.addActionListener(pe);

        // setting colours to buttons
        Add.setBackground(Color.green);
        sub.setBackground(Color.yellow);
        mul.setBackground(Color.blue);
        div.setBackground(Color.red);
        // creating textfields
        ta1 = new JTextField();
        ta2 = new JTextField();
        ta_re = new JTextField("Result -> ");

        ta1.setBounds(15, 20, 250, 50);
        ta2.setBounds(15, 90, 250, 50);
        ta_re.setBounds(15, 160, 250, 50);

        ta1.setBackground(Color.white);
        ta2.setBackground(Color.white);
        ta_re.setBackground(Color.white);

        // adding these text areas to Panel and frame
        frame.add(Add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);

        panel.add(ta1);
        panel.add(ta2);
        panel.add(ta_re);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent pe) {
        String s = pe.getActionCommand();
        Double c;

        if (s.equals("Addition")) {
            c = (Double.parseDouble(ta1.getText()) + Double.parseDouble(ta2.getText()));
            ta_re.setText("Result -> " + c);
        } else if (s.equals("Multiplication")) {

            c = (Double.parseDouble(ta1.getText()) * Double.parseDouble(ta2.getText()));
            ta_re.setText("Result -> " + c);

        } else if (s.equals("Division")) {

            c = (Double.parseDouble(ta1.getText()) / Double.parseDouble(ta2.getText()));
            ta_re.setText("Result -> " + c);

        } else if (s.equals("Substraction")) {

            c = (Double.parseDouble(ta1.getText()) - Double.parseDouble(ta2.getText()));
            ta_re.setText("Result -> " + c);

        } else {
            ta_re.setText("");
        }
    }
}
