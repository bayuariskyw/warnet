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

public class transaksiframe {
    public transaksiframe(){
        JFrame transaksiframe=new JFrame("Transaksi");
        transaksiframe.setSize(1000, 650);
        transaksiframe.getContentPane().setBackground(Color.white);
        transaksiframe.setLocationRelativeTo(null);
        transaksiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        transaksiframe.setTitle("Transaksi");
        transaksiframe.setLayout(null);
        
        JLabel labelF=new JLabel("Transaksi");
        labelF.setFont(new Font("Consolas",Font.BOLD,24));
        labelF.setBackground(Color.white);
        labelF.setForeground(Color.black);
        labelF.setBounds(330, 50, 170, 30);
        transaksiframe.add(labelF);
        
        JLabel labelTransaksi=new JLabel("No transaksi");
        labelTransaksi.setFont(new Font("Consolas",Font.PLAIN,14));
        labelTransaksi.setBackground(Color.white);
        labelTransaksi.setForeground(Color.black);
        labelTransaksi.setBounds(25, 100, 120, 30);
        transaksiframe.add(labelTransaksi);
        
        JTextField textTransaksi=new JTextField();
        textTransaksi.setFont(new Font("Consolas",Font.PLAIN,14));
        textTransaksi.setBackground(Color.white);
        textTransaksi.setForeground(Color.black);
        textTransaksi.setBounds(120, 100, 120, 30);
        transaksiframe.add(textTransaksi);
        
        JLabel labelId=new JLabel("Id member");
        labelId.setFont(new Font("Consolas",Font.PLAIN,14));
        labelId.setBackground(Color.white);
        labelId.setForeground(Color.black);
        labelId.setBounds(25, 150, 120, 30);
        transaksiframe.add(labelId);
        
        JTextField textId=new JTextField();
        textId.setFont(new Font("Consolas",Font.PLAIN,14));
        textId.setBackground(Color.white);
        textId.setForeground(Color.black);
        textId.setBounds(120, 150, 120, 30);
        transaksiframe.add(textId);
        textId.setText(AllObject.id_member);
        
        JLabel labelKode=new JLabel("Kode voucher");
        labelKode.setFont(new Font("Consolas",Font.PLAIN,14));
        labelKode.setBackground(Color.white);
        labelKode.setForeground(Color.black);
        labelKode.setBounds(25, 200, 120, 30);
        transaksiframe.add(labelKode);
        
        JTextField textKode=new JTextField();
        textKode.setFont(new Font("Consolas",Font.PLAIN,14));
        textKode.setBackground(Color.white);
        textKode.setForeground(Color.black);
        textKode.setBounds(120, 200, 120, 30);
        transaksiframe.add(textKode);
        textKode.setText(AllObject.kode_voucher);
        
        JLabel labelNo=new JLabel("No pc");
        labelNo.setFont(new Font("Consolas",Font.PLAIN,14));
        labelNo.setBackground(Color.white);
        labelNo.setForeground(Color.black);
        labelNo.setBounds(25, 250, 120, 30);
        transaksiframe.add(labelNo);
        
        JTextField textNo=new JTextField();
        textNo.setFont(new Font("Consolas",Font.PLAIN,14));
        textNo.setBackground(Color.white);
        textNo.setForeground(Color.black);
        textNo.setBounds(120, 250, 120, 30);
        transaksiframe.add(textNo);
        textNo.setText(AllObject.no_pc);
        
        JLabel labelDur=new JLabel("Duration");
        labelDur.setFont(new Font("Consolas",Font.PLAIN,14));
        labelDur.setBackground(Color.white);
        labelDur.setForeground(Color.black);
        labelDur.setBounds(25, 300, 120, 30);
        transaksiframe.add(labelDur);
        
        JTextField textDur=new JTextField();
        textDur.setFont(new Font("Consolas",Font.PLAIN,14));
        textDur.setBackground(Color.white);
        textDur.setForeground(Color.black);
        textDur.setBounds(120, 300, 120, 30);
        transaksiframe.add(textDur);
        
        JLabel labelHarga=new JLabel("Harga");
        labelHarga.setFont(new Font("Consolas",Font.PLAIN,14));
        labelHarga.setBackground(Color.white);
        labelHarga.setForeground(Color.black);
        labelHarga.setBounds(25, 350, 120, 30);
        transaksiframe.add(labelHarga);
        
        JTextField textHarga=new JTextField();
        textHarga.setFont(new Font("Consolas",Font.PLAIN,14));
        textHarga.setBackground(Color.white);
        textHarga.setForeground(Color.black);
        textHarga.setBounds(120, 350, 120, 30);
        transaksiframe.add(textHarga);
        
        JLabel labelBayar=new JLabel("Bayar");
        labelBayar.setFont(new Font("Consolas",Font.PLAIN,14));
        labelBayar.setBackground(Color.white);
        labelBayar.setForeground(Color.black);
        labelBayar.setBounds(25, 400, 120, 30);
        transaksiframe.add(labelBayar);
        
        JTextField textBayar=new JTextField();
        textBayar.setFont(new Font("Consolas",Font.PLAIN,14));
        textBayar.setBackground(Color.white);
        textBayar.setForeground(Color.black);
        textBayar.setBounds(120, 400, 120, 30);
        transaksiframe.add(textBayar);
        
        JLabel labelKem=new JLabel("Kembalian");
        labelKem.setFont(new Font("Consolas",Font.PLAIN,14));
        labelKem.setBackground(Color.white);
        labelKem.setForeground(Color.black);
        labelKem.setBounds(25, 450, 120, 30);
        transaksiframe.add(labelKem);
        
        JTextField textKem=new JTextField();
        textKem.setFont(new Font("Consolas",Font.PLAIN,14));
        textKem.setBackground(Color.white);
        textKem.setForeground(Color.black);
        textKem.setBounds(120, 450, 120, 30);
        transaksiframe.add(textKem);
        
        String[] fieldData={"No transaksi", "Id member", "Kode voucher", "No pc", "Duration", "harga", "bayar", "kembalian"};
        DefaultTableModel tabelDataTransaksi=new DefaultTableModel(fieldData,0);
        JTable tabelTran=new JTable(tabelDataTransaksi);
        TableColumn tc1=new TableColumn(),tc2=new TableColumn(),tc3=new TableColumn(),tc4=new TableColumn(),tc5=new TableColumn(),tc6=new TableColumn(),tc7=new TableColumn(),tc8=new TableColumn();
        JScrollPane scrollPaneVoucher=new JScrollPane(tabelTran);
        scrollPaneVoucher.setBounds(250, 150, 700, 330);
        tc1=tabelTran.getColumnModel().getColumn(0);
        tc2=tabelTran.getColumnModel().getColumn(1);
        tc3=tabelTran.getColumnModel().getColumn(2);
        tc4=tabelTran.getColumnModel().getColumn(3);
        tc5=tabelTran.getColumnModel().getColumn(4);
        tc6=tabelTran.getColumnModel().getColumn(5);
        tc7=tabelTran.getColumnModel().getColumn(6);
        tc8=tabelTran.getColumnModel().getColumn(7);
        tc1.setPreferredWidth(100);
        tc2.setPreferredWidth(100);
        tc3.setPreferredWidth(100);
        tc4.setPreferredWidth(100);
        tc5.setPreferredWidth(100);
        tc6.setPreferredWidth(100);
        tc7.setPreferredWidth(100);
        tc8.setPreferredWidth(100);
        tabelTran.setModel(AllObject.transaksi.viewTablel());
        transaksiframe.add(scrollPaneVoucher);
        
        JButton ButtonIn=new JButton("Insert");
        ButtonIn.setFont(new Font("Consolas",Font.PLAIN,14));
        ButtonIn.setBackground(Color.white);
        ButtonIn.setForeground(Color.black);
        ButtonIn.setBounds(250, 100, 120, 30);
        ButtonIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String getNo_transaksi=textTransaksi.getText();
                String getId_member=textId.getText();       
                String getKode_voucher=textKode.getText();
                String getNo_pc=textNo.getText();
                int getDuration=Integer.parseInt(textDur.getText());
                int getHarga=Integer.parseInt(textHarga.getText());
                int getBayar=Integer.parseInt(textBayar.getText());
                int getKembalian=Integer.parseInt(textKem.getText());
                 if(textId.getText().equals("")||textKode.getText().equals("")||textNo.getText().equals("")||textTransaksi.getText().equals("")||textDur.getText().equals("")||textHarga.getText().equals("")||textBayar.getText().equals("")||textKem.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                   AllObject.no_pc=getNo_pc;
                   AllObject.no_transaksi=getNo_transaksi;
                   AllObject.transaksi.insert(getNo_transaksi,getId_member,getKode_voucher,getNo_pc,getDuration,getHarga,getBayar,getKembalian);
                   JOptionPane.showMessageDialog(null, "Kode voucher"+getNo_transaksi+"\nId member"+getId_member+"\nNo pc"+getNo_pc);
                   tabelTran.setModel(AllObject.transaksi.viewTablel());
                }
            }
        });
        tabelTran.setModel(AllObject.transaksi.viewTablel());
        transaksiframe.add(ButtonIn);
           
        JButton outButton = new JButton("Keluar");
        outButton.setBackground(Color.white);
        outButton.setForeground(Color.black);
        outButton.setBounds(120, 500, 90, 30);
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mainframe main = new mainframe();
                transaksiframe.dispose();
            }
        });
        transaksiframe.add(outButton);
        
        JButton backButton=new JButton("Kembali");
        backButton.setBackground(Color.white);
        backButton.setForeground(Color.black);
        backButton.setBounds(220, 500, 90, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuframe menu=new menuframe();
                transaksiframe.dispose();
            }
        });
        transaksiframe.add(backButton);
        transaksiframe.setVisible(true);
    }
}
        