package uas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import controller.AllObject;
public class voucherframe extends JFrame{  
    public voucherframe(){
        JFrame voucherFrame=new JFrame("Voucher");
        voucherFrame.setSize(550, 550);
        voucherFrame.getContentPane().setBackground(Color.white);
        voucherFrame.setLocationRelativeTo(null);
        voucherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        voucherFrame.setTitle("Voucher");
        voucherFrame.setLayout(null);
        
        JLabel labelBayar=new JLabel("Voucher");
        labelBayar.setFont(new Font("Consolas",Font.BOLD,24));
        labelBayar.setBackground(Color.white);
        labelBayar.setForeground(Color.black);
        labelBayar.setBounds(250, 50, 150, 30);
        voucherFrame.add(labelBayar);
        
        JLabel labelId=new JLabel("id admin");
        labelId.setFont(new Font("Consolas",Font.PLAIN,14));
        labelId.setBackground(Color.white);
        labelId.setForeground(Color.black);
        labelId.setBounds(25, 100, 120, 30);
        voucherFrame.add(labelId);
        
        JTextField textId=new JTextField();
        textId.setFont(new Font("Consolas",Font.PLAIN,14));
        textId.setBackground(Color.white);
        textId.setForeground(Color.black);
        textId.setBounds(25, 130, 120, 30);
        voucherFrame.add(textId);
        textId.setText(AllObject.id_admin);
        
        JLabel labelVoucher=new JLabel("Kode voucher");
        labelVoucher.setFont(new Font("Consolas",Font.PLAIN,14));
        labelVoucher.setBackground(Color.white);
        labelVoucher.setForeground(Color.black);
        labelVoucher.setBounds(25, 170, 100, 30);
        voucherFrame.add(labelVoucher);
        
        JTextField textVoucher=new JTextField();
        textVoucher.setFont(new Font("Consolas",Font.PLAIN,14));
        textVoucher.setBackground(Color.white);
        textVoucher.setForeground(Color.black);
        textVoucher.setBounds(25, 200, 120, 30);
        voucherFrame.add(textVoucher);
        
        JLabel labelJam=new JLabel("Duration");
        labelJam.setFont(new Font("Consolas",Font.PLAIN,14));
        labelJam.setBackground(Color.white);
        labelJam.setForeground(Color.black);
        labelJam.setBounds(25, 240, 120, 30);
        voucherFrame.add(labelJam);
        
        JTextField textJam=new JTextField();
        textJam.setFont(new Font("Consolas",Font.PLAIN,14));
        textJam.setBackground(Color.white);
        textJam.setForeground(Color.black);
        textJam.setBounds(25, 270, 120, 30);
        voucherFrame.add(textJam);
        
        String[] fieldData={"id admin","Kode voucher","Duration"};
        DefaultTableModel TabelDataVoucher=new DefaultTableModel(fieldData,0);
        JTable tabelVoucher=new JTable(TabelDataVoucher);
        TableColumn tc1=new TableColumn(),tc2=new TableColumn(),tc3=new TableColumn();
        JScrollPane scrollPaneVoucher=new JScrollPane(tabelVoucher);
        scrollPaneVoucher.setBounds(230, 100, 300, 300);
        tc1=tabelVoucher.getColumnModel().getColumn(0);
        tc2=tabelVoucher.getColumnModel().getColumn(1);
        tc3=tabelVoucher.getColumnModel().getColumn(2);
        tc1.setPreferredWidth(100);
        tc2.setPreferredWidth(100);
        tc3.setPreferredWidth(100);
        tabelVoucher.setModel(AllObject.voucher.viewTablel());
        voucherFrame.add(scrollPaneVoucher);
        
        JButton ButtonIn=new JButton("Input");
        ButtonIn.setFont(new Font("Consolas",Font.PLAIN,14));
        ButtonIn.setBackground(Color.white);
        ButtonIn.setForeground(Color.black);
        ButtonIn.setBounds(25, 320, 120, 30);
        ButtonIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String getId_admin=textId.getText();
                String getKode_voucher=textVoucher.getText();
                int getDuration=Integer.parseInt(textJam.getText());
                
                if(textId.getText().equals("")||textVoucher.getText().equals("")||textJam.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data kurang");
                }
                else{
                   AllObject.kode_voucher=getKode_voucher;
                   AllObject.voucher.insert(getId_admin,getKode_voucher, getDuration);
                    JOptionPane.showMessageDialog(null, "id admin"+getId_admin+"\nKode voucher"+getKode_voucher+"\nDuration"+getDuration);
                    tabelVoucher.setModel(AllObject.voucher.viewTablel());
                }
            }
        });
        tabelVoucher.setModel(AllObject.voucher.viewTablel());
        voucherFrame.add(ButtonIn);
        
        JButton outButton = new JButton("Keluar");
        outButton.setBackground(Color.white);
        outButton.setForeground(Color.black);
        outButton.setBounds(25, 360, 90, 30);
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mainframe main = new mainframe();
                voucherFrame.dispose();
            }
        });
        voucherFrame.add(outButton);
        
        JButton backButton=new JButton("Kembali");
        backButton.setBackground(Color.white);
        backButton.setForeground(Color.black);
        backButton.setBounds(120, 360, 90, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuframe menu=new menuframe();
                voucherFrame.dispose();
            }
        });
        voucherFrame.add(backButton);
        voucherFrame.setVisible(true);
    }
}