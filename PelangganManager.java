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
import Penjualan.model.Pelanggan;
/**
 *
 * @author khilm_qt9hwvg
 */
public class PelangganManager {
    
  public static void tambahPelanggan(Pelanggan pelanggan) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into pelanggan (id_pelanggan , nama_pelanggan, "
            + "alamat_pelanggan, no_hp) values (?, ?, ?, ?)");
        pstmn.setInt(1, pelanggan.getId_pelanggan());
        pstmn.setString(2, pelanggan.getNama_pelanggan());
        pstmn.setString(3, pelanggan.getAlamat_pelanggan());
        pstmn.setString(4, pelanggan.getNo_hp());
        pstmn.execute();
    }
}

