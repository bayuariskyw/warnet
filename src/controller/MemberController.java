package controller;
import database.Koneksi;
import model.*;
import javax.swing.table.DefaultTableModel;
public class MemberController {
    
    public Member[] dataMember = new Member[100];
    Koneksi koneksi=new Koneksi();
    public int index = 0;
    
    public void insert(String id_member,String id_admin,String password,String nama_member,int no_tlp,int duration){
        Member member =new Member();
        member.insertMember(id_member,id_admin, password, nama_member, no_tlp, duration);
        koneksi.ManipulasiData("insert into member values "+id_member+", "+id_admin+", "+password+", "+nama_member+", "+no_tlp+", "+duration);
        dataMember[index] = member;
        index++;
    }
    
   public void update(String cari,String id_member,String password,String nama_member,int no_tlp,int duration){
       boolean ketemu=false;     
       for(int i=0; i<index; i++){
            if (dataMember[i].getId_member().equals(cari)){
            dataMember[i].setPassword(password);
            dataMember[i].setNama_member(nama_member);
            dataMember[i].setNo_tlp(no_tlp);
            dataMember[i].setDuration(duration);
         }
      }
       if (ketemu==true) {
            koneksi.ManipulasiData("update member set id_member = "+id_member
            +", password = "+password+", nama_member = "+nama_member+", no_tlp"+no_tlp+", duration"+duration);
       }
   }
   
   public void delete(String cari){
        Member temp=null;
        boolean ketemu=false;
        for(int i=1; i<index;i++){if (
                dataMember[i].getId_member().equals(cari)){
                if(i<index){
                    dataMember[i] = temp;
                    dataMember[i+1] = dataMember[i];
                    temp = dataMember[i+1];
                }
                ketemu=true;
            }
        }
        if(ketemu==true){
            koneksi.ManipulasiData("delete from member where Id_member = "+cari);
            index--;
        }
    }
    
    public DefaultTableModel viewTable1(){
        DefaultTableModel tabelMember=new DefaultTableModel();
        tabelMember.addColumn("id member");
        tabelMember.addColumn("id admin"); 
        tabelMember.addColumn("Password");
        tabelMember.addColumn("Nama member");
        tabelMember.addColumn("No tlp");
        tabelMember.addColumn("Duration");
        
        for(int i=0; i<index; i++){
            Object[] temp1=new Object[6];
            temp1[0]=dataMember[i].getId_member();
            temp1[1]=dataMember[i].getId_admin();
            temp1[2]=dataMember[i].getPassword();
            temp1[3]=dataMember[i].getNama_member();
            temp1[4]=dataMember[i].getNo_tlp();
            temp1[5]=dataMember[i].getDuration();
            tabelMember.addRow(temp1);
        }
        return tabelMember;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
    public Member cariObjek(String id_member) {
        Member temp = null;
        for (int i = 0; i < index; i++) {
            if (dataMember[i].getId_member().equals(id_member)) {
                temp = dataMember[i];
            }
        }
        return temp;
    }
 }