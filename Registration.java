import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Registration {
    public static void main(String[] args) {
        JFrame f=new JFrame("Registration");

        JTextField name=new JTextField();
        name.setBounds(50,50,150,30);

        JButton submit=new JButton("Submit");
        submit.setBounds(50,100,100,30);

        submit.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test","root","");

                PreparedStatement ps = con.prepareStatement(
                    "insert into student(name) values(?)");

                ps.setString(1,name.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(f,"Inserted");
            } catch(Exception ex) {
                System.out.println(ex);
            }
        });

        f.add(name); f.add(submit);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}