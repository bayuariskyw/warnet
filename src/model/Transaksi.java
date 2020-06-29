package model;
import controller.AllObject;
public class Transaksi{
    public String no_transaksi;
    public String id_member;
    public String kode_voucher;
    public String no_pc;
    public int duration;
    public int harga;
    public int bayar;
    public int kembalian; 
    public int index = 0;
    public Komputer komputer;
    public Member member;
    public Voucher voucher;
    public Transaksi(){
    
    }
    public void insertTransaksi(String no_transaksi,String id_member,String kode_voucher,String no_pc,int duration,int harga,int bayar,int kembalian){
        this.no_transaksi=no_transaksi;
        this.komputer = AllObject.komputer.cariObjek(AllObject.no_pc);
        this.member = AllObject.member.cariObjek(AllObject.id_member);
        this.voucher = AllObject.voucher.cariObjek(AllObject.kode_voucher);
        this.id_member=id_member;
        this.kode_voucher=kode_voucher;
        this.no_pc=no_pc;
        this.duration=duration;
        this.harga=harga;
        this.bayar=bayar;
        this.kembalian=kembalian;
        
    }
    public void setNo_transaksi(String no_transaksi){
        this.no_transaksi=no_transaksi;
    }
    public String getNo_transaksi(){
        return no_transaksi;
    }
    public void setId_member(String id_member){
        this.id_member=id_member;
    }
    public String getId_member(){
        return id_member;
    }
    public void setKode_voucher(String kode_voucher){
        this.kode_voucher=kode_voucher;
    }
    public String getKode_voucher(){
        return kode_voucher;
    }
    public void setNo_pc(String no_pc){
        this.no_pc=no_pc;
    }
    public String getNo_pc(){
        return no_pc;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public int getDuration(){
        return duration;
    }
    public void setHarga(int harga){
        this.harga=harga;
    }
    public int getHarga(){
        return harga;
    }
    public void setBayar(int bayar){
        this.bayar=bayar;
    }
    public int getBayar(){
        return bayar;
    }
    public void setKembalian(int kembalian){
        this.kembalian=kembalian;
    }
    public int getKembalian(){
        return kembalian;
    }
    public String getNopc(){
        return komputer.getNo_pc();
    }
    public String getKodevoucher(){
        return voucher.getKode_voucher();
    }
    public Member getIdmember(){
        return member;
    }
    public void setIdmember(Member member) {
        this.member = member;
    }
}
