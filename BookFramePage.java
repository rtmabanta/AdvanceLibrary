import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class BookFramePage extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;

	private static int num1Copies = 2; // Copies of books
	private static int num2Copies = 3;
	private static int num3Copies = 5;

	private static boolean disposeFrame = false;

	private static JLabel lblNewLabel_9 = new JLabel(Integer.toString(num1Copies)); // the number of copies
	private static JLabel lblNewLabel_10 = new JLabel(Integer.toString(num2Copies));
	private static JLabel lblNewLabel_11 = new JLabel(Integer.toString(num3Copies));

	public BookFramePage() {
		setTitle("Available Books");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title of Books");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 120, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("System Analysis and Design");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 32, 178, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Android Application");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 47, 188, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Programming Concepts and Logic Formulation");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 63, 265, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Authors");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(258, 14, 46, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Gary B. Shelly");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(258, 32, 120, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Corinne Hoisington");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setBounds(258, 47, 120, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Rosauro E. Manuel\r\n\r\n");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(258, 63, 120, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Number of copies of the book");
		lblNewLabel_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setBounds(370, 12, 200, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(429, 32, 46, 14);
		contentPane.add(lblNewLabel_9);

		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(429, 45, 46, 14);
		contentPane.add(lblNewLabel_10);

		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(429, 57, 46, 14);
		contentPane.add(lblNewLabel_11);

		textField = new JTextField();
		textField.setBounds(366, 140, 51, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Choices of books:");
		lblNewLabel_12.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setBounds(576, 11, 110, 14);
		contentPane.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("0");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(609, 32, 39, 14);
		contentPane.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("1");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(609, 45, 39, 14);
		contentPane.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("2");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(609, 57, 39, 14);
		contentPane.add(lblNewLabel_15);

		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // the action for the button is set to submit the choices of the user

				String text = textField.getText();

				if (text.equals("0") && num1Copies < 1) {
					JOptionPane.showMessageDialog(null, "No copies available.", "", JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
				} else if (text.equals("1") && num2Copies < 1) {
					JOptionPane.showMessageDialog(null, "No copies available.", "", JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
				} else if (text.equals("2") && num3Copies < 1) {
					JOptionPane.showMessageDialog(null, "No copies available.", "", JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
				}

				if (textField == null) {
					JOptionPane.showMessageDialog(null, "Please select a book", "Select",
							JOptionPane.INFORMATION_MESSAGE);
				}

				if (text.equals("0") && num1Copies >= 1) {
					num1Copies -= 1;
					lblNewLabel_9.setText(Integer.toString(num1Copies));
					JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					rentAgain();
				} else if (text.equals("1") && num2Copies >= 1) {
					num2Copies -= 1;
					lblNewLabel_10.setText(Integer.toString(num2Copies));
					JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					rentAgain();
				} else if (text.equals("2") && num3Copies >= 1) {
					num3Copies -= 1;
					lblNewLabel_11.setText(Integer.toString(num3Copies));
					JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					rentAgain();
				} else if (text.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter your choice of book", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (!(text.equals("0")) && !(text.equals("1")) && !(text.equals("2")) && !(text.equals(""))) {
					JOptionPane.showMessageDialog(null, "Invalid Input, please try again", "Invalid",
							JOptionPane.INFORMATION_MESSAGE);
					textField.setText(""); // this code is to show a message or dialog to the user if they had an invalid choice 
				}
				if (disposeFrame) {
					dispose();
				}
			}
		});

		btnNewButton.setBounds(232, 197, 185, 30);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_16 = new JLabel("Choice of Book:");
		lblNewLabel_16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_16.setBounds(232, 147, 100, 14);
		contentPane.add(lblNewLabel_16);

		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnNewButton_1.setBounds(232, 243, 185, 30);
		contentPane.add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin call = new StaffLogin();
				call.show();
				dispose();
			}
		});
	}

	public static void rentAgain() {
		int choice = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Confirmation",
				JOptionPane.YES_NO_OPTION);
		if (choice == JOptionPane.YES_OPTION) {
			textField.setText("");
		} else {
			LoginFramePage call = new LoginFramePage();
			call.show();
			disposeFrame = true;
		}
	}

}
