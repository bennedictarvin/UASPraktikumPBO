/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import view.ViewData;

/**
 *
 * @author Arvin Situmorang
 */
public class MainMenu implements ActionListener {

    JFrame frameHome;
    JButton button1;
    JButton button2;
    JButton button3;

    public MainMenu() {
        
        frameHome = new JFrame("Main Menu");
        frameHome.setSize(500, 300);
        frameHome.getContentPane().setBackground(new Color(255, 239, 146));

        button1 = new JButton("Login");
        button1.setBounds(75, 20, 350, 50);
        button1.addActionListener(this);
//        button1.setLayout(new FlowLayout(FlowLayout.CENTER));
//        button1.setVerticalAlignment(JButton.CENTER);
//        button1.setHorizontalAlignment(JButton.CENTER);

        button2 = new JButton("Registrasi Pengguna Baru");
        button2.setBounds(75, 100, 350, 50);
        button2.addActionListener(this);
//        button2.setVerticalAlignment(JButton.CENTER);
//        button2.setHorizontalAlignment(JButton.CENTER);

        button3 = new JButton();
        button3.setText("Lihat Data Pengguna Berdasarkan Kategori");
        button3.setBounds(75, 180, 350, 50);
        button3.addActionListener(this);
//        button3.setVerticalAlignment(JButton.TOP);
//        button3.setHorizontalAlignment(JButton.CENTER);
        
        frameHome.add(button1);
        frameHome.add(button2);
        frameHome.add(button3);
        
        frameHome.setLayout(null);
        frameHome.setResizable(false);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHome.setLocationRelativeTo(null);
        frameHome.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            frameHome.dispose();
            new Login();
        } else if (e.getSource() == button2) {
            frameHome.dispose();
            new Register();
        } else {
            frameHome.dispose();
            new ViewData();
        }
    }
    
    public static void main(String[] args) {
        new MainMenu();
    }
}
