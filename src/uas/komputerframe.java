package uas;  
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controller.AllObject;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class komputerframe extends JFrame{
    public komputerframe(){
        JFrame komputerframe=new JFrame("Komputer");
        komputerframe.setSize(650, 550);
        komputerframe.getContentPane().setBackground(Color.white);
        komputerframe.setLocationRelativeTo(null);
        komputerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        komputerframe.setTitle("Komputer");
        komputerframe.setLayout(null);
        
        JLabel labelBayar=new JLabel("Komputer");
        labelBayar.setFont(new Font("Consolas",Font.BOLD,24));
        labelBayar.setBackground(Color.white);
        labelBayar.setForeground(Color.black);
        labelBayar.setBounds(275, 50, 150, 30);
        komputerframe.add(labelBayar);
        
        JLabel labelNo=new JLabel("No pc");
        labelNo.setFont(new Font("Consolas",Font.PLAIN,14));
        labelNo.setBackground(Color.white);
        labelNo.setForeground(Color.black);
        labelNo.setBounds(25, 100, 120, 30);
        komputerframe.add(labelNo);
        
        JTextField textNo=new JTextField();
        textNo.setFont(new Font("Consolas",Font.PLAIN,14));
        textNo.setBackground(Color.white);
        textNo.setForeground(Color.black);
        textNo.setBounds(25, 130, 120, 30);
        komputerframe.add(textNo);
        
        JLabel labelNam=new JLabel("Nama pc");
        labelNam.setFont(new Font("Consolas",Font.PLAIN,14));
        labelNam.setBackground(Color.white);
        labelNam.setForeground(Color.black);
        labelNam.setBounds(25, 170, 100, 30);
        komputerframe.add(labelNam);
        
        JTextField textNam=new JTextField();
        textNam.setFont(new Font("Consolas",Font.PLAIN,14));
        textNam.setBackground(Color.white);
        textNam.setForeground(Color.black);
        textNam.setBounds(25, 200, 120, 30);
        komputerframe.add(textNam);
        
        JLabel labelKet=new JLabel("Keterangan");
        labelKet.setFont(new Font("Consolas",Font.PLAIN,14));
        labelKet.setBackground(Color.white);
        labelKet.setForeground(Color.black);
        labelKet.setBounds(25, 240, 120, 30);
        komputerframe.add(labelKet);
        
        JTextField textKet=new JTextField();
        textKet.setFont(new Font("Consolas",Font.PLAIN,14));
        textKet.setBackground(Color.white);
        textKet.setForeground(Color.black);
        textKet.setBounds(25, 270, 120, 30);
        komputerframe.add(textKet);
        
        String[] fieldData={"No pc","Nama pc","Keterangan"};
        DefaultTableModel tabeldatakomputer=new DefaultTableModel(fieldData,0);
        JTable tabelKomputer=new JTable(tabeldatakomputer);
        TableColumn tc1=new TableColumn(),tc2=new TableColumn(),tc3=new TableColumn();
        JScrollPane scrollPaneAdmin=new JScrollPane(tabelKomputer);
        scrollPaneAdmin.setBounds(230, 100, 400, 300);
        tc1=tabelKomputer.getColumnModel().getColumn(0);
        tc2=tabelKomputer.getColumnModel().getColumn(1);
        tc3=tabelKomputer.getColumnModel().getColumn(2);
        tc1.setPreferredWidth(100);
        tc2.setPreferredWidth(100);
        tc3.setPreferredWidth(100);
        tabelKomputer.setModel(AllObject.komputer.viewTabel());
        komputerframe.add(scrollPaneAdmin);
        
        JButton ButtonIn=new JButton("Input");
        ButtonIn.setFont(new Font("Consolas",Font.PLAIN,14));
        ButtonIn.setBackground(Color.white);
        ButtonIn.setForeground(Color.black);
        ButtonIn.setBounds(25, 320, 120, 30);
        ButtonIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String getNo_pc=textNo.getText();
                String getNama_pc=textNam.getText();
                String getKeterangan=textKet.getText();
                 if(textNo.getText().equals("")||textNam.getText().equals("")||textKet.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                     AllObject.no_pc=getNo_pc;
                     AllObject.komputer.insert(getNo_pc, getNama_pc,getKeterangan);
                    JOptionPane.showMessageDialog(null, "Data berhasil di insert");
                    tabelKomputer.setModel(AllObject.komputer.viewTabel());
                }
            }
        });
        tabelKomputer.setModel(AllObject.komputer.viewTabel());
        komputerframe.add(ButtonIn);
        
        JButton outButton = new JButton("Keluar");
        outButton.setBackground(Color.white);
        outButton.setForeground(Color.black);
        outButton.setBounds(25, 360, 90, 30);
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mainframe main = new mainframe();
                komputerframe.dispose();
            }
        });
        komputerframe.add(outButton);
        
        JButton backButton=new JButton("Kembali");
        backButton.setBackground(Color.white);
        backButton.setForeground(Color.black);
        backButton.setBounds(120, 360, 90, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuframe menu=new menuframe();
                komputerframe.dispose();
            }
        });
        komputerframe.add(backButton);
        komputerframe.setVisible(true);
    
    }
}