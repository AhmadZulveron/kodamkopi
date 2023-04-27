/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KodamKopi.View;

//import KodamKopi.Dao.Barang;
import javax.swing.JFrame;

/**
 *
 * @author CHAD
 */
import javax.swing.*;
import java.awt.*;

public class FMasterBarang {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kodam Kopi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // JFrame di-maximize
        frame.setLayout(new BorderLayout());

        // panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        frame.add(mainPanel, BorderLayout.CENTER);
        GridBagConstraints gb = new GridBagConstraints();
        gb.insets = new Insets(10, 10, 10, 10);
        
        JLabel namaBarang = new JLabel("Nama Barang");
        gb.gridx = 9;
        gb.gridy = 8;
        mainPanel.add(namaBarang, gb);
        
        // texfield
        JTextField nBarang = new JTextField();
        mainPanel.add(nBarang);
        
        // button
        JButton insertBtn = new JButton("INSERT");
        gb.gridx = 5;
        gb.gridy = 5;
        mainPanel.add(insertBtn);

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
}

