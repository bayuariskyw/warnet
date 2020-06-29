package controller;

import database.Koneksi;
import javax.swing.table.DefaultTableModel;
import model.Komputer;

public class KomputerController {
    public Komputer[] dataKomputer =new Komputer[100];
    Koneksi koneksi=new Koneksi();
    int index=0;
    
    public void insert(String no_pc,String nama_pc,String keterangan){
        Komputer komputer=new Komputer();
        komputer.insertKomputer(no_pc, nama_pc, keterangan);
        koneksi.ManipulasiData("insert into komputer values "+no_pc+", "+nama_pc+", "+keterangan);
        dataKomputer[index]= komputer;
        index++;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
     public DefaultTableModel viewTabel() {
        DefaultTableModel Komputer = new DefaultTableModel();
        Komputer.addColumn("No pc");
        Komputer.addColumn("Nama pc");
        Komputer.addColumn("Keterangan");
        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[3];
            temp[0] = dataKomputer[i].getNo_pc();
            temp[1] = dataKomputer[i].getNama_pc();
            temp[2] = dataKomputer[i].getKeterangan();
            Komputer.addRow(temp);
        }
        return Komputer;
    }

    public Komputer cariObjek(String no_pc) {
        Komputer temp = null;
        for (int i = 0; i < index; i++) {
            if (dataKomputer[i].getNo_pc().equals(no_pc)) {
                temp = dataKomputer[i];
            }
        }
        return temp;
    }
}

