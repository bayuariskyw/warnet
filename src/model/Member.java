package model;

import controller.AllObject;

public class Member{
    public String id_admin;
    public String id_member;
    public String password;
    public String nama_member;
    public int no_tlp;
    public int duration; 
    public int index = 0;
    public Member[] member = new Member[10];
    public Admin admin;
    public Member() {
       
    }
    public void insertMember( String id_member,String id_admin,String password,String nama_member,int no_tlp,int duration){
        this.id_member=id_member;
        this.admin = AllObject.admin.cariObjek(AllObject.id_admin);
        this.id_admin=id_admin;
        this.password=password;
        this.nama_member=nama_member;
        this.no_tlp=no_tlp;
        this.duration=duration;
    }
    public void setId_member(String id_member){
        this.id_member=id_member;
    }
    public String getId_member(){
        return id_member;
    }
    public void setId_admin(String id_admin){
        this.id_admin=id_admin;
    }
    public String getId_admin(){
        return id_admin;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setNama_member(String nama_member){
        this.nama_member=nama_member;
    }
    public String getNama_member(){
        return nama_member;
    }
    public void setNo_tlp(int no_tlp){
        this.no_tlp=no_tlp;
    }
    public int getNo_tlp(){
        return no_tlp;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public int getDuration(){
        return duration;
    }
    public void setIdadmin(String id_admin){
        this.admin.getId_admin();
    }
    public String getIdadmin(){
        return admin.getId_admin();
    } 
}
