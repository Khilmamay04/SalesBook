/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.manager;
import Connection.Helper.ConnectionHelper;
import java.util.*;
import java.sql.*;
import java.util.logging.*;
import Penjualan.model.Produk;
/**
 *
 * @author khilm_qt9hwvg
 */
public class ProdukManager {
     public static Produk viewProduk(int id) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        Produk produk = new Produk();
        
        PreparedStatement pstmn = conn.prepareStatement("Select * from penjualan where id_produk = ?");
        pstmn.setInt(1, id);
        ResultSet rs = pstmn.executeQuery();
        
        while(rs.next()){
            produk.setId_produk(Integer.parseInt(rs.getString("id_produk")));
            produk.setNama_produk(rs.getString("nama_produk"));
            produk.setHarga_produk(rs.getString("harga_produk"));
            produk.setJumlah_produk(Integer.parseInt(rs.getString("jumlah_produk")));
        }
        return produk;
    }
}

