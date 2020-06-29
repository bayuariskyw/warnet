package controller;
import database.Koneksi;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Admin;
public class AdminController {
    public Admin[] dataAdmin =new Admin[100];
    Koneksi koneksi=new Koneksi();
    public static String[] id_admin= new String[10];
    public static String[] pass= new String[10];
    int index=0;
    public TableModel viewTabel;
    
    public void insert(String id_admin,String password,String nama_admin, String alamat,String no_telp){
        Admin admin =new Admin();
        admin.insertAdmin(id_admin, password, nama_admin, alamat, no_telp);
        koneksi.ManipulasiData("insert into admin values "+id_admin+", "+password+", "+nama_admin+", "+alamat+", "+no_telp);
        dataAdmin[index] = admin;
        index++;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
    
     public DefaultTableModel viewTabel() {
        DefaultTableModel admin = new DefaultTableModel();
        admin.addColumn("Id admin");
        admin.addColumn("Password");
        admin.addColumn("Nama admin");
        admin.addColumn("Alamat");
        admin.addColumn("No telp");
        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[5];
            temp[0] = dataAdmin[i].getId_admin();
            temp[1] = dataAdmin[i].getPassword();
            temp[2] = dataAdmin[i].getNama_admin();
            temp[3] = dataAdmin[i].getAlamat();
            temp[4] = dataAdmin[i].getNo_telp();
            admin.addRow(temp);
        }
        return admin;
    }

    public Admin cariObjek(String id_admin) {
        Admin temp = null;
        for (int i = 0; i < index; i++) {
            if (dataAdmin[i].getId_admin().equals(id_admin)) {
                temp = dataAdmin[i];
            }
        }
        return temp;
    }
}
