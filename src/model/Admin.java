package model;
public class Admin {
public String id_admin;
public String password;
public String nama_admin;
public String alamat;
public String no_telp;    
public Admin(){
        
    }

    public void insertAdmin(String id_admin,String password,String nama_admin, String alamat,String no_telp ){
        this.id_admin=id_admin;
        this.password=password;
        this.nama_admin=nama_admin;
        this.alamat=alamat;
        this.no_telp=no_telp;
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
    public void setNama_admin(String nama_admin){
        this.nama_admin=nama_admin;
    }
    public String getNama_admin(){
        return nama_admin;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNo_telp(String no_telp){
        this.no_telp=no_telp;
    }
    public String getNo_telp(){
        return no_telp;
    }
}
