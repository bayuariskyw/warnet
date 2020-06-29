package model;

public class Komputer {
    public String no_pc;
    public String nama_pc;
    public String keterangan;
    public Komputer(){
        
    }
    
    public void insertKomputer(String no_pc,String nama_pc,String keterangan){
        this.no_pc=no_pc;
        this.nama_pc=nama_pc;
        this.keterangan=keterangan;
    }
    
    public void setNo_pc(String no_pc){
        this.no_pc=no_pc;
    }
    public String getNo_pc(){
        return no_pc;
    }
    public void setNama_pc(String nama_pc){
        this.nama_pc=nama_pc;
    }
    public String getNama_pc(){
        return nama_pc;
    }
    public void setKeterangan(String keterangan){
        this.keterangan=keterangan;
    }
    public String getKeterangan(){
        return keterangan;
    }
}