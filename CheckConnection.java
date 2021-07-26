/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection.Helper;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author khilm_qt9hwvg
 */
public class CheckConnection {
    public static void main(String[] args) { 
        isConnected();
        showProduk();
    }
    private static boolean isConnected() { 
        try { 
            ConnectionHelper.getConnection(); 
            System.out.println("Database Connected"); 
            return true; 
        }catch (SQLException e) { 
            Logger.getLogger(CheckConnection.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Failed to connect DB");//output ketika gagal terkoneksi ke database
            return false; //mengembalikan nilai false
        }
    }
    public static void showProduk() {
        try {
            Connection conn = ConnectionHelper.getConnection(); 
            Statement stmn = conn.createStatement(); 
            ResultSet rs = stmn.executeQuery("select * from Produk");

            while (rs.next()) {
                System.out.println("id produk : " + rs.getString("id_produk")
                        + ", nama produk :  " + rs.getString("nama_produk")
                        + ", harga produk : " + rs.getString("harga_produk")
                        + ", jumlah produk : " + rs.getString("jumlah_produk"));
            }
        } catch (SQLException e) {
            Logger.getLogger(CheckConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
