import javax.swing.*;
import java.awt.event.*;

class MatrixSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Matrix Add");

        JTextField a = new JTextField();
        JTextField b = new JTextField();
        JTextField c = new JTextField();

        a.setBounds(50,50,50,30);
        b.setBounds(120,50,50,30);
        c.setBounds(85,150,50,30);

        JButton btn = new JButton("Add");
        btn.setBounds(80,100,80,30);

        btn.addActionListener(e -> {
            int x = Integer.parseInt(a.getText());
            int y = Integer.parseInt(b.getText());
            c.setText("" + (x + y));
        });

        f.add(a); f.add(b); f.add(c); f.add(btn);
        f.setSize(250,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}