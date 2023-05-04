/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KodamKopi.View;

//import KodamKopi.Dao.Barang;
import javax.swing.JFrame;
import KodamKopi.Controller.BarangController;

/**
 *
 * @author CHAD
 */
import javax.swing.*;
import java.awt.*;

public class Form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kodam Kopi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // JFrame di-maximize
        frame.setLayout(new BorderLayout());

        // panel utama
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.WHITE);
        frame.add(mainPanel, BorderLayout.CENTER);
        GridBagConstraints gb = new GridBagConstraints();
        gb.insets = new Insets(10, 10, 10, 10);
        
        // label
        JLabel namaBarang = new JLabel("Nama Barang", SwingConstants.CENTER);
        gb.gridx = 1;
        gb.gridy = 2;
        mainPanel.add(namaBarang, gb);
        
        JLabel satuanBarang = new JLabel("Satuan", SwingConstants.CENTER);
        gb.gridx = 1;
        gb.gridy = 5;
        mainPanel.add(satuanBarang, gb);
        
        // texfield
        JTextField nBarang = new JTextField();
        nBarang.setName("TxtNamaBarang");
        nBarang.setPreferredSize(new Dimension(300, 32));
        gb.gridx = 4;
        gb.gridy = 2;
        mainPanel.add(nBarang, gb);
        
        JTextField sBarang = new JTextField();
        sBarang.setName("TxtSatuan");
        sBarang.setPreferredSize(new Dimension(300, 32));
        gb.gridx = 4;
        gb.gridy = 5;
        mainPanel.add(sBarang, gb);
        
//        JTextField satuan = new JTextField();        
//        mainPanel.add(satuan);
        
        // button
        JButton insertBtn = new JButton("INSERT");
        insertBtn.setPreferredSize(new Dimension(84, 32));
        gb.gridx = 10;
        gb.gridy = 2;
        mainPanel.add(insertBtn, gb);
        
        JButton updateBtn = new JButton("UPDATE");
        updateBtn.setPreferredSize(new Dimension(84, 32));
        gb.gridx = 10;
        gb.gridy = 5;
        mainPanel.add(updateBtn, gb);
        
//        // table
//        String[] columnNames = {"Name", "Age", "Gender"};
//        Object[][] data = {
//            {"John", 25, "Male"},
//            {"Jane", 30, "Female"},
//            {"Bob", 45, "Male"},
//        };
//        JTable table = new JTable(data, columnNames);
//        gb.gridx = 1;
//        gb.gridy = 10;
//        mainPanel.add(table, gb);

        // side panel
        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(Color.RED);
        sidePanel.setPreferredSize(new Dimension(300, 0));
        sidePanel.setMaximumSize(new Dimension(300, Integer.MAX_VALUE));
        sidePanel.setMinimumSize(new Dimension(300, 0));
        sidePanel.setOpaque(true);
        frame.add(sidePanel, BorderLayout.WEST);

        frame.setVisible(true);
    }

//    public Object getTxtNamaBarang() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public Object getTxtJumlah() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public Object getTxtSatuan() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}

