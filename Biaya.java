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
public class Biaya {
    private String kodeProyek, nama, uangSponsor, estimasiBiaya, detailBiaya, pemasukan, detailPemasukan, pengeluaran, detailPengeluaran;
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

public void setEstimasiBiaya(String estimasiBiaya){
    this.estimasiBiaya = estimasiBiaya;
}

public String getEstimasiBiaya(){
    return estimasiBiaya;
}

public void setDetailBiaya(String detailBiaya){
    this.detailBiaya = detailBiaya;
}

public String getDetailBiaya(){
    return detailBiaya;
}

public void setUangSponsor(String uangSponsor){
    this.uangSponsor = uangSponsor;
}

public String getUangSponsor(){
    return uangSponsor;
}
public void setPengeluaran(String pengeluaran){
    this.pengeluaran = pengeluaran;
}

public String getPengeluaran(){
    return pengeluaran;
}

public void setDetailPengeluaran(String detailPengeluaran){
    this.detailPengeluaran = detailPengeluaran;
}

public String getDetailPengeluaran(){
    return detailPengeluaran;
}

public void setPemasukan(String pemasukan){
    this.pemasukan = pemasukan;
}

public String getPemasukan(){
    return pemasukan;
}

public void setDetailPemasukan(String detailPemasukan){
    this.detailPemasukan = detailPemasukan;
}

public String getDetailPemasukan(){
    return detailPemasukan;
}

    public void addBiaya() throws SQLException{
        db = new DataBase();
        String s;
        s = "insert into biaya values('"+this.kodeProyek+"','"+this.nama+"','"+this.uangSponsor+"','"+this.estimasiBiaya+"','"+this.detailBiaya+"','"+this.pemasukan+"','"+this.detailPemasukan+"','"+this.pengeluaran+"','"+this.detailPengeluaran+"')";
        db.query(s);
        db.close();
    }
    
    public void updateBiaya() throws SQLException{
        db = new DataBase();
        String s;
        s = "update biaya Set kodeProyek='"+this.kodeProyek+"', nama='"+this.nama+"', uangSponsor='"+this.uangSponsor+"', estimasiBiaya='"+this.estimasiBiaya+"', detailBiaya='"+this.detailBiaya+"',pemasukan='"+this.pemasukan+"', detailPemasukan='"+this.detailPemasukan+"', pengeluaran='"+this.pengeluaran+"', detailPengeluaran='"+this.detailPengeluaran+"' where kodeProyek='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }
    
    public void deleteBiaya() throws SQLException{
        db = new DataBase();
        String s;
        s = "delete from biaya where kodeProyek='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }

}
