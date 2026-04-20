import javax.swing.*;
import java.awt.event.*;

class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        t1.setBounds(50, 30, 100, 30);
        t2.setBounds(50, 70, 100, 30);
        t3.setBounds(50, 200, 100, 30);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        add.setBounds(50, 120, 50, 30);
        sub.setBounds(110, 120, 50, 30);
        mul.setBounds(50, 160, 50, 30);
        div.setBounds(110, 160, 50, 30);

        ActionListener act = e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            if (e.getSource() == add) t3.setText("" + (a + b));
            if (e.getSource() == sub) t3.setText("" + (a - b));
            if (e.getSource() == mul) t3.setText("" + (a * b));
            if (e.getSource() == div) t3.setText("" + (a / b));
        };

        add.addActionListener(act);
        sub.addActionListener(act);
        mul.addActionListener(act);
        div.addActionListener(act);

        f.add(t1); f.add(t2); f.add(t3);
        f.add(add); f.add(sub); f.add(mul); f.add(div);

        f.setSize(250, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}