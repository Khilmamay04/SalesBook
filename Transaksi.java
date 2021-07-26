/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.model;

/**
 *
 * @author khilm_qt9hwvg
 */
public class Transaksi {
     private int id_Transaksi;
    private int id_barang;
    private String tgl_transaksi;
    private Double total_penjualan;

    public int getId_Transaksi() {
        return id_Transaksi;
    }

    public void setId_Transaksi(int id_Transaksi) {
        this.id_Transaksi = id_Transaksi;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getTgl_transaksi() {
        return tgl_transaksi;
    }

    public void setTgl_transaksi(String tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public Double getTotal_penjualan() {
        return total_penjualan;
    }

    public void setTotal_penjualan(Double total_penjualan) {
        this.total_penjualan = total_penjualan;
    }
         
    
}


