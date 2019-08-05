package Source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wahyu
 */
public class DataBase {
    private final String dbuser = "root";
    private final String dbpass = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public DataBase(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/AppCRUD",dbuser,dbpass);
            stmt = con.createStatement();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error1 :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error2:"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void close()throws SQLException{
        stmt.close();

    }
}