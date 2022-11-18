/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import main.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.*;
import controller.*;

/**
 *
 * @author Arvin Situmorang
 */
public class Register implements ActionListener {

    JFrame frameRegister;
    JTextField textFieldEmail;
    JTextField textFieldName;
    JRadioButton radioButtonL, radioButtonP;
    JFileChooser photo;
    JComboBox category;
    JButton buttonRegister;
    JButton buttonBack;
    ButtonGroup bg;

    User user = new User();

    public Register() {
        frameRegister = new JFrame();
        frameRegister.setSize(500, 500);

        JLabel labelEmail = new JLabel();
        labelEmail.setText("Enter your email address:");
        labelEmail.setBounds(10, 0, 200, 100);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(10, 70, 200, 30);

        JLabel labelName = new JLabel();
        labelName.setText("Enter your username:");
        labelName.setBounds(10, 90, 200, 100);

        textFieldName = new JTextField();
        textFieldName.setBounds(10, 160, 200, 30);

        JLabel labelGender = new JLabel("Choose your gender:");
        labelGender.setBounds(10, 180, 200, 100);

        radioButtonL = new JRadioButton("L");
        radioButtonL.setBounds(10, 250, 40, 30);
        radioButtonL.setActionCommand("L");

        radioButtonP = new JRadioButton("P");
        radioButtonP.setBounds(50, 250, 40, 30);
        radioButtonP.setActionCommand("P");

        bg = new ButtonGroup();
        bg.add(radioButtonL);
        bg.add(radioButtonP);
        

        photo = new JFileChooser("C:\\Users\\Arvin Situmorang\\Downloads\\");
        //photo.showSaveDialog(null);

        String[] account = {"Private Account", "Creator Account", "Business Account"};
        category = new JComboBox(account);
        category.setBounds(10, 310, 200, 30);

        buttonRegister = new JButton();
        buttonRegister.setText("Register");
        buttonRegister.setBounds(10, 370, 90, 50);
        buttonRegister.addActionListener(this);
        buttonRegister.setVerticalAlignment(JButton.CENTER);
        buttonRegister.setHorizontalAlignment(JButton.CENTER);

        buttonBack = new JButton();
        buttonBack.setText("Back");
        buttonBack.setBounds(120, 370, 90, 50);
        buttonBack.addActionListener(this);
        buttonBack.setVerticalAlignment(JButton.CENTER);
        buttonBack.setHorizontalAlignment(JButton.CENTER);

        frameRegister.setResizable(false);
        frameRegister.setLocationRelativeTo(null);
        frameRegister.setLayout(null);
        frameRegister.add(labelEmail);
        frameRegister.add(textFieldEmail);
        frameRegister.add(labelName);
        frameRegister.add(textFieldName);
        frameRegister.add(labelGender);
        frameRegister.add(radioButtonL);
        frameRegister.add(radioButtonP);
        frameRegister.add(photo);
        frameRegister.add(category);
        frameRegister.add(buttonRegister);
        frameRegister.add(buttonBack);
        frameRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRegister.setVisible(true);

    }

    public static void main(String[] args) {
        new Register();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == buttonBack) {
            frameRegister.dispose();
            new MainMenu();
        } else if (ae.getSource() == buttonRegister) {
            if (textFieldEmail.getText().equals("") || textFieldName.getText().equals("") || category.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!", "Register", JOptionPane.ERROR_MESSAGE);
            } else {
                user.setUserId(4);
                user.setUserName(textFieldName.getText());
                user.setUserEmail(textFieldEmail.getText());
                user.setUserGender(bg.getSelection().getActionCommand());
                user.setUserCategory(category.getSelectedItem().toString());
                user.setUserFollowers(450);

                Controller con = new Controller();
                con.insertNewUser(user);
                JOptionPane.showMessageDialog(null, "Successfully registered! Please log in..", "Register", JOptionPane.INFORMATION_MESSAGE);
                frameRegister.dispose();
                new Login();
            }
        }

    }

}
