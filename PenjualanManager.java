/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.manager;
import Connection.Helper.ConnectionHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Penjualan.model.PenjualanModel;
import Penjualan.model.Produk;
import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author khilm_qt9hwvg
 */
public class PenjualanManager {
    public static Produk viewPenjualan(int id) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        Produk produk = new Produk();
        
        PreparedStatement pstmn = conn.prepareStatement("Select * from penjualan where id_penjualan = ?");
        pstmn.setInt(1, id);
        ResultSet rs = pstmn.executeQuery();
        
        while(rs.next()){
            produk.setId_penjualan(Integer.parseInt(rs.getString("id_penjualan")));
            produk.setTanggal(rs.getString("tanggal"));
            produk.setNama_pelanggan(rs.getString("nama_pelanggan"));
            produk.setNama_produk(rs.getString("nama_produk"));
            produk.setHarga_tahu(Integer.parseInt(rs.getString("harga_tahu")));
            produk.setQty(Integer.parseInt(rs.getString("Qty")));
            produk.setTotal(Integer.parseInt(rs.getString("total")));
        }
        return produk;
    }
     public static void tambahPenjualan(PenjualanModel penjualan) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into penjualan (id_penjualan , id_produk, "
            + "id_pelanggan, nama_produk, jumlah_produk, harga_produk ) values (?, ?, ?, ?, ?, ?)");
        pstmn.setInt(1, penjualan.getId_produk());
        pstmn.setInt(2, penjualan.getId_produk());
        pstmn.setInt(3, penjualan.getId_produk());
        pstmn.setString(4, penjualan.getNama_produk());
        pstmn.setInt(5, penjualan.getHarga_produk());
        pstmn.setInt(6, penjualan.getJumlah_barang());
        pstmn.execute();
    }
}



