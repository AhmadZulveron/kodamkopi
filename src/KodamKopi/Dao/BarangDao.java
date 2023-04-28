/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KodamKopi.Dao;

import KodamKopi.Model.Barang;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
/**
 *
 * @author CHAD
 */
public class BarangDao {
    public void insert(Connection con, Barang masterbarang) throws SQLException{
        String sql = "Insert into barang values (?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, masterbarang.getNamaBarang());
        ps.setString(2, masterbarang.getSatuan());
        ps.setInt(3, masterbarang.getJumlahStok());
        ps.executeUpdate();
    }
    
    public void  update(Connection con, Barang masterBarang) throws SQLException{
        String sql = "Update barang set nama_barang=?, satuan=?, jumlah_stok=? where nama_barang=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, masterBarang.getNamaBarang());
        ps.setString(2, masterBarang.getSatuan());
        ps.setInt(3, masterBarang.getJumlahStok());
        ps.executeUpdate();
    }
    
    public void delete(Connection con, Barang masterBarang) throws SQLException{
        String sql = "delete from barang where nama_barang=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, masterBarang.getNamaBarang());
        ps.executeUpdate();
    }
}
