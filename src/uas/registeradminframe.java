package uas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controller.AllObject;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

    public class registeradminframe {
    public registeradminframe() {
        JFrame Adminframe = new JFrame();
        Adminframe.setSize(700, 550);
        Adminframe.getContentPane().setBackground(Color.white);
        Adminframe.setLocationRelativeTo(null);
        Adminframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Adminframe.setTitle("Register Admin");
        Adminframe.setLayout(null);
        
        JLabel labelAdmin = new JLabel("ADMIN");
        labelAdmin.setFont(new Font("Consolas", Font.BOLD, 24));
        labelAdmin.setBackground(Color.white);
        labelAdmin.setForeground(Color.black);
        labelAdmin.setBounds(350, 0, 200, 100);
        Adminframe.add(labelAdmin);
        
        JLabel labelId = new JLabel("Id admin");
        labelId.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelId.setBackground(Color.white);
        labelId.setForeground(Color.BLACK);
        labelId.setBounds(25, 100, 100, 30);
        Adminframe.add(labelId);
        
        JTextField textId = new JTextField();
        textId.setFont(new Font("Consolas", Font.PLAIN, 14));
        textId.setBackground(Color.white);
        textId.setForeground(Color.black);
        textId.setBounds(130, 100, 120, 30);
        Adminframe.add(textId);
        
        JLabel labelPass = new JLabel("Password");
        labelPass.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelPass.setBackground(Color.white);
        labelPass.setForeground(Color.black);
        labelPass.setBounds(25, 160, 100, 30);
        Adminframe.add(labelPass);
        
        JPasswordField textPass = new JPasswordField();
        textPass.setFont(new Font("Consolas", Font.PLAIN, 14));
        textPass.setBackground(Color.white);
        textPass.setForeground(Color.black);
        textPass.setBounds(130, 160, 120, 30);
        textPass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null, "angka oi");
                }
            }});Adminframe.add(textPass);
        
        JLabel labelNmAd = new JLabel("Nama admin");
        labelNmAd.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelNmAd.setBackground(Color.white);
        labelNmAd.setForeground(Color.black);
        labelNmAd.setBounds(25, 220, 100, 30);
        Adminframe.add(labelNmAd);
        
        JTextField textNmAd = new JTextField();
        textNmAd.setFont(new Font("Consolas", Font.PLAIN, 14));
        textNmAd.setBackground(Color.white);
        textNmAd.setForeground(Color.black);
        textNmAd.setBounds(130, 220, 120, 30);
        Adminframe.add(textNmAd);
        
        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelAlamat.setBackground(Color.white);
        labelAlamat.setForeground(Color.black);
        labelAlamat.setBounds(25, 280, 100, 30);
        Adminframe.add(labelAlamat);
        
        JTextField textAlamat = new JTextField();
        textAlamat.setFont(new Font("Consolas", Font.PLAIN, 14));
        textAlamat.setBackground(Color.white);
        textAlamat.setForeground(Color.black);
        textAlamat.setBounds(130, 280, 120, 30);
        Adminframe.add(textAlamat);
        
        JLabel labelTelp = new JLabel("No telp");
        labelTelp.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelTelp.setBackground(Color.white);
        labelTelp.setForeground(Color.black);
        labelTelp.setBounds(25, 340, 100, 30);
        Adminframe.add(labelTelp);
        
        JTextField textTelp = new JTextField();
        textTelp.setFont(new Font("Consolas", Font.PLAIN, 14));
        textTelp.setBackground(Color.white);
        textTelp.setForeground(Color.black);
        textTelp.setBounds(130, 340, 120, 30);
        textTelp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null, "angka");
                }
            }});Adminframe.add(textTelp);
            
        String[] fieldData={"Id admin","Password","Nama admin","Alamat","No telp"};
        DefaultTableModel tabeldataadmin=new DefaultTableModel(fieldData,0);
        JTable tabelAdmin=new JTable(tabeldataadmin);
        TableColumn tc1=new TableColumn(),tc2=new TableColumn(),tc3=new TableColumn(),tc4=new TableColumn(),tc5=new TableColumn();
        JScrollPane scrollPaneAdmin=new JScrollPane(tabelAdmin);
        scrollPaneAdmin.setBounds(280, 100, 400, 300);
        tc1=tabelAdmin.getColumnModel().getColumn(0);
        tc2=tabelAdmin.getColumnModel().getColumn(1);
        tc3=tabelAdmin.getColumnModel().getColumn(2);
        tc4=tabelAdmin.getColumnModel().getColumn(3);
        tc5=tabelAdmin.getColumnModel().getColumn(4);
        tc1.setPreferredWidth(100);
        tc2.setPreferredWidth(100);
        tc3.setPreferredWidth(100);
        tc4.setPreferredWidth(100);
        tc5.setPreferredWidth(100);
        tabelAdmin.setModel(AllObject.admin.viewTabel());
        Adminframe.add(scrollPaneAdmin);
        
 
        
        JButton buttonIn = new JButton("Input");
        buttonIn.setFont(new Font("Consolas", Font.PLAIN, 14));
        buttonIn.setBackground(Color.white);
        buttonIn.setForeground(Color.black);
        buttonIn.setBounds(25, 430, 100, 20);
        buttonIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String getId_admin=textId.getText();
                String getPassword=textPass.getText();
                String getNama_admin=textNmAd.getText();
                String getAlamat=textAlamat.getText();
                String getNo_telp=textTelp.getText();
                if(textId.getText().equals("")||textPass.getText().equals("")||textNmAd.getText().equals("")||textAlamat.getText().equals("")||textTelp.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "masukkan dulu datanya");
                }
                else{
                    AllObject.id_admin=getId_admin;
                    AllObject.admin.insert(getId_admin, getPassword,getNama_admin,getAlamat,getNo_telp);
                    JOptionPane.showMessageDialog(null, "Data berhasil di insert");
                    tabelAdmin.setModel(AllObject.admin.viewTabel());
                }
            }
        });
        tabelAdmin.setModel(AllObject.admin.viewTabel());
        Adminframe.add(buttonIn);
        
        
        JButton outButton=new JButton("Keluar");
        outButton.setFont(new Font("Consolas", Font.PLAIN, 14));
        outButton.setBackground(Color.white);
        outButton.setForeground(Color.black);
        outButton.setBounds(25 , 465, 100, 20);
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mainframe main=new mainframe();
                Adminframe.dispose();
            }
        });
        Adminframe.add(outButton);
        
        JButton loginButton=new JButton("Login");
        loginButton.setFont(new Font("Consolas", Font.PLAIN, 14));
        loginButton.setBackground(Color.white);
        loginButton.setForeground(Color.black);
        loginButton.setBounds(250, 430, 100, 20);
        loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            loginadminframe loginadmin=new loginadminframe();
            Adminframe.dispose();
        }
    });
    Adminframe.add(loginButton);
    Adminframe.setVisible(true);    
    }
  }    