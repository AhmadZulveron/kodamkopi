/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KodamKopi.View;

/**
 *
 * @author CHAD
 */

import javax.swing.*;
import java.awt.*;

public class FormLogin {
    public static void main(String[] args) {
        JFrame f = new JFrame("Kodam Kopi");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(new BorderLayout());

        // panel login
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // label username
        JLabel username = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(username, gbc);

        // field username
        JTextField uField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        loginPanel.add(uField, gbc);

        // label password
        JLabel password = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(password, gbc);

        // field password
        JPasswordField passField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        loginPanel.add(passField, gbc);

        // membuat tombol login
        JButton loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        loginPanel.add(loginButton, gbc);

        f.add(loginPanel, BorderLayout.CENTER);
        f.setVisible(true);
    }
}
