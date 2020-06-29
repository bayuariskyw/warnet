package controller;
import database.Koneksi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.*;
public class LoginpelangganController {
    public Login[] dataLogin =new Login[100];
    Koneksi koneksi=new Koneksi();
    int index=0;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat jamFormat = new SimpleDateFormat("hh:mm:ss");
    public void insert(String no_transaksi,String no_pc,Date tanggal,Date jamlogin){
        Login Login =new Login();
        Login.insertLogin( no_transaksi, no_pc, tanggal, jamlogin);
        koneksi.ManipulasiData("insert into login_06927 values "+no_transaksi+", "+no_pc+", "+tanggal+", "+jamlogin);
        dataLogin[index] = Login;
        index++;
    }
     public Login cariId(int cari){
        Login temp = dataLogin[cari];
        return temp;
    }
    public void update(String cari,String no_transaksi,Date tanggal,Date jamlogin,Date jamlogout,int sisawaktu){
        boolean ketemu=false;     
        for(int i=0; i<index; i++){
            if (dataLogin[i].getNo_transaksi().equals(cari)){
            dataLogin[i].setTanggal(tanggal);
            dataLogin[i].setJamlogin(jamlogin);
            dataLogin[i].setJamlogout(jamlogout);
            dataLogin[i].setSisawaktu(sisawaktu);
         }
      }
            if (ketemu==true) {
            koneksi.ManipulasiData("update login_06927 set No_transaksi = "+no_transaksi
            +", password = "+tanggal+", nama_member = "+jamlogin+", no_tlp"+jamlogout+", duration"+sisawaktu);
       }
   }
    
    public DefaultTableModel viewTabel() {
        DefaultTableModel login = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int a, int b) {
                return false;
            }
        };
        login.addColumn("No Transaksi");
        login.addColumn("No pc");
        login.addColumn("Tanggal");
        login.addColumn("Jam login");
        login.addColumn("Jam logout");
        login.addColumn("Sisa waktu");
        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[6];
            temp[0] = dataLogin[i].getNo_transaksi();
            temp[1] = dataLogin[i].getNo_pc();
            temp[2] = dateFormat.format(dataLogin[i].getTanggal());
            temp[3] = jamFormat.format(dataLogin[i].getJamlogin());
            login.addRow(temp);
        }
        return login;
    }
    public DefaultTableModel viewTabell() {
        DefaultTableModel login = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int a, int b) {
                return false;
            }
        };
        login.addColumn("No Transaksi");
        login.addColumn("No pc");
        login.addColumn("Tanggal");
        login.addColumn("Jam login");
        login.addColumn("Jam logout");
        login.addColumn("Sisa waktu");
        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[6];
            temp[0] = dataLogin[i].getNo_transaksi();
            temp[1] = dataLogin[i].getNo_pc();
            temp[2] = dateFormat.format(dataLogin[i].getTanggal());
            temp[3] = jamFormat.format(dataLogin[i].getJamlogin());
            temp[4] = jamFormat.format(dataLogin[i].getJamlogout());
            temp[5] = dataLogin[i].getSisawaktu();
            login.addRow(temp);
        }
        return login;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
}
