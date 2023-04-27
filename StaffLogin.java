import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StaffLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public StaffLogin() {
		setTitle("Library Staff");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Librarian Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(154, 11, 112, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 71, 54, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 71, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(73, 114, 54, 21);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 114, 167, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SignIn = textField.getText(); // the variable set for the user text field
				String Enter = passwordField.getText(); // the variable set for the password field of the user
			
			
				
				if(SignIn.equals("Librarian_01") && Enter.equals("LibOne") ||
						SignIn.equals("Librarian_02") && Enter.equals("LibTwo") ||
						SignIn.equals("Librarian_03") && Enter.equals("LibThree")) 
				{
					
						int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
						if(success == JOptionPane.OK_OPTION) {
							BookFramePage libro = new BookFramePage();
							libro.setVisible(true);
							dispose();
						}		
						
				}
				else if(!(SignIn.equals("Librarian_01")) && Enter.equals("LibOne") ||
					    !(SignIn.equals("Librarian_02")) && Enter.equals("LibTwo") ||
					    !(SignIn.equals("Librarian_03")) && Enter.equals("LibThree")) 
				{
					    
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								StaffLogin Log = new StaffLogin();
								Log.setVisible(true);
								dispose();
							}
				}
				else if(SignIn.equals("Librarian_01") && !(Enter.equals("LibOne")) ||
						SignIn.equals("Librarian_02") && !(Enter.equals("LibTwo")) ||
						SignIn.equals("Librarian_03") && !(Enter.equals("LibThree"))) 
				{	
					
							int Incorrect = JOptionPane.showConfirmDialog(null,"PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
								if(Incorrect == JOptionPane.OK_OPTION) {
									StaffLogin Sign = new StaffLogin();
									Sign.setVisible(true);
									dispose();
						}
					
				}
				else if(!(SignIn.equals("Librarian_01")) && !(Enter.equals("LibOne")) ||
						!(SignIn.equals("Librarian_02")) && !(Enter.equals("LibTwo")) ||
					    !(SignIn.equals("Librarian_03")) && !(Enter.equals("LibThree"))) 
			 	{
				 	int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME AND PASSWORD INCORRECT","",JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) { 
						StaffLogin Sign = new StaffLogin(); 
						Sign.setVisible(true); 
						dispose(); 
				}
			}
			}
		});
		btnNewButton.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		btnNewButton.setBounds(136, 196, 73, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Pass");
		chckbxNewCheckBox.setBackground(new Color(0, 153, 255));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) { // the purpose of this check box is to let the user see its password when checked
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(173, 141, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFramePage Back = new LoginFramePage(); // this will allow the button to be directed back to the login interface
				Back.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(230, 196, 73, 23);
		contentPane.add(btnNewButton_1);
	}

}
