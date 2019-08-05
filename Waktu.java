/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Source;

import java.sql.SQLException;

/**
 *
 * @author Wahyu 
 */
public class Waktu {
    private String kodeProyek, nama, waktuMulai, waktuSelesai, waktuPengerjaan, waktuBuffer, keterangan;
    DataBase db;

public void setKodeProyek(String kodeProyek){
    this.kodeProyek = kodeProyek;
}

public String getKodeProyek(){
    return kodeProyek;
}    
    
public void setNama(String nama){
    this.nama = nama;
}

public String getNama(){
    return nama;
}

public void setWaktuMulai(String waktuMulai){
    this.waktuMulai=waktuMulai;
}

public String getWaktuMulai(){
    return waktuMulai;
}

public void setWaktuSelesai(String waktuSelesai){
    this.waktuSelesai=waktuSelesai;
}

public String getWaktuSelesai(){
    return waktuSelesai;
}

public void setWaktuPengerjaan(String waktuPengerjaan){
    this.waktuPengerjaan = waktuPengerjaan;
}

public String getWaktuPengerjaan(){
    return waktuPengerjaan;
}

public void setWaktuBuffer(String waktuBuffer){
    this.waktuBuffer= waktuBuffer;
}

public String getWaktuBuffer(){
    return waktuBuffer;
}

public void setKeterangan(String keterangan){
    this.keterangan= keterangan;
}

public String getKeterangan(){
    return keterangan;
}

    public void addWaktu() throws SQLException{
        db = new DataBase();
        String s;
        s = "insert into waktu values('"+this.kodeProyek+"','"+this.nama+"','"+this.waktuMulai+"','"+this.waktuSelesai+"','"+this.waktuBuffer+"','"+this.waktuPengerjaan+"','"+this.keterangan+"')";
        db.query(s);
        db.close();
    }
    
    public void updateWaktu() throws SQLException{
        db = new DataBase();
        String s;
        s = "update waktu Set kodeProyek='"+this.kodeProyek+"', nama='"+this.nama+"', waktuMulai='"+this.waktuMulai+"', waktuSelesai='"+this.waktuSelesai+"', waktuBuffer='"+this.waktuBuffer+"', waktuPengerjaan='"+this.waktuPengerjaan+"', keterangan='"+this.keterangan+"' where kodeProyek ='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }
    
    public void deleteWaktu() throws SQLException{
        db = new DataBase();
        String s;
        s = "delete from waktu where kodeProyek='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }    
    

}
