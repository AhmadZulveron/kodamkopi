/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KodamKopi.View;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author CHAD
 */
public class FormPesanan {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kodam Kopi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // JFrame di-maximize
        frame.setLayout(new BorderLayout());

        // panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        frame.add(mainPanel, BorderLayout.CENTER);

        // side panel
        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(Color.RED);
        sidePanel.setPreferredSize(new Dimension(200, 0));
        sidePanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
        sidePanel.setMinimumSize(new Dimension(200, 0));
        sidePanel.setOpaque(true);
        frame.add(sidePanel, BorderLayout.WEST);

        frame.setVisible(true);
    }
}
