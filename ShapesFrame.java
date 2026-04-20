import javax.swing.*;
import java.awt.event.*;

class ShapesFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Shapes");

        for (int i = 1; i <= 10; i++) {
            JButton b = new JButton("Shape " + i);
            b.setBounds(20, i * 30, 100, 25);

            b.addActionListener(e ->
                JOptionPane.showMessageDialog(f, "Shape Created!")
            );

            f.add(b);
        }

        f.setSize(200,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}