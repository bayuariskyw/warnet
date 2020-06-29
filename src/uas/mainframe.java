package uas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class mainframe extends JFrame{
public mainframe(){

    JFrame mainFrame=new JFrame();
    mainFrame.setSize(300, 240);
    mainFrame.getContentPane().setBackground(Color.white);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("menu");
    mainFrame.setLayout(null);
       
    JButton buttonAdmin=new JButton("ADMIN");
    buttonAdmin.setFont(new Font("Consolas",Font.BOLD,24));
    buttonAdmin.setBackground(Color.white);
    buttonAdmin.setForeground(Color.black);
    buttonAdmin.setBounds(0, 0, 300, 100);
    buttonAdmin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           registeradminframe admin=new registeradminframe();
           mainFrame.dispose();
        }
    });
    mainFrame.add(buttonAdmin);
  
    JButton buttonLogin=new JButton("Login");
    buttonLogin.setFont(new Font("Consolas",Font.BOLD,24));
    buttonLogin.setBackground(Color.white);
    buttonLogin.setForeground(Color.black);
    buttonLogin.setBounds(0, 100, 300, 100);
    buttonLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                loginpelangganframe loginframe=new loginpelangganframe();
            } catch (Exception ex) {
                Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainFrame.dispose();
        }
    });
    mainFrame.add(buttonLogin);
    mainFrame.setVisible(true);
    }
} 