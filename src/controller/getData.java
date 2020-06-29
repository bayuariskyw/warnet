/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.*;
import database.Koneksi;
import java.sql.*;
import java.text.*;
/**
 *
 * @author unknown
 */
public class getData {
    Koneksi koneksi;
    SimpleDateFormat tanggal=new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat jam=new SimpleDateFormat("HH:mm:ss");
    Date tgl;
    public getData() throws SQLException{
    koneksi = new Koneksi();
    getDataAdmin();
    getDataVoucher();
    getDataMember();
    getDataKomputer();    
    getDataTransaksi();
    getDataLoginpelanggan();
    getview();
    getjoin();
    }
    
    public void getDataAdmin() throws SQLException{
        int index=0;
        ResultSet rs = koneksi.GetData("SELECT * from admin" );
        while (rs.next()) {
            Admin admin= new Admin();
            admin.setId_admin(rs.getString("ID_ADMIN"));
            admin.setPassword(rs.getString("PASSWORD"));
            admin.setNama_admin(rs.getString("NAMA_ADMIN"));
            admin.setAlamat(rs.getString("ALAMAT"));
            admin.setNo_telp(rs.getString("NO_TELP"));
            AllObject.admin.dataAdmin[index]=admin;
            index++;
            AllObject.admin.setIndex(index);
            }
    }
    
    public void getDataVoucher() throws SQLException {
        int index=0;
        ResultSet rs = koneksi.GetData("select * from voucher");
        while (rs.next()){
            Voucher voucher= new Voucher();
            voucher.setId_admin(rs.getString("Id_admin"));
            voucher.setKode_voucher(rs.getString("Kode_voucher"));
            voucher.setDuration(rs.getInt("duration"));
            AllObject.voucher.dataVoucher[index]=voucher;
            index++;
            AllObject.voucher.setIndex(index);
        }
    }
    
    public void getDataMember() throws SQLException {
        int index=0;
        ResultSet rs = koneksi.GetData("select * from member");
        while (rs.next()){
            Member member= new Member();
            member.setId_member(rs.getString("Id_member"));
            member.setId_admin(rs.getString("Id_admin"));
            member.setPassword(rs.getString("password"));
            member.setNama_member(rs.getString("nama_member"));
            member.setNo_tlp(rs.getInt("no_tlp"));
            member.setDuration(rs.getInt("duration"));
            AllObject.member.dataMember[index]=member;
            index++;
            AllObject.member.setIndex(index);
        }
    }
    
    public void getDataKomputer() throws SQLException {
        int index=0;
        ResultSet rs = koneksi.GetData("select * from komputer");
        while (rs.next()){
            Komputer komputer= new Komputer();
            komputer.setNo_pc(rs.getString("No_pc"));
            komputer.setNama_pc(rs.getString("nama_pc"));
            komputer.setKeterangan(rs.getString("keterangan"));
            AllObject.komputer.dataKomputer[index]=komputer;
            index++;
            AllObject.komputer.setIndex(index);
        }
    }
    
    public void getDataTransaksi() throws SQLException{
        int index=0;
        ResultSet rs = koneksi.GetData("SELECT * from transaksi");
        while(rs.next()){
            Transaksi transaksi = new Transaksi();
            transaksi.setNo_transaksi(rs.getString("No_transaksi"));
            transaksi.setId_member(rs.getString("Id_member"));
            transaksi.setKode_voucher(rs.getString("Kode_voucher"));
            transaksi.setNo_pc(rs.getString("No_pc"));
            transaksi.setDuration(rs.getInt("duration"));
            transaksi.setHarga(rs.getInt("harga"));
            transaksi.setBayar(rs.getInt("bayar"));
            transaksi.setKembalian(rs.getInt("kembalian"));
            AllObject.transaksi.dataTransaksi[index]=transaksi;
            index++;
            AllObject.transaksi.setIndex(index);
        }
    }
    
    public void getDataLoginpelanggan() throws SQLException {
        int index=0;
        ResultSet rs = koneksi.GetData("SELECT * from login_06927");
        while(rs.next()){
            Login login = new Login();
            login.setNo_transaksi(rs.getString("No_transaksi"));
            login.setNo_pc(rs.getString("No_pc"));
            login.setTanggal(rs.getDate("tanggal"));
            login.setJamlogin(rs.getTimestamp("jamlogin"));
            login.setJamlogout(rs.getTimestamp("jamlogout"));
            login.setSisawaktu(rs.getInt("sisawaktu"));
            AllObject.login.dataLogin[index]=login;
            index++;
            AllObject.login.setIndex(index);
        }
    }
    public void getview() throws SQLException{
        int index=0;
        ResultSet rs = koneksi.GetData("SELECT * from view_transaksi");
        while(rs.next()){
            Transaksi transaksi = new Transaksi();
            transaksi.setNo_transaksi(rs.getString("No_transaksi"));
            transaksi.setId_member(rs.getString("Id_member"));
            transaksi.setKode_voucher(rs.getString("Kode_voucher"));
            transaksi.setNo_pc(rs.getString("No_pc"));
            transaksi.setDuration(rs.getInt("duration"));
            transaksi.setHarga(rs.getInt("harga"));
            transaksi.setBayar(rs.getInt("bayar"));
            transaksi.setKembalian(rs.getInt("kembalian"));
            AllObject.transaksi.dataTransaksi[index]=transaksi;
            index++;
            AllObject.transaksi.setIndex(index);
        }
    }
    public void getjoin() throws SQLException {
        int index=0;
        ResultSet rs = koneksi.GetData("select * from transaksi");
        while (rs.next()){
            Transaksi transaksi = new Transaksi();
            transaksi.setNo_transaksi(rs.getString("No_transaksi"));
            transaksi.setId_member(rs.getString("Id_member"));
            transaksi.setKode_voucher(rs.getString("Kode_voucher"));
            transaksi.setNo_pc(rs.getString("No_pc"));
            transaksi.setDuration(rs.getInt("duration"));
            transaksi.setHarga(rs.getInt("harga"));
            transaksi.setBayar(rs.getInt("bayar"));
            transaksi.setKembalian(rs.getInt("kembalian"));
            transaksi.setIdmember(AllObject.member.cariObjek(rs.getString("Id_member")));
            ResultSet rsJ = koneksi.GetData("select * from transaksi join " +
            "member on transaksi.id_member = member.id_member "+ rs.getString("No_transaksi"));
            while (rsJ.next()){
            Member member= new Member();
            member.setId_member(rsJ.getString("Id_member"));
            member.setId_admin(rsJ.getString("Id_admin"));
            member.setPassword(rsJ.getString("password"));
            member.setNama_member(rsJ.getString("nama_member"));
            member.setNo_tlp(rsJ.getInt("no_tlp"));
            member.setDuration(rsJ.getInt("duration"));
            AllObject.member.dataMember[index]=member;
            index++;
            AllObject.member.setIndex(index);
            
        }
    }
  }
}