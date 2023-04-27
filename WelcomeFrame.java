import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WelcomeFrame extends JFrame {

	private JPanel contentPane;
	private Image img_logo = new ImageIcon(WelcomeFrame.class.getResource("assets/NU_seal.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);

	public WelcomeFrame() {
		setTitle("WELCOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to NU Library System");
		lblNewLabel.setVerifyInputWhenFocusTarget(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(59, 127, 308, 49);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // this will allow the button to direct back to the Admin Login
				StaffLogin previous = new StaffLogin(); 
				previous.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(177, 196, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(148, 26, 140, 90);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(img_logo));
		setLocationRelativeTo(null);
		
	}

}
