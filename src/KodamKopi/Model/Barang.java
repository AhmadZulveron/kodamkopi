/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KodamKopi.Model;

/**
 *
 * @author CHAD
 */
public class Barang {
    private String namaBarang;
    private String satuan;
    private int jumlah;

    public Barang(String namaBarang, String satuan, int jumlah) {
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.jumlah = jumlah;
    }

    public Barang(String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getJumlahStok() {
        return jumlah;
    }

    public void setJumlahStok(int jumlah) {
        this.jumlah = jumlah;
    }
    
    
}
