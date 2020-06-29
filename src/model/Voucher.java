package model;

import controller.AllObject;

public class Voucher{
    public String id_admin;
    public String kode_voucher;
    public int duration ;
    public int index = 0;
    public Voucher[] voucher = new Voucher[10];
    public Admin admin;
    public Voucher() {
       
    }
    public void insertVoucher(String id_admin, String kode_voucher,int duration){
        this.admin = AllObject.admin.cariObjek(AllObject.id_admin);
        this.id_admin=id_admin;
        this.kode_voucher=kode_voucher;
        this.duration=duration;
    }
    
    public void setKode_voucher(String kode_voucher){
        this.kode_voucher=kode_voucher;
    }
    public String getKode_voucher(){
        return kode_voucher;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public int getDuration(){
        return duration;
    }
    public void setId_admin(String id_admin){
        this.id_admin=id_admin;
    }
    public String getId_admin(){
        return id_admin;
    }
    public void setIdadmin(String id_admin){
        this.admin.getId_admin();
    }
    public String getIdadmin(){
        return admin.getId_admin();
    }
}
