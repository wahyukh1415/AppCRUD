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
public class Resource {
    private String IdPegawai, nama, jabatan, departemen, email, phone, mobile, fax  ;
    DataBase db;

    public void setIdPegawai(String IdPegawai) {
        this.IdPegawai = IdPegawai;
    }

    public String getIdPegawai() {
        return IdPegawai;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFax() {
        return fax;
    }    
    
    public void addResource() throws SQLException{
        db = new DataBase();
        String s;
        s = "insert into resource values('"+this.IdPegawai+"','"+this.nama+"','"+this.jabatan+"','"+this.departemen+"','"+this.email+"','"+this.phone+"','"+this.mobile+"','"+this.fax+"')";
        db.query(s);
        db.close();
    }
    
    public void updateResource() throws SQLException{
        db = new DataBase();
        String s;
        s = "update resource Set IdPegawai='"+this.IdPegawai+"', nama='"+this.nama+"', jabatan='"+this.jabatan+"', departemen='"+this.departemen+"', email='"+this.email+"', phone='"+this.phone+"', mobile='"+this.mobile+"', fax='"+this.fax+"' where IdPegawai='"+this.IdPegawai+"'";
        db.query(s);
        db.close();
    }
    
    public void deleteResource() throws SQLException{
        db = new DataBase();
        String s;
        s = "delete from resource where IdPegawai='"+this.IdPegawai+"'";
        db.query(s);
        db.close();
    }
}
