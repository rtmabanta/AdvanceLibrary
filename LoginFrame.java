import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public LoginFrame() {
		setTitle("Login ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library Management Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel.setBounds(133, 11, 177, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(57, 69, 66, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(67, 102, 56, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AdminWel = textField.getText(); // the variable set  for text field 
				String AdminWelcome = passwordField.getText(); // the variable set for password field
				
				if(AdminWel.equals("Admin_01") && AdminWelcome.equals("AdminOne") || 
						   AdminWel.equals("Admin_02") && AdminWelcome.equals("AdminTwo") || 
						   AdminWel.equals("Admin_03") && AdminWelcome.equals("AdminThree")) 
						{
							
							int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
							if(success == JOptionPane.OK_OPTION) {
								WelcomeFrame welcMessage = new WelcomeFrame();
								welcMessage.setVisible(true);
								dispose();
							}
						}
						else if(!(AdminWel.equals("Admin_01")) && AdminWelcome.equals("AdminOne") ||
								!(AdminWel.equals("Admin_02")) && AdminWelcome.equals("AdminTwo") ||
								!(AdminWel.equals("Admin_03")) && AdminWelcome.equals("AdminThree")) 
						{
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								LoginFrame Log = new LoginFrame(); 
								Log.setVisible(true);
								dispose();
							}
						}
						else if(AdminWel.equals("Admin_01") && !(AdminWelcome.equals("AdminOne")) ||
								AdminWel.equals("Admin_02") && !(AdminWelcome.equals("AdminTwo")) ||
								AdminWel.equals("Admin_03") && !(AdminWelcome.equals("AdminThree"))) 
						{
							int Incorrect = JOptionPane.showConfirmDialog(null,"PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								LoginFrame Log = new LoginFrame(); 
								Log.setVisible(true);
								dispose();
							}
						}
						else if(!(AdminWel.equals("Admin_01")) && !(AdminWelcome.equals("AdminOne")) ||
								!(AdminWel.equals("Admin_02")) && !(AdminWelcome.equals("AdminTwo")) ||
								!(AdminWel.equals("Admin_03")) && !(AdminWelcome.equals("AdminThree"))) 
						{
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME AND PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								LoginFrame Log = new LoginFrame(); 
								Log.setVisible(true);
								dispose();
											}
										}
			}
		});
		btnNewButton.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		btnNewButton.setBounds(133, 172, 69, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(133, 70, 177, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 103, 177, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFramePage prev = new LoginFramePage(); // this will direct to the main page which is the log in interface
				prev.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(244, 172, 69, 23);
		contentPane.add(btnNewButton_1);
		
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
		chckbxNewCheckBox.setBounds(169, 130, 97, 23);
		contentPane.add(chckbxNewCheckBox);
	}

}
