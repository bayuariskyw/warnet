 package uas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import controller.AllObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class loginpelangganframe extends JFrame {
    public loginpelangganframe()throws Exception {
        JFrame framePelanggan=new JFrame();
        framePelanggan.setSize(790,550);
        framePelanggan.getContentPane().setBackground(Color.WHITE);
        framePelanggan.setLocationRelativeTo(null);
        framePelanggan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePelanggan.setTitle("LOGIN");
        framePelanggan.setLayout(null);
        
        JLabel labelPelanggan=new JLabel("LOGIN");
        labelPelanggan.setFont(new Font("Consolas",Font.BOLD,24));
        labelPelanggan.setBackground(Color.WHITE);
        labelPelanggan.setForeground(Color.black);
        labelPelanggan.setBounds(345 , 50, 170, 30);
        framePelanggan.add(labelPelanggan);
        
        JLabel labelNotransaksi=new JLabel("No Transaksi");
        labelNotransaksi.setFont(new Font("Consolas",Font.PLAIN,14));
        labelNotransaksi.setBackground(Color.white);
        labelNotransaksi.setForeground(Color.black);
        labelNotransaksi.setBounds(25, 100, 120, 30);
        framePelanggan.add(labelNotransaksi);
        
        JTextField textNotransaksi=new JTextField();
        textNotransaksi.setFont(new Font("Consolas",Font.PLAIN,14));
        textNotransaksi.setBackground(Color.white);
        textNotransaksi.setForeground(Color.black);
        textNotransaksi.setBounds(120, 100, 120, 30);
        framePelanggan.add(textNotransaksi);
        textNotransaksi.setText(AllObject.no_transaksi);
        
        JLabel labelNo=new JLabel("No pc");
        labelNo.setFont(new Font("Consolas",Font.PLAIN,14));
        labelNo.setBackground(Color.white);
        labelNo.setForeground(Color.black);
        labelNo.setBounds(25, 150, 120, 30);
        framePelanggan.add(labelNo);
        
        JTextField textNo=new JTextField();
        textNo.setFont(new Font("Consolas",Font.PLAIN,14));
        textNo.setBackground(Color.white);
        textNo.setForeground(Color.black);
        textNo.setBounds(120, 150, 120, 30);
        framePelanggan.add(textNo);
        textNo.setText(AllObject.no_pc);
        
        JLabel labelTanggal=new JLabel("Tanggal");
        labelTanggal.setFont(new Font("Consolas",Font.PLAIN,14));
        labelTanggal.setBackground(Color.white);
        labelTanggal.setForeground(Color.black);
        labelTanggal.setBounds(25, 200, 120, 30);
        framePelanggan.add(labelTanggal);
        
        JTextField texttanggal=new JTextField();
        texttanggal.setFont(new Font("Consolas",Font.PLAIN,14));
        texttanggal.setBackground(Color.white);
        texttanggal.setForeground(Color.black);
        texttanggal.setBounds(120, 200, 120, 30);
        framePelanggan.add(texttanggal);
        
        JLabel labellogin=new JLabel("Jam login");
        labellogin.setFont(new Font("Consolas",Font.PLAIN,14));
        labellogin.setBackground(Color.white);
        labellogin.setForeground(Color.black);
        labellogin.setBounds(25, 250, 120, 30);
        framePelanggan.add(labellogin);
        
        JTextField textlogin=new JTextField();
        textlogin.setFont(new Font("Consolas",Font.PLAIN,14));
        textlogin.setBackground(Color.white);
        textlogin.setForeground(Color.black);
        textlogin.setBounds(120, 250, 120, 30);
        framePelanggan.add(textlogin);
        
        JLabel labellogout=new JLabel("Jam logout");
        labellogout.setFont(new Font("Consolas",Font.PLAIN,14));
        labellogout.setBackground(Color.white);
        labellogout.setForeground(Color.black);
        labellogout.setBounds(25, 300, 120, 30);
        framePelanggan.add(labellogout);
        
        JTextField textlogout=new JTextField();
        textlogout.setFont(new Font("Consolas",Font.PLAIN,14));
        textlogout.setBackground(Color.white);
        textlogout.setForeground(Color.black);
        textlogout.setBounds(120, 300, 120, 30);
        framePelanggan.add(textlogout);
        
        JLabel labelsisawaktu=new JLabel("Sisa waktu");
        labelsisawaktu.setFont(new Font("Consolas",Font.PLAIN,14));
        labelsisawaktu.setBackground(Color.white);
        labelsisawaktu.setForeground(Color.black);
        labelsisawaktu.setBounds(25, 350, 120, 30);
        framePelanggan.add(labelsisawaktu);
        
        JTextField textsisawaktu=new JTextField();
        textsisawaktu.setFont(new Font("Consolas",Font.PLAIN,14));
        textsisawaktu.setBackground(Color.white);
        textsisawaktu.setForeground(Color.black);
        textsisawaktu.setBounds(120, 350, 120, 30);
        framePelanggan.add(textsisawaktu);
        
        String[] fieldData={"No Transaksi", "No pc", "Tanggal", "Jam login", "Jam logout", "Sisa waktu"};
        DefaultTableModel tabelDataMember=new DefaultTableModel(fieldData,0);
        JTable tabellog=new JTable(tabelDataMember);
        TableColumn tc1=new TableColumn(),tc2=new TableColumn(),tc3=new TableColumn(),tc4=new TableColumn(),tc5=new TableColumn(),tc6=new TableColumn();
        JScrollPane scrollPaneVoucher=new JScrollPane(tabellog);
        scrollPaneVoucher.setBounds(250, 100, 500, 280);
        tc1=tabellog.getColumnModel().getColumn(0);
        tc2=tabellog.getColumnModel().getColumn(1);
        tc3=tabellog.getColumnModel().getColumn(2);
        tc4=tabellog.getColumnModel().getColumn(3);
        tc5=tabellog.getColumnModel().getColumn(4);
        tc6=tabellog.getColumnModel().getColumn(5);
        tc1.setPreferredWidth(100);
        tc2.setPreferredWidth(100);
        tc3.setPreferredWidth(100);
        tc4.setPreferredWidth(100);
        tc5.setPreferredWidth(100);
        tc6.setPreferredWidth(100);
        tabellog.setModel(AllObject.login.viewTabell());
        framePelanggan.add(scrollPaneVoucher);
        
       JButton buttonlogin=new JButton("Login");
       buttonlogin.setFont(new Font("Consolas",Font.PLAIN,14));
       buttonlogin.setBackground(Color.white);
       buttonlogin.setForeground(Color.black);
       buttonlogin.setBounds(300, 420, 90, 30);
       buttonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nopc = textNo.getText();
                String notransaksi = textNotransaksi.getText();
                boolean ketemu = false;
                for (int i = 0; i < AllObject.transaksi.getIndex(); i++) {
                    if (nopc.equals(AllObject.transaksi.dataTransaksi[i].getNo_transaksi()) && notransaksi.equals(AllObject.transaksi.dataTransaksi[i].getNo_pc())) {
                        ketemu = true;
                    }
                }
                System.out.println(ketemu);
                if (ketemu == true){
                    try {
                    Date tanggal=new SimpleDateFormat("dd/MM/yyyy").parse(texttanggal.getText());
                    SimpleDateFormat formatter5=new SimpleDateFormat("HH:mm:ss");
                    Date jamlogin=formatter5.parse(textlogin.getText());
                    AllObject.login.insert( notransaksi, nopc, tanggal, jamlogin);
                   JOptionPane.showMessageDialog(null, "\nNo pc"+nopc+"\nNo Transaksi"+notransaksi);
                   tabellog.setModel(AllObject.login.viewTabel());
                    } catch (ParseException ex) {
                        System.out.println(ex);
                    }
                }
            }
        });
       tabellog.setModel(AllObject.login.viewTabel());
        framePelanggan.add(buttonlogin);
       
       JButton buttonlogout=new JButton("Logout");
       buttonlogout.setFont(new Font("Consolas",Font.PLAIN,14));
       buttonlogout.setBackground(Color.white);
       buttonlogout.setForeground(Color.black);
       buttonlogout.setBounds(400, 420, 90, 30);
       buttonlogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nopc = textNo.getText();
                String notransaksi = textNotransaksi.getText();
                int getSisawaktu =Integer.parseInt(textsisawaktu.getText());
                boolean ketemu = false;
                for (int i = 0; i < AllObject.transaksi.getIndex(); i++) {
                    if (nopc.equals(AllObject.transaksi.dataTransaksi[i].getNo_transaksi()) && notransaksi.equals(AllObject.transaksi.dataTransaksi[i].getNo_pc())) {
                        ketemu = true;
                    }
                }
                System.out.println(ketemu);
                if (ketemu == true){
                    try {
                    Date tanggal=new SimpleDateFormat("dd/MM/yyyy").parse(texttanggal.getText());
                    SimpleDateFormat formatter5=new SimpleDateFormat("HH:mm:ss");
                    Date jamlogin=formatter5.parse(textlogin.getText());
                    Date jamlogout=formatter5.parse(textlogout.getText());             
                    AllObject.login.update(notransaksi,nopc,tanggal,jamlogin,jamlogout,getSisawaktu);
                    JOptionPane.showMessageDialog(null, "\nNo pc"+nopc+"\nNo Transaksi"+notransaksi);
                    tabellog.setModel(AllObject.login.viewTabell());
                    } catch (ParseException ex) {
                        System.out.println(ex);
                    }
                }
            }
        });
       tabellog.setModel(AllObject.login.viewTabell());
        framePelanggan.add(buttonlogout);
        
        JButton backButton=new JButton("Kembali");
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(Color.black);
        backButton.setBounds(120, 420, 90, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            mainframe main=new mainframe();
            framePelanggan.dispose();
            }
        });
        framePelanggan.add(backButton);
       
        framePelanggan.setVisible(true);
    }
 }