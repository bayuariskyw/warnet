package controller;
import database.Koneksi;
import javax.swing.table.DefaultTableModel;
import model.*;
public class VoucherController {
    public Voucher[] dataVoucher = new Voucher[100];
    Koneksi koneksi=new Koneksi();
    public int index = 0;
    
     public void insert(String id_admin,String kode_voucher, int duration) {
        Voucher voucher =new Voucher();
        voucher.insertVoucher(id_admin,kode_voucher, duration);
        koneksi.ManipulasiData("insert into voucher values "+id_admin+", "+kode_voucher+", "+duration);
        dataVoucher[index] = voucher;
        index++;
    }
     
     public DefaultTableModel viewTablel(){
        DefaultTableModel tabelvoucher=new DefaultTableModel();
        tabelvoucher.addColumn("id admin");
        tabelvoucher.addColumn("Kode voucher");
        tabelvoucher.addColumn("Duration");
        
        for(int i=0; i<index; i++){
            Object[] temp1=new Object[3];
            temp1[0]=dataVoucher[i].getId_admin();
            temp1[1]=dataVoucher[i].getKode_voucher();
            temp1[2]=dataVoucher[i].getDuration();
            tabelvoucher.addRow(temp1);
        }
        return tabelvoucher;
    }
     public void setIndex(int index) {
        this.index = index;
    }
     public int getIndex(){
        return index;
    }
     public Voucher cariObjek(String kode_voucher) {
        Voucher temp = null;
        for (int i = 0; i < index; i++) {
            if (dataVoucher[i].getKode_voucher().equals(kode_voucher)) {
                temp = dataVoucher[i];
            }
        }
        return temp;
    }
}
