/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KodamKopi.Controller;

import KodamKopi.View.FMasterBarang;
import KodamKopi.Dao.DMasterBarang;
import KodamKopi.Model.MasterBarang;
import KodamKopi.Koneksi.Koneksi;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CHAD
 */
public class CMasterBarang {
    public class BukuController {
    FMasterBarang view;
    MasterBarang model;
    DMasterBarang dao;
    Koneksi k;
    
    public  BukuController(FMasterBarang view){
        this.view = view;
        clearForm();
    }
    
    public void clearForm(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudul().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
        view.getTxtThTerbit().setText("");
    }
    
    public void insert(){
        model = new Buku(view.getTxtKodeBuku().getText(), view.getTxtJudul().getText(), view.getTxtPengarang().getText(),
                            view.getTxtPenerbit().getText(), view.getTxtThTerbit().getText());
        dao = new BukuDao();
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
        model = new Buku(view.getTxtKodeBuku().getText(), view.getTxtJudul().getText(), view.getTxtPengarang().getText(),
                            view.getTxtPenerbit().getText(), view.getTxtThTerbit().getText());
        dao = new BukuDao();
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
        model = new Buku(view.getTxtKodeBuku().getText(), view.getTxtJudul().getText(), view.getTxtPengarang().getText(),
                            view.getTxtPenerbit().getText(), view.getTxtThTerbit().getText());
        dao = new BukuDao();
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
