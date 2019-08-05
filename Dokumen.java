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
public class Dokumen {
    private String kodeProyek, nama, ProjectCharter, WaktuCharter, ProjectPlan, WaktuPlan, Keterangan, Customer;
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
    
    public void setProjectCharter(String ProjectCharter){
        this.ProjectCharter = ProjectCharter;
    }
    
    public String getProjectCharter(){
        return ProjectCharter;
    }
    
    public void setWaktuCharter(String WaktuCharter) {
        this.WaktuCharter = WaktuCharter;
    }

    public String getWaktuCharter() {
        return WaktuCharter;
    }
    
    public void setProjectPlan(String ProjectPlan) {
        this.ProjectPlan = ProjectPlan;
    }

    public String getProjectPlan() {
        return ProjectPlan;
    }
    
    public void setWaktuPlan(String WaktuPlan) {
        this.WaktuPlan = WaktuPlan;
    }

    public String getWaktuPlan() {
        return WaktuPlan;
    }
    
    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public String getKeterangan() {
        return Keterangan;
    }
    
    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public String getCustomer() {
        return Customer;
    }
    
    public void addDokumen() throws SQLException{
        db = new DataBase();
        String s;
        s = "insert into dokumen values('"+this.kodeProyek+"','"+this.nama+"','"+this.ProjectCharter+"','"+this.WaktuCharter+"','"+this.ProjectPlan+"','"+this.WaktuPlan+"','"+this.Keterangan+"','"+this.Customer+"')";
        db.query(s);
        db.close();
    }
    
    public void updateDokumen() throws SQLException{
        db = new DataBase();
        String s;
        s = "update dokumen Set kodeProyek='"+this.kodeProyek+"', nama='"+this.nama+"', ProjectCharter='"+this.ProjectCharter+"', WaktuCharter='"+this.WaktuCharter+"', ProjectPlan='"+this.ProjectPlan+"', WaktuPlan='"+this.WaktuPlan+"', Keterangan='"+this.Keterangan+"', Customer='"+this.Customer+"' where kodeProyek='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }
    
    public void deleteDokumen() throws SQLException{
        db = new DataBase();
        String s;
        s = "delete from dokumen where kodeProyek='"+this.kodeProyek+"'";
        db.query(s);
        db.close();
    }    
    
}
