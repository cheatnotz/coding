package org.application;

// import
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    // Create frame
        final JFrame frame = new JFrame();
        frame.setTitle("OOP: Week08");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 350, 350);
        frame.setLayout(null);

        // create components
        JLabel FirstName = new JLabel("First Name");
        frame.add(FirstName);
        FirstName.setBounds(20, 20, 100, 20);

        final JTextField FirstNameInput = new JTextField();
        frame.add(FirstNameInput);
        FirstNameInput.setBounds(120, 22, 200, 20);

        JLabel LastName = new JLabel("Last Name");
        frame.add(LastName);
        LastName.setBounds(20, 45, 100, 20);

        final JTextField LastNameInput = new JTextField();
        frame.add(LastNameInput);
        LastNameInput.setBounds(120, 47, 200, 20);

        JLabel Email = new JLabel("Email");
        frame.add(Email);
        Email.setBounds(20, 70, 100, 20);

        final JTextField EmailInput = new JTextField();
        frame.add(EmailInput);
        EmailInput.setBounds(120, 72, 200, 20);

        JLabel Gender = new JLabel("Gender");
        frame.add(Gender);
        Gender.setBounds(20, 95, 100, 20);

        JRadioButton Male = new JRadioButton("Male");
        frame.add(Male);
        Male.setBounds(120, 97, 70, 20);

        final JRadioButton Female = new JRadioButton("Female");
        frame.add(Female);
        Female.setBounds(192, 97, 100, 20);

        ButtonGroup GenderGroup = new ButtonGroup();
        GenderGroup.add(Male);
        GenderGroup.add(Female);
        Male.setSelected(true);

        JLabel Address = new JLabel("Address");
        frame.add(Address);
        Address.setBounds(20, 130, 100, 20);

        final JTextArea AddressInput = new JTextArea();
        frame.add(AddressInput);
        AddressInput.setBounds(20, 150, 300, 70);

        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);
        submitButton.setBounds(105, 250, 120, 50);

        // Action
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Getting input
                int multiplier = 1;

                // Prepare multiplication table
                int isGender = 1;
                if(Female.isSelected()) isGender = 2;

                String genderMsg = "Mr.";
                if(isGender == 2) genderMsg = "Mrs.";

                // Create Message
                JOptionPane.showMessageDialog(
                        frame,
                        String.format("%s %s %s (%s)\n%s", genderMsg, FirstNameInput.getText(), LastNameInput.getText(), EmailInput.getText(), AddressInput.getText()),
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // Show
        frame.setVisible(true);

    }
}
