/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.ViewData;
import main.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Arvin Situmorang
 */
public class Login implements ActionListener {
    
    JFrame frameLogin;
    JButton button1;
    JButton button2;
    JTextField textFieldName;
    JPasswordField textFieldPassword;

    public Login() {
        frameLogin = new JFrame();
        
        ImageIcon image = new ImageIcon(getClass().getResource("google.png"));
        frameLogin.setIconImage(image.getImage());
        frameLogin.setSize(500, 500);
        
        JLabel labelName = new JLabel();
        labelName.setIcon(image);
        labelName.setText("Enter your email address:");
        labelName.setBounds(10, 30, 200, 100);

        
        textFieldName = new JTextField();
        textFieldName.setBounds(10, 100, 200, 30);
        
        JLabel labelPassword = new JLabel("Enter your password:");
        labelPassword.setBounds(10, 150, 200, 100);
        
        textFieldPassword = new JPasswordField();
        textFieldPassword.setBounds(10, 220, 200, 30);
        
        button1 = new JButton();
        button1.setText("Login");
        button1.setBounds(10, 300, 100, 50);
        button1.addActionListener(this);
        button1.setVerticalAlignment(JButton.CENTER);
        button1.setHorizontalAlignment(JButton.CENTER);
        
        button2 = new JButton();
        button2.setText("Back");
        button2.setBounds(120, 300, 100, 50);
        button2.addActionListener(this);
        button2.setVerticalAlignment(JButton.CENTER);
        button2.setHorizontalAlignment(JButton.CENTER);
        
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setLayout(null);
        frameLogin.add(labelName);
        frameLogin.add(textFieldName);
        frameLogin.add(labelPassword);
        frameLogin.add(textFieldPassword);
        frameLogin.add(button1);
        frameLogin.add(button2);
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLogin.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (textFieldName.getText().isEmpty() || textFieldPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in your email & password first!");
            } else {
                JOptionPane.showMessageDialog(null, "Successfully logged in!");
                new ViewData();
            }
        } else {
            frameLogin.dispose();
            new MainMenu();
        }
    }
}
