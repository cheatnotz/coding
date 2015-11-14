import javax.swing.*;

import java.awt.event.*;


public class Problem2 {

	public static void main(String[] args) {
		
		//create guessEngine with 10 doors
		final Guess guessEngine = new Guess(10);
		
		//setup GUI
		JFrame frame = new JFrame("Problem2");
		frame.setBounds(100,100,300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel titleLabel = new JLabel("Guess Game");
		titleLabel.setBounds(10,10,200,30);
		frame.add(titleLabel);
		
		JLabel inputLabel = new JLabel("Guess a number:");
		inputLabel.setBounds(10,30,200,30);
		frame.add(inputLabel);
		
		final JTextField inputTextField = new JTextField();
		inputTextField.setBounds(10,60,280,30);
		frame.add(inputTextField);
		
		JButton submitButton = new JButton("Guess");
		submitButton.setBounds(50,100,200,30);
		frame.add(submitButton);
		
		submitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
						int doorNumber = Integer.parseInt(inputTextField.getText());
						boolean result = guessEngine.tryOpenDoor(doorNumber);
						if(result){
							JOptionPane.showMessageDialog(
									null,
									"Your guess is CORRECT!!!",
									"Answer",
									JOptionPane.INFORMATION_MESSAGE);
						}else{
							JOptionPane.showMessageDialog(
									null,
									"Your guess is WRONG. Try again.",
									"Answer",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				catch (NumberFormatException e1){
					JOptionPane.showMessageDialog(
							null,
							"Error: Integer value only.",
							"Error",
							JOptionPane.ERROR_MESSAGE
							);
				}
				
				catch (ArrayIndexOutOfBoundsException e1){
					JOptionPane.showMessageDialog(
							null,
							"Error: invalid door number. (0 <= doorNumber <= 9)",
							"Error",
							JOptionPane.ERROR_MESSAGE
							);
					
				}
			}
		});
		frame.setVisible(true);


	}

}
