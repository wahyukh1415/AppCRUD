package Source;

import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wahyu
 */
public class Proyek {
    private String kodeProyek, nama, manager, budget, mulai, akhir, deskripsi,customer, laporan;
    DataBase db;

    public void setKodeProyek(String kodeProyek) {
        this.kodeProyek = kodeProyek;
    }

    public String getKodeProyek() {
        return kodeProyek;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    
    public void setManager(String manager){
        this.manager = manager;
    }
    
    public String getManager(){
        return manager;
    }
    
    public void setBudget(String budget){
        this.budget = budget;
    }
    
    public String getBudget(){
        return budget;
    }
    
    public void setMulai(String mulai){
        this.mulai = mulai;
    }
    
    public String getMulai(){
        return mulai;
    }
    
    public void setAkhir(String akhir){
        this.akhir = akhir;
    }
    
    public String getAkhir(){
        return akhir;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setCustomer(String customer){
        this.customer = customer;
    }
    
    public String getCustomer(){
        return customer;
    }
    
    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }

    public String getLaporan() {
        return laporan;
    }

    
    public void addpegawai() throws SQLException{
        db = new DataBase();
        String s;
        s = "insert into proyek values('"+this.kodeProyek+"','"+this.nama+"','"+this.manager+"','"+this.budget+"','"+this.mulai+"','"+this.akhir+"','"+this.deskripsi+"','"+this.customer+"','"+this.laporan+"')";
        db.query(s);
        db.close();
    }
    
    public void updateproyek() throws SQLException{
        db = new DataBase();
        String s;
        s = "update proyek Set kodeProyek='"+this.kodeProyek+"', nama='"+this.nama+"', manager='"+this.manager+"', budget='"+this.budget+"', mulai='"+this.mulai+"', akhir='"+this.akhir+"', deskripsi='"+this.deskripsi+"', customer='"+this.customer+"', laporan='"+this.laporan+"' where kodeProyek='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }
    
    public void deleteproyek() throws SQLException{
        db = new DataBase();
        String s;
        s = "delete from proyek where kodeProyek='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }
}
