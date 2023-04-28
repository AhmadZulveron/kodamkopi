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
    private int jumlahStok;

    public Barang(String namaBarang, String satuan, int jumlahStok) {
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.jumlahStok = jumlahStok;
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
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }
    
    
}
