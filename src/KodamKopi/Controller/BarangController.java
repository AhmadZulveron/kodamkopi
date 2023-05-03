/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KodamKopi.Controller;

import KodamKopi.Dao.BarangDao;
import KodamKopi.Model.Barang;
import KodamKopi.Koneksi.Koneksi;
import KodamKopi.View.BarangView;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CHAD
 */
public class BarangController {
    public class barang {
    BarangView view;
    Barang model;
    BarangDao dao;
    Koneksi k;
    
    public  barang (BarangView view){
        this.view = view;
        clearForm();
    }
    
    public void clearForm(){
        view.getTxtNamaBarang();
        view.getTxtSatuan();
        view.getTxtJumlah();
        view.getTxtTglmasuk();
    }
    public void insert(){
        model = new Barang(view.getTxtNamaBarang().getText(), view.getTxtSatuan().getText(), view.getTxtJumlah().getText(),
                           view.getTxtTglmasuk().getText());
        dao = new BarangDao();
        k = new Koneksi();
        try {
            dao.insert(k.getKoneksi(), model);
            JOptionPane.showMessageDialog(view, "Insert OK");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, "Insert Gagal");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Insert Gagal");
        }
    }
    
    public void delete(){
        model = new Barang(view.getTxtNamaBarang().getText(), view.getTxtSatuan().getText(), view.getTxtJumlah().getText(),
                           view.getTxtTglmasuk().getText());
        dao = new BarangDao();
        k = new Koneksi();
        try {
            dao.delete(k.getKoneksi(), model);
            JOptionPane.showMessageDialog(view, "Delete OK");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, "Delete Gagal");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Delete Gagal");
        }
    }
    
    public void update(){
        model = new Barang(view.getTxtNamaBarang().getText(), view.getTxtSatuan().getText(), view.getTxtJumlah().getText(),
                           view.getTxtTglmasuk().getText());
        k = new Koneksi();
        try {
            dao.update(k.getKoneksi(), model);
            JOptionPane.showMessageDialog(view, "Update OK");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    }
}
