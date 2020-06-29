 package uas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controller.AdminController;
import controller.AllObject;

 public class loginadminframe extends JFrame {
    AdminController admin = new AdminController();
    public loginadminframe() {
        
        JFrame loginadframe = new JFrame();
        loginadframe.setSize(400, 400);
        loginadframe.getContentPane().setBackground(Color.white);
        loginadframe.setLocationRelativeTo(null);
        loginadframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginadframe.setTitle("Login Admin");
        loginadframe.setLayout(null);

        JLabel labelKasir = new JLabel("LOGIN ADMIN");
        labelKasir.setFont(new Font("Consolas", Font.BOLD, 24));
        labelKasir.setBackground(Color.white);
        labelKasir.setForeground(Color.black);
        labelKasir.setBounds(130, 0, 150, 100);
        loginadframe.add(labelKasir);

        JLabel labelId = new JLabel("Id admin");
        labelId.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelId.setBackground(Color.white);
        labelId.setForeground(Color.black);
        labelId.setBounds(25, 100, 100, 20);
        loginadframe.add(labelId);

        JTextField textId = new JTextField();
        textId.setFont(new Font("Consolas", Font.PLAIN, 14));
        textId.setBackground(Color.white);
        textId.setForeground(Color.black);
        textId.setBounds(25, 130, 100, 30);
        loginadframe.add(textId);

        JLabel labelPass = new JLabel("Password");
        labelPass.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelPass.setBackground(Color.white);
        labelPass.setForeground(Color.black);
        labelPass.setBounds(25, 180, 100, 20);
        loginadframe.add(labelPass);

        JPasswordField textPass = new JPasswordField();
        textPass.setBackground(Color.white);
        textPass.setForeground(Color.black);
        textPass.setBounds(25, 210, 100, 30);
        loginadframe.add(textPass);

        JButton buttonLogin = new JButton("Login");
        buttonLogin.setFont(new Font("Consolas", Font.PLAIN, 14));
        buttonLogin.setBackground(Color.white);
        buttonLogin.setForeground(Color.black);
        buttonLogin.setBounds(250, 300, 75, 20);
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String id_admin = textId.getText();
                String pass = textPass.getText();
                boolean ketemu = false;
                for (int i = 0; i < AllObject.admin.getIndex(); i++) {
                    if (id_admin.equals(AllObject.admin.dataAdmin[i].getId_admin()) && pass.equals(AllObject.admin.dataAdmin[i].getPassword())) {
                        ketemu = true;
                    }
                }
                if (ketemu == true) {
                    AllObject.id_admin=id_admin;
                    menuframe menu = new menuframe();
                    loginadframe.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Nama/password salah");
                }
            }
        });
        loginadframe.add(buttonLogin);

        JButton outButton = new JButton("Keluar");
        outButton.setBackground(Color.white);
        outButton.setForeground(Color.black);
        outButton.setBounds(25, 300, 90, 20);
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mainframe main = new mainframe();
                loginadframe.dispose();
            }
        });
        loginadframe.add(outButton);

        loginadframe.setVisible(true);
    }
}