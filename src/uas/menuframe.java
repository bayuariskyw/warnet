package uas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class menuframe extends JFrame{
public menuframe(){
    JFrame mnu=new JFrame();
    mnu.setSize(300, 440);
    mnu.getContentPane().setBackground(Color.white);
    mnu.setLocationRelativeTo(null);
    mnu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mnu.setTitle("menu");
    mnu.setLayout(null);
    
       
    JButton buttonNonMember=new JButton("VOUCHER");
    buttonNonMember.setFont(new Font("Consolas",Font.BOLD,24));
    buttonNonMember.setBackground(Color.white);
    buttonNonMember.setForeground(Color.black);
    buttonNonMember.setBounds(0, 0, 300, 100);
    buttonNonMember.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           voucherframe voucher = new voucherframe();
           mnu.dispose();
        }
    });
    mnu.add(buttonNonMember);
  
    JButton buttonMember=new JButton("MEMBER");
    buttonMember.setFont(new Font("Consolas",Font.BOLD,24));
    buttonMember.setBackground(Color.white);
    buttonMember.setForeground(Color.black);
    buttonMember.setBounds(0, 100, 300, 100);
    buttonMember.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            memberframe member=new memberframe();
            mnu.dispose();
        }
    });
    mnu.add(buttonMember);
    mnu.setVisible(true);
    
    JButton buttonKomputer=new JButton("KOMPUTER");
    buttonKomputer.setFont(new Font("Consolas",Font.BOLD,24));
    buttonKomputer.setBackground(Color.white);
    buttonKomputer.setForeground(Color.black);
    buttonKomputer.setBounds(0, 200, 300, 100);
    buttonKomputer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            komputerframe komputer=new komputerframe();
            mnu.dispose();
        }
    });
    mnu.add(buttonKomputer);
    mnu.setVisible(true);
    
    JButton buttontransaksi=new JButton("TRANSAKSI");
    buttontransaksi.setFont(new Font("Consolas",Font.BOLD,24));
    buttontransaksi.setBackground(Color.white);
    buttontransaksi.setForeground(Color.black);
    buttontransaksi.setBounds(0, 300, 300, 100);
    buttontransaksi.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            transaksiframe transaksi=new transaksiframe();
            mnu.dispose();
        }
    });
    mnu.add(buttontransaksi);
    mnu.setVisible(true);
    }
}