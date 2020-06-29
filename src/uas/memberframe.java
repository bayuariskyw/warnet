package uas;
import controller.AdminController;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import controller.AllObject;
public class memberframe {
    public memberframe(){
    JFrame DaftarMemberFrame=new JFrame("Member");
        DaftarMemberFrame.setSize(900, 650);
        DaftarMemberFrame.getContentPane().setBackground(Color.white);
        DaftarMemberFrame.setLocationRelativeTo(null);
        DaftarMemberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DaftarMemberFrame.setTitle("Member");
        DaftarMemberFrame.setLayout(null);
        
        JLabel labelF=new JLabel("Member");
        labelF.setFont(new Font("Consolas",Font.BOLD,24));
        labelF.setBackground(Color.white);
        labelF.setForeground(Color.black);
        labelF.setBounds(330, 50, 170, 30);
        DaftarMemberFrame.add(labelF);
        
        JLabel labelidmem=new JLabel("Id member");
        labelidmem.setFont(new Font("Consolas",Font.PLAIN,14));
        labelidmem.setBackground(Color.white);
        labelidmem.setForeground(Color.black);
        labelidmem.setBounds(25, 100, 120, 30);
        DaftarMemberFrame.add(labelidmem);
        
        JTextField textidmem=new JTextField();
        textidmem.setFont(new Font("Consolas",Font.PLAIN,14));
        textidmem.setBackground(Color.white);
        textidmem.setForeground(Color.black);
        textidmem.setBounds(120, 100, 120, 30);
        DaftarMemberFrame.add(textidmem);
        
        JLabel labelId=new JLabel("Id admin");
        labelId.setFont(new Font("Consolas",Font.PLAIN,14));
        labelId.setBackground(Color.white);
        labelId.setForeground(Color.black);
        labelId.setBounds(25, 150, 120, 30);
        DaftarMemberFrame.add(labelId);
        
        JTextField textId=new JTextField();
        textId.setFont(new Font("Consolas",Font.PLAIN,14));
        textId.setBackground(Color.white);
        textId.setForeground(Color.black);
        textId.setBounds(120, 150, 120, 30);
        DaftarMemberFrame.add(textId);
        textId.setText(AllObject.id_admin);
        
        JLabel labelpass=new JLabel("Password");
        labelpass.setFont(new Font("Consolas",Font.PLAIN,14));
        labelpass.setBackground(Color.white);
        labelpass.setForeground(Color.black);
        labelpass.setBounds(25, 200, 120, 30);
        DaftarMemberFrame.add(labelpass);
        
        JTextField textpass=new JTextField();
        textpass.setFont(new Font("Consolas",Font.PLAIN,14));
        textpass.setBackground(Color.white);
        textpass.setForeground(Color.black);
        textpass.setBounds(120, 200, 120, 30);
        DaftarMemberFrame.add(textpass);
        
        JLabel labelnammem=new JLabel("nama member");
        labelnammem.setFont(new Font("Consolas",Font.PLAIN,14));
        labelnammem.setBackground(Color.white);
        labelnammem.setForeground(Color.black);
        labelnammem.setBounds(25, 250, 120, 30);
        DaftarMemberFrame.add(labelnammem);
        
        JTextField textnammem=new JTextField();
        textnammem.setFont(new Font("Consolas",Font.PLAIN,14));
        textnammem.setBackground(Color.white);
        textnammem.setForeground(Color.black);
        textnammem.setBounds(120, 250, 120, 30);
        DaftarMemberFrame.add(textnammem);
        
        JLabel labeltlp=new JLabel("no tlp");
        labeltlp.setFont(new Font("Consolas",Font.PLAIN,14));
        labeltlp.setBackground(Color.white);
        labeltlp.setForeground(Color.black);
        labeltlp.setBounds(25, 300, 120, 30);
        DaftarMemberFrame.add(labeltlp);
        
        JTextField texttlp=new JTextField();
        texttlp.setFont(new Font("Consolas",Font.PLAIN,14));
        texttlp.setBackground(Color.white);
        texttlp.setForeground(Color.black);
        texttlp.setBounds(120, 300, 120, 30);
        DaftarMemberFrame.add(texttlp);
        
        JLabel labelDur=new JLabel("Duration");
        labelDur.setFont(new Font("Consolas",Font.PLAIN,14));
        labelDur.setBackground(Color.white);
        labelDur.setForeground(Color.black);
        labelDur.setBounds(25, 350, 120, 30);
        DaftarMemberFrame.add(labelDur);
        
        JTextField textDur=new JTextField();
        textDur.setFont(new Font("Consolas",Font.PLAIN,14));
        textDur.setBackground(Color.white);
        textDur.setForeground(Color.black);
        textDur.setBounds(120, 350, 120, 30);
        DaftarMemberFrame.add(textDur);
        
        String[] fieldData={"id member", "id admin", "Password", "Nama member", "No tlp", "Duration"};
        DefaultTableModel tabelDataMember=new DefaultTableModel(fieldData,0);
        JTable tabelmem=new JTable(tabelDataMember);
        TableColumn tc1=new TableColumn(),tc2=new TableColumn(),tc3=new TableColumn(),tc4=new TableColumn(),tc5=new TableColumn(),tc6=new TableColumn();
        JScrollPane scrollPaneVoucher=new JScrollPane(tabelmem);
        scrollPaneVoucher.setBounds(250, 150, 550, 300);
        tc1=tabelmem.getColumnModel().getColumn(0);
        tc2=tabelmem.getColumnModel().getColumn(1);
        tc3=tabelmem.getColumnModel().getColumn(2);
        tc4=tabelmem.getColumnModel().getColumn(3);
        tc5=tabelmem.getColumnModel().getColumn(4);
        tc6=tabelmem.getColumnModel().getColumn(5);
        tc1.setPreferredWidth(100);
        tc2.setPreferredWidth(100);
        tc3.setPreferredWidth(100);
        tc4.setPreferredWidth(100);
        tc5.setPreferredWidth(100);
        tc6.setPreferredWidth(100);
        tabelmem.setModel(AllObject.member.viewTable1());
        DaftarMemberFrame.add(scrollPaneVoucher);
        
        JButton ButtonIn=new JButton("Insert");
        ButtonIn.setFont(new Font("Consolas",Font.PLAIN,14));
        ButtonIn.setBackground(Color.white);
        ButtonIn.setForeground(Color.black);
        ButtonIn.setBounds(250, 100, 120, 30);
        ButtonIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 String getId_member=textidmem.getText();
                 String getId_admin=textId.getText();
                 String getPassword=textpass.getText();
                 String getNama_member=textnammem.getText();
                 int getNo_tlp=Integer.parseInt(texttlp.getText());
                 int getDuration=Integer.parseInt(textDur.getText());
                 if(textidmem.getText().equals("")||textId.getText().equals("")||textpass.getText().equals("")||textnammem.getText().equals("")||texttlp.getText().equals("")||textDur.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                   AllObject.id_member=getId_member;
                   AllObject.member.insert(getId_member,getId_admin,getPassword,getNama_member,getNo_tlp,getDuration);
                   JOptionPane.showMessageDialog(null, "id admin"+getId_admin+"\nDuration"+getDuration);
                   tabelmem.setModel(AllObject.member.viewTable1());
                }
            }
        });
        tabelmem.setModel(AllObject.member.viewTable1());
        DaftarMemberFrame.add(ButtonIn);
        
        JButton ButtonUp=new JButton("Update");
        ButtonUp.setFont(new Font("Consolas",Font.PLAIN,14));
        ButtonUp.setBackground(Color.white);
        ButtonUp.setForeground(Color.black);
        ButtonUp.setBounds(380, 100, 120, 30);
        ButtonUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) { 
                String getId_member=textidmem.getText();
                String getId_admin=textId.getText();
                 String getPassword=textpass.getText();
                 String getNama_member=textnammem.getText();
                 int getNo_tlp=Integer.parseInt(texttlp.getText());
                 int getDuration=Integer.parseInt(textDur.getText());
                 try{
                 if(textidmem.getText().equals("")||textId.getText().equals("")||textpass.getText().equals("")||textnammem.getText().equals("")||texttlp.getText().equals("")||textDur.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                   AllObject.id_member=getId_member;
                   AllObject.member.update(getId_member,getId_admin,getPassword,getNama_member,getNo_tlp,getDuration);
                   JOptionPane.showMessageDialog(null, "Data berhasil di update");
                   tabelmem.setModel(AllObject.member.viewTable1());
                }}catch(HeadlessException nullException) {
                JOptionPane.showMessageDialog(null, " masukkan data ");
            }}
        });
        tabelmem.setModel(AllObject.member.viewTable1());
        DaftarMemberFrame.add(ButtonUp);
        
        JButton ButtonDe=new JButton("Delete");
        ButtonDe.setFont(new Font("Consolas",Font.PLAIN,14));
        ButtonDe.setBackground(Color.white);
        ButtonDe.setForeground(Color.black);
        ButtonDe.setBounds(510, 100, 120, 30);
        ButtonDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String getId_member=textidmem.getText(); 
                String getIdadmin=textId.getText(); 
                 String getPassword=textpass.getText();
                 String getNama_member=textnammem.getText();
                 int getNo_tlp=Integer.parseInt(texttlp.getText());
                 int getDuration=Integer.parseInt(textDur.getText());
                 if(textId.getText().equals("")||textidmem.getText().equals("")||textpass.getText().equals("")||textnammem.getText().equals("")||texttlp.getText().equals("")||textDur.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                   AllObject.id_member=getId_member;
                   AllObject.member.delete(getId_member);
                   JOptionPane.showMessageDialog(null, "Data berhasil di delete");
                   tabelmem.setModel(AllObject.member.viewTable1());
                }
            }
        });
        tabelmem.setModel(AllObject.member.viewTable1());
        DaftarMemberFrame.add(ButtonDe);
           
        JButton outButton = new JButton("Keluar");
        outButton.setBackground(Color.white);
        outButton.setForeground(Color.black);
        outButton.setBounds(120, 470, 90, 30);
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mainframe main = new mainframe();
                DaftarMemberFrame.dispose();
            }
        });
        DaftarMemberFrame.add(outButton);
        
        JButton backButton=new JButton("Kembali");
        backButton.setBackground(Color.white);
        backButton.setForeground(Color.black);
        backButton.setBounds(220, 470, 90, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuframe menu=new menuframe();
                DaftarMemberFrame.dispose();
            }
        });
        DaftarMemberFrame.add(backButton);
        DaftarMemberFrame.setVisible(true);
}
}