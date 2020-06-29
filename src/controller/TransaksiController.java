package controller;
import database.Koneksi;
import javax.swing.table.DefaultTableModel;
import model.*;
public class TransaksiController {
    public Transaksi[] dataTransaksi = new Transaksi[100];
    Koneksi koneksi=new Koneksi();
    public Transaksi transaksi;
    public int index = 0;
    
     public void insert(String no_transaksi,String id_member,String kode_voucher,String no_pc,int duration,int harga,int bayar,int kembalian) {
        Transaksi trans =new Transaksi();
        trans.insertTransaksi( no_transaksi, id_member, kode_voucher, no_pc, duration, harga, bayar, kembalian);
        koneksi.ManipulasiData("insert into transaksi values "+no_transaksi+", "+id_member+", "+kode_voucher+", "+no_pc+", "+duration+", "+harga+", "+bayar+", "+kembalian);
        dataTransaksi[index] = trans;
        index++;
    }
     
     public DefaultTableModel viewTablel(){
        DefaultTableModel tabeltransaksi=new DefaultTableModel();
        tabeltransaksi.addColumn("No transaksi");
        tabeltransaksi.addColumn("Id member");
        tabeltransaksi.addColumn("Kode voucher");
        tabeltransaksi.addColumn("No pc");
        tabeltransaksi.addColumn("Duration");
        tabeltransaksi.addColumn("harga");
        tabeltransaksi.addColumn("bayar");
        tabeltransaksi.addColumn("kembalian");
        
        for(int i=0; i<index; i++){
            Object[] temp1=new Object[8];
            temp1[0]=dataTransaksi[i].getNo_transaksi();
            temp1[1]=dataTransaksi[i].getId_member();
            temp1[2]=dataTransaksi[i].getKode_voucher();
            temp1[3]=dataTransaksi[i].getNo_pc();
            temp1[4]=dataTransaksi[i].getDuration();
            temp1[5]=dataTransaksi[i].getHarga();
            temp1[6]=dataTransaksi[i].getBayar();
            temp1[7]=dataTransaksi[i].getKembalian();
            tabeltransaksi.addRow(temp1);
        }
        return tabeltransaksi;
    }
     public void setIndex(int index) {
        this.index = index;
    }
     public int getIndex(){
        return index;
    }
      public Transaksi cariObjek(String no_transaksi) {
        Transaksi temp = null;
        for (int i = 0; i < index; i++) {
            if (dataTransaksi[i].getNo_transaksi().equals(no_transaksi)) {
                temp = dataTransaksi[i];
            }
        }
        return temp;
    }
}
