/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KodamKopi.View;

/**
 *
 * @author CHAD
 */
import javax.swing.*;
import java.awt.*;

public class TestForm extends JFrame {

    public TestForm() {
        // Set frame properties
        setTitle("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Create main panel and set layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create sidebar and set properties
        JPanel sidebar = new JPanel();
        sidebar.setBackground(Color.RED);
        sidebar.setPreferredSize(new Dimension(150, Integer.MAX_VALUE));
        sidebar.setMaximumSize(new Dimension(150, Integer.MAX_VALUE));
        sidebar.setMinimumSize(new Dimension(150, Integer.MAX_VALUE));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));

        // Create header panel and set properties
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.LIGHT_GRAY);
        headerPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, 50));

        // Add components to header panel
        // Add components to main panel
        JPanel mainLabelPanel = new JPanel();
        mainLabelPanel.setLayout(new BorderLayout());
        mainPanel.add(mainLabelPanel, BorderLayout.CENTER);
        mainPanel.add(sidebar, BorderLayout.WEST);
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Add main panel to frame
        add(mainPanel);

        // Show frame
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestForm();
    }
}





