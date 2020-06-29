package model;

import controller.AllObject;
import java.util.Date;
import oracle.sql.DATE;


public class Login {    
    public String no_transaksi;
    public String no_pc;
    public Date tanggal;
    public Date jamlogin;
    public Date jamlogout; 
    public int sisawaktu; 
    public int index = 0;
    public Komputer komputer;
    public Transaksi transaksi;
    public Login(){
    
    }
    public void insertLogin(String no_transaksi,String no_pc,Date tanggal,Date jamlogin){
        this.transaksi = AllObject.transaksi.cariObjek(AllObject.no_pc);
        this.transaksi = AllObject.transaksi.cariObjek(AllObject.no_transaksi);
        this.no_transaksi=no_transaksi;
        this.no_pc=no_pc;
        this.tanggal=tanggal;
        this.jamlogin=jamlogin;
    }
    public void insertLogin(String no_transaksi,String no_pc,Date tanggal,Date jamlogin,Date jamlogout,int sisawaktu){
        this.transaksi = AllObject.transaksi.cariObjek(AllObject.no_pc);
        this.transaksi = AllObject.transaksi.cariObjek(AllObject.no_transaksi);
        this.no_transaksi=no_transaksi;
        this.no_pc=no_pc;
        this.tanggal=tanggal;
        this.jamlogin=jamlogin;
        this.jamlogout=jamlogout;
        this.sisawaktu=sisawaktu;
    }
    public void setNo_transaksi(String no_transaksi){
        this.no_transaksi=no_transaksi;
    }
    public String getNo_transaksi(){
        return no_transaksi;
    }
    public void setNo_pc(String no_pc){
        this.no_pc=no_pc;
    }
    public String getNo_pc(){
        return no_pc;
    }
    public void setTanggal(Date tanggal){
        this.tanggal=tanggal;
    }
    public Date getTanggal(){
        return tanggal;
    }
    public void setJamlogin(Date jamlogin){
        this.jamlogin=jamlogin;
    }
    public Date getJamlogin(){
        return jamlogin;
    }
    public void setJamlogout(Date jamlogout){
        this.jamlogout=jamlogout;
    }
    public Date getJamlogout(){
        return jamlogout;
    }
    public void setSisawaktu(int sisawaktu){
        this.sisawaktu=sisawaktu;
    }
    public int getSisawaktu(){
        return sisawaktu;
    }
}

