import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFramePage extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFramePage frame = new LoginFramePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */


	public LoginFramePage() {
		setTitle("Main Library");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library Management Login");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(97, 23, 294, 58);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADMIN"); // this button is for the Administrator log in 
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // this code is for the button and it will direct the user to the admin log in interface
				LoginFrame log = new LoginFrame();
				log.setVisible(true); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnNewButton.setBounds(97, 95, 120, 58);
		contentPane.add(btnNewButton);
		
		JButton btnLibrarian = new JButton("LIBRARIAN");
		btnLibrarian.setBackground(new Color(255, 204, 0));
		btnLibrarian.setBorder(null);
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // this will direct to the librarian log in page
				StaffLogin sign = new StaffLogin();
				sign.setVisible(true);
				dispose();
			}
		});
		btnLibrarian.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnLibrarian.setBounds(271, 95, 120, 58);
		contentPane.add(btnLibrarian);
	}

}
