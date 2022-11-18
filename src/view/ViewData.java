/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.User;

/**
 *
 * @author Arvin Situmorang
 */
public class ViewData implements ActionListener{

    JFrame frame;
    JComboBox pengguna, button;
    JTable table;
    JButton button1, button2, button3;

    public ViewData() {

        frame = new JFrame();
        frame.setSize(400, 400);

        String data[][] = {{"101", "Amit", "When", "Okay"}};
        String kolom[] = {"Email", "Name", "Password", "Photo"};

        table = new JTable(data, kolom);
        table.setBounds(100, 150, 150, 200);

        JScrollPane scroll = new JScrollPane(table);

        
        
        button1 = new JButton();
        button1.setText("Nama Kategori User");
        button1.setBounds(10, 350, 100, 50);
        button1.addActionListener(this);
        button1.setVerticalAlignment(JButton.CENTER);
        button1.setHorizontalAlignment(JButton.CENTER);

        button2 = new JButton();
        button2.setText("Search");
        button2.setBounds(120, 350, 100, 50);
        button2.addActionListener(this);
        button2.setVerticalAlignment(JButton.CENTER);
        button2.setHorizontalAlignment(JButton.CENTER);
        
        button3 = new JButton();
        button3.setText("Search");
        button3.setBounds(120, 350, 100, 50);
        button3.addActionListener(this);
        button3.setVerticalAlignment(JButton.CENTER);
        button3.setHorizontalAlignment(JButton.CENTER);
        
        frame.add(scroll);
        frame.add(button1);
        frame.add(button2);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ViewData();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button3) {
            frame.dispose();
            new MainMenu();
        }
    }

}
